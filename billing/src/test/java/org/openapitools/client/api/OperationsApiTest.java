/*
 * Travel Billing
 * The Travel Invoicing Application System
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.OperationRequest;
import org.openapitools.client.model.OperationResponse;
import org.openapitools.client.model.OperationsGet200Response;
import org.openapitools.client.model.SubscriptionResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OperationsApi
 */
@Disabled
public class OperationsApiTest {

    private final OperationsApi api = new OperationsApi();

    /**
     * Returns a list of Operation added to deferred billing
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void operationsGetTest() throws ApiException {
        String subscriptionId = null;
        String invoiceRef = null;
        String customerRef = null;
        String contactRef = null;
        Integer limit = null;
        Integer offset = null;
        OperationsGet200Response response = api.operationsGet(subscriptionId, invoiceRef, customerRef, contactRef, limit, offset);
        // TODO: test validations
    }

    /**
     * Add Operations
     *
     * Add a new Operation to deferred billing
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void operationsPostTest() throws ApiException {
        OperationRequest operationRequest = null;
        OperationResponse response = api.operationsPost(operationRequest);
        // TODO: test validations
    }

    /**
     * Patch Operations
     *
     * Update an existing operation (usecase cancelling)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void patchOperationTest() throws ApiException {
        String orderRef = null;
        OperationRequest operationRequest = null;
        SubscriptionResponse response = api.patchOperation(orderRef, operationRequest);
        // TODO: test validations
    }

}