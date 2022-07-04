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
import org.openapitools.client.model.EligibilityResponse;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.OperationRequest;
import org.openapitools.client.model.OperationResponse;
import org.openapitools.client.model.SubscriptionRequest;
import org.openapitools.client.model.SubscriptionResponse;
import org.openapitools.client.model.SubscriptionsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for Phase1Api
 */
@Disabled
public class Phase1ApiTest {

    private final Phase1Api api = new Phase1Api();

    /**
     * Read Subscription
     *
     * Get an existing Subscription
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSubscriptionTest() throws ApiException {
        String subscriptionRef = null;
        SubscriptionResponse response = api.getSubscription(subscriptionRef);
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

    /**
     * Patch Subscription
     *
     * Update an existing Subscription
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void patchSubscriptionTest() throws ApiException {
        String subscriptionRef = null;
        SubscriptionRequest subscriptionRequest = null;
        SubscriptionResponse response = api.patchSubscription(subscriptionRef, subscriptionRequest);
        // TODO: test validations
    }

    /**
     * Add Subscriptions
     *
     * Add a new Subscription
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postSubscriptionTest() throws ApiException {
        SubscriptionRequest subscriptionRequest = null;
        SubscriptionResponse response = api.postSubscription(subscriptionRequest);
        // TODO: test validations
    }

    /**
     * Rerieves Eligibility status
     *
     * Gives the status of customers with respect to the subscription. Ccontract and payment information are checked.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void readEligibilityTest() throws ApiException {
        String customerRef = null;
        EligibilityResponse response = api.readEligibility(customerRef);
        // TODO: test validations
    }

    /**
     * Search Subscriptions
     *
     * Multi-criteria search for subscriptions. The result is a list (maybe empty) of subscriptions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchSubscriptionsTest() throws ApiException {
        String contractRef = null;
        String customerRef = null;
        String contractStatus = null;
        Integer limit = null;
        Integer offset = null;
        SubscriptionsResponse response = api.searchSubscriptions(contractRef, customerRef, contractStatus, limit, offset);
        // TODO: test validations
    }

}