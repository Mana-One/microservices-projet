package org.openapitools.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BillingService {

    public void createBilling(String contractId) {
        log.info("Billing created with contractId: {}", contractId);
    }
}
