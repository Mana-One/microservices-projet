package org.openapitools.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class ContractService {
    private static final String TOPIC_NAME = "topic";

    private final KafkaTemplate<String, String> kafkaTemplate;

    public ContractService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void createContract() {
        String contractId = UUID.randomUUID().toString();
        log.info("Contract created: {}", contractId);
        kafkaTemplate.send(TOPIC_NAME, contractId);
    }
}
