package com.demo.producer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RiderLocation {
    private String riderid;
    private double latitude;
    private double longitude;

}
