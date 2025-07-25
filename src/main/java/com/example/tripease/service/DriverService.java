package com.example.tripease.service;

import com.example.tripease.dto.request.DriverRequest;
import com.example.tripease.dto.response.DriverResponse;
import com.example.tripease.model.Driver;
import com.example.tripease.repository.DriverRepository;
import com.example.tripease.transformer.DriverTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverService {

    @Autowired
    DriverRepository driverRepository;

    public DriverResponse addDriver(DriverRequest driverRequest) {
        //driver request to driver
        Driver driver= DriverTransformer.driverRequestToDriver(driverRequest);

        //saved into data
       Driver savedDriver=driverRepository.save(driver);

       // entity to DriverResponse
        return DriverTransformer.driverToDriverResponse(savedDriver);
    }
}
