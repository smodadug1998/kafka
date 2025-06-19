//package com.demo.producer;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RequiredArgsConstructor
//@RestController
//@RequestMapping("/api")
//public class KafkaProducer {
//
//    private final KafkaTemplate<String, RiderLocation> kafkaTemplate;
//
//    @PostMapping("/send")
//    public String sendMessage(@RequestParam String message) {
//        RiderLocation riderLocation = new RiderLocation("rider123",288.335,0351.03451);
//        kafkaTemplate.send("my-topic-new", riderLocation);
//        return "Message sent: " + riderLocation.getRiderid();
//    }
//}
