package com.example.tripease.service;
import com.example.tripease.dto.request.BookingRequest;
import com.example.tripease.dto.response.BookingResponse;
import com.example.tripease.exception.CabUnavailableException;
import com.example.tripease.exception.CustomerNotFoundException;
import com.example.tripease.model.Booking;
import com.example.tripease.model.Cab;
import com.example.tripease.model.Customer;
import com.example.tripease.model.Driver;
import com.example.tripease.repository.BookingRepository;
import com.example.tripease.repository.CabRepository;
import com.example.tripease.repository.CustomerRepository;
import com.example.tripease.repository.DriverRepository;
import com.example.tripease.transformer.BookingTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class BookingService {
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    CabRepository cabRepository;
    @Autowired
    DriverRepository driverRepository;
    @Autowired
    BookingRepository bookingRepository;
    @Autowired
    JavaMailSender javaMailSender;

    public  BookingResponse bookCab(BookingRequest bookingRequest, int customerId) {
        Optional<Customer> optionalCustomer=customerRepository.findById(customerId);
        if(optionalCustomer.isEmpty()){
            throw new CustomerNotFoundException.CustommerNotFoundException("Invalid customer Id");
        }

        Customer customer=optionalCustomer.get();

        Cab avilableCab=cabRepository.getAvailableCabRandomly();
        if(avilableCab==null){
            throw new CabUnavailableException("sorry ! cabs not available");
        }

        Booking booking= BookingTransformer.bookingRequestToBooking(bookingRequest,avilableCab.getPerKmRate());
        Booking savedBooking=bookingRepository.save(booking);

        avilableCab.setAvailable(false);
        customer.getBookings().add(savedBooking);

        Driver driver=driverRepository.getDriverByCabId(avilableCab.getCabId());
        driver.getBookings().add(savedBooking);

        Customer savedCustomer=customerRepository.save(customer);
        Driver savedDriver= driverRepository.save(driver);

        sendEmail(savedCustomer);

        return BookingTransformer.bookingToBookingResponse(savedBooking,savedCustomer,avilableCab,savedDriver);
    }

    private void sendEmail(Customer customer){
        String text="Congralations ! " +customer.getName()+"  Your cab has been booked successfully";

        SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
        simpleMailMessage.setFrom("springprojetsf4u@gmail.com");
        simpleMailMessage.setTo(customer.getEmailId());
        simpleMailMessage.setSubject("CAB booked !");
        simpleMailMessage.setText(text);

        javaMailSender.send(simpleMailMessage);
    }
}
