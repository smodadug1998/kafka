package com.demo.consumer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class RiderLocation {
    private String riderid;
    private double latitude;
    private double longitude;

}
