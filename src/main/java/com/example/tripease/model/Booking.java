package com.example.tripease.model;

import java.util.*;

import com.example.tripease.Enum.TripStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Builder
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int bookingId;

    String pickup;

    String destination;

    double tripDistanceInKm;

    TripStatus tripStatus;

    double billAmount;

    @CreationTimestamp
    Date bookedAt;

    @UpdateTimestamp
    Date lastUpdateAt;


}
