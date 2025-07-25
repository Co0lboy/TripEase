package com.example.tripease.dto.request;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CabRequest {
    private String cabNumber;
    private String cabModel;
    private double perKmRate;
}
