package org.openapitools.client;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Controller;

@Controller
public class BillingController {
    private static final String TOPIC_NAME = "topic";

    private final BillingService billingService;

    public BillingController(BillingService billingService) {
        this.billingService = billingService;
    }

    @KafkaListener(topics = TOPIC_NAME, groupId = "my-group-id")
    public void listen(String message) {
        billingService.createBilling(message);
    }
}
