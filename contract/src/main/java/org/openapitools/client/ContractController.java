package org.openapitools.client;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContractController {

    private final ContractService contractService;

    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }

    @PostMapping("/contracts")
    public ResponseEntity<Void> postContract() {
        contractService.createContract();
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
