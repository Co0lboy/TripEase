package com.example.tripease.dto.request;

import com.example.tripease.Enum.Gender;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor   //default constructor
@AllArgsConstructor  //all arg constructor
@Getter
@Setter
public class CustomerRequest {
    private String name;
    private int age;
    private String emailId;
    private Gender gender;
}
