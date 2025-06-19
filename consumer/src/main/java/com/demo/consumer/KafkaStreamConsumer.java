package com.demo.consumer;

import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class KafkaStreamConsumer {
        public Consumer<RiderLocation> processRiderLocation() {
            return location -> {
                System.out.println("Received Location: " + location.getRiderid()+" : "+location.getLatitude());
            };
        }
}
