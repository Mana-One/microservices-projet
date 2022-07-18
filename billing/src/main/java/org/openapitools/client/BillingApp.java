package org.openapitools.client;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class BillingApp implements ApplicationRunner {

    private static final String TOPIC_NAME = "topic";

    @Override
    public void run(ApplicationArguments args) {
    }

    public static void main(String[] args) {
        SpringApplication.run(BillingApp.class, args);
    }

    @KafkaListener(topics = TOPIC_NAME, groupId = "my-group-id")
    public void listen(String message) {
        System.out.println("[Billing] Received message in topic - " + TOPIC_NAME + ": " + message);
    }
}