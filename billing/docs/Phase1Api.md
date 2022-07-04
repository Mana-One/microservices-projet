# Phase1Api

All URIs are relative to *https://api.esgi.fr/billing/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSubscription**](Phase1Api.md#getSubscription) | **GET** /subscriptions/{subscriptionRef} | Read Subscription |
| [**operationsPost**](Phase1Api.md#operationsPost) | **POST** /operations | Add Operations |
| [**patchOperation**](Phase1Api.md#patchOperation) | **PUT** /operations | Patch Operations |
| [**patchSubscription**](Phase1Api.md#patchSubscription) | **PUT** /subscriptions/{subscriptionRef} | Patch Subscription |
| [**postSubscription**](Phase1Api.md#postSubscription) | **POST** /subscriptions | Add Subscriptions |
| [**readEligibility**](Phase1Api.md#readEligibility) | **GET** /eligibility/{customerRef} | Rerieves Eligibility status |
| [**searchSubscriptions**](Phase1Api.md#searchSubscriptions) | **GET** /subscriptions | Search Subscriptions |


<a name="getSubscription"></a>
# **getSubscription**
> SubscriptionResponse getSubscription(subscriptionRef)

Read Subscription

Get an existing Subscription

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Phase1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.esgi.fr/billing/v1");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    Phase1Api apiInstance = new Phase1Api(defaultClient);
    String subscriptionRef = "SUB-YTYE65687"; // String | External identifier of the subscription
    try {
      SubscriptionResponse result = apiInstance.getSubscription(subscriptionRef);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Phase1Api#getSubscription");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **subscriptionRef** | **String**| External identifier of the subscription | |

### Return type

[**SubscriptionResponse**](SubscriptionResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | ERROR - Not authenticated |  -  |
| **403** | ERROR - Access token does not have the required scope |  -  |
| **500** | ERROR - Internal Server error |  -  |

<a name="operationsPost"></a>
# **operationsPost**
> OperationResponse operationsPost(operationRequest)

Add Operations

Add a new Operation to deferred billing

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Phase1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.esgi.fr/billing/v1");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    Phase1Api apiInstance = new Phase1Api(defaultClient);
    OperationRequest operationRequest = new OperationRequest(); // OperationRequest | 
    try {
      OperationResponse result = apiInstance.operationsPost(operationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Phase1Api#operationsPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **operationRequest** | [**OperationRequest**](OperationRequest.md)|  | [optional] |

### Return type

[**OperationResponse**](OperationResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Operation successfully added |  -  |
| **401** | ERROR - Not authenticated |  -  |
| **403** | ERROR - Access token does not have the required scope |  -  |
| **500** | ERROR - Internal Server error |  -  |

<a name="patchOperation"></a>
# **patchOperation**
> SubscriptionResponse patchOperation(orderRef, operationRequest)

Patch Operations

Update an existing operation (usecase cancelling)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Phase1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.esgi.fr/billing/v1");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    Phase1Api apiInstance = new Phase1Api(defaultClient);
    String orderRef = "444e4567-e89b-12d3-a456-556642440000"; // String | Order extrenal Reference
    OperationRequest operationRequest = new OperationRequest(); // OperationRequest | 
    try {
      SubscriptionResponse result = apiInstance.patchOperation(orderRef, operationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Phase1Api#patchOperation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderRef** | **String**| Order extrenal Reference | [optional] |
| **operationRequest** | [**OperationRequest**](OperationRequest.md)|  | [optional] |

### Return type

[**SubscriptionResponse**](SubscriptionResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | ERROR - Invalid object request |  -  |
| **401** | ERROR - Not authenticated |  -  |
| **403** | ERROR - Access token does not have the required scope |  -  |
| **500** | ERROR - Internal Server error |  -  |

<a name="patchSubscription"></a>
# **patchSubscription**
> SubscriptionResponse patchSubscription(subscriptionRef, subscriptionRequest)

Patch Subscription

Update an existing Subscription

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Phase1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.esgi.fr/billing/v1");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    Phase1Api apiInstance = new Phase1Api(defaultClient);
    String subscriptionRef = "SUB-YTYE65687"; // String | External identifier of the subscription
    SubscriptionRequest subscriptionRequest = new SubscriptionRequest(); // SubscriptionRequest | 
    try {
      SubscriptionResponse result = apiInstance.patchSubscription(subscriptionRef, subscriptionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Phase1Api#patchSubscription");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **subscriptionRef** | **String**| External identifier of the subscription | |
| **subscriptionRequest** | [**SubscriptionRequest**](SubscriptionRequest.md)|  | [optional] |

### Return type

[**SubscriptionResponse**](SubscriptionResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | ERROR - Invalid object request |  -  |
| **401** | ERROR - Not authenticated |  -  |
| **403** | ERROR - Access token does not have the required scope |  -  |
| **500** | ERROR - Internal Server error |  -  |

<a name="postSubscription"></a>
# **postSubscription**
> SubscriptionResponse postSubscription(subscriptionRequest)

Add Subscriptions

Add a new Subscription

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Phase1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.esgi.fr/billing/v1");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    Phase1Api apiInstance = new Phase1Api(defaultClient);
    SubscriptionRequest subscriptionRequest = new SubscriptionRequest(); // SubscriptionRequest | 
    try {
      SubscriptionResponse result = apiInstance.postSubscription(subscriptionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Phase1Api#postSubscription");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **subscriptionRequest** | [**SubscriptionRequest**](SubscriptionRequest.md)|  | [optional] |

### Return type

[**SubscriptionResponse**](SubscriptionResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | SUCCESS - Subscription created |  -  |
| **400** | ERROR - Invalid object request |  -  |
| **401** | ERROR - Not authenticated |  -  |
| **403** | ERROR - Access token does not have the required scope |  -  |
| **500** | ERROR - Internal Server error |  -  |

<a name="readEligibility"></a>
# **readEligibility**
> EligibilityResponse readEligibility(customerRef)

Rerieves Eligibility status

Gives the status of customers with respect to the subscription. Ccontract and payment information are checked.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Phase1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.esgi.fr/billing/v1");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    Phase1Api apiInstance = new Phase1Api(defaultClient);
    String customerRef = "CUSTOMER NUMBER"; // String | External reference of the buyer
    try {
      EligibilityResponse result = apiInstance.readEligibility(customerRef);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Phase1Api#readEligibility");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerRef** | **String**| External reference of the buyer | |

### Return type

[**EligibilityResponse**](EligibilityResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | SUCCESS - Returns list of status |  -  |
| **401** | ERROR - Not authenticated |  -  |
| **403** | ERROR - Access token does not have the required scope |  -  |
| **500** | ERROR - Internal Server error |  -  |

<a name="searchSubscriptions"></a>
# **searchSubscriptions**
> SubscriptionsResponse searchSubscriptions(contractRef, customerRef, contractStatus, limit, offset)

Search Subscriptions

Multi-criteria search for subscriptions. The result is a list (maybe empty) of subscriptions

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Phase1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.esgi.fr/billing/v1");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    Phase1Api apiInstance = new Phase1Api(defaultClient);
    String contractRef = "CTR-671675563"; // String | External identifier of the deferred billing contract for the customer
    String customerRef = "CUSTOMER REF"; // String | External identifier of the buyer
    String contractStatus = "ACTIVE"; // String | Contract Status
    Integer limit = 10; // Integer | Limits the number of items on a page
    Integer offset = 1; // Integer | Specifies the page number of the list to be displayed
    try {
      SubscriptionsResponse result = apiInstance.searchSubscriptions(contractRef, customerRef, contractStatus, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Phase1Api#searchSubscriptions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contractRef** | **String**| External identifier of the deferred billing contract for the customer | [optional] |
| **customerRef** | **String**| External identifier of the buyer | [optional] |
| **contractStatus** | **String**| Contract Status | [optional] |
| **limit** | **Integer**| Limits the number of items on a page | [optional] |
| **offset** | **Integer**| Specifies the page number of the list to be displayed | [optional] |

### Return type

[**SubscriptionsResponse**](SubscriptionsResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | SUCCESS - Returns a list of Subscriptions |  -  |
| **401** | ERROR - Not authenticated |  -  |
| **403** | ERROR - Access token does not have the required scope |  -  |
| **500** | ERROR - Internal Server error |  -  |

