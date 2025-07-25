package com.example.tripease.model;

import com.example.tripease.dto.request.DriverRequest;
import com.example.tripease.dto.response.DriverResponse;
import com.example.tripease.service.DriverService;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="driver")
@Builder
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int driverId;
    private String name;
    private int age;

  @Column(unique = true,nullable = false)
    private String emailId;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="driver_id")
    List<Booking> bookings=new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="cab_id")
    private Cab cab;


}
