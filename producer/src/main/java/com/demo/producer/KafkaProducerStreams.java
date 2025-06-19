package com.demo.producer;


import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;

@RequiredArgsConstructor
@Configuration
public class KafkaProducerStreams {
    @Bean
    public Supplier<RiderLocation> sendRiderLocation() {
        return () -> {
            RiderLocation riderLocation = new RiderLocation("rider123",15413.351,351310.516);
            System.out.println("Sending: " + riderLocation.getRiderid());
            return riderLocation;
        };
    }
}
