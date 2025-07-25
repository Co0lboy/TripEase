package com.example.tripease.dto.response;


import jakarta.persistence.Entity;
import lombok.*;

@NoArgsConstructor   //default constructor
@AllArgsConstructor  //all arg constructor
@Getter
@Setter
@Builder

public class CustomerResponse {
    private String name;
    private int age;
    private String emailId;

}
