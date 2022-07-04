# SubscriptionsApi

All URIs are relative to *https://api.esgi.fr/billing/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSubscription**](SubscriptionsApi.md#getSubscription) | **GET** /subscriptions/{subscriptionRef} | Read Subscription |
| [**patchSubscription**](SubscriptionsApi.md#patchSubscription) | **PUT** /subscriptions/{subscriptionRef} | Patch Subscription |
| [**postSubscription**](SubscriptionsApi.md#postSubscription) | **POST** /subscriptions | Add Subscriptions |
| [**searchSubscriptions**](SubscriptionsApi.md#searchSubscriptions) | **GET** /subscriptions | Search Subscriptions |


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
import org.openapitools.client.api.SubscriptionsApi;

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

    SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
    String subscriptionRef = "SUB-YTYE65687"; // String | External identifier of the subscription
    try {
      SubscriptionResponse result = apiInstance.getSubscription(subscriptionRef);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#getSubscription");
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
import org.openapitools.client.api.SubscriptionsApi;

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

    SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
    String subscriptionRef = "SUB-YTYE65687"; // String | External identifier of the subscription
    SubscriptionRequest subscriptionRequest = new SubscriptionRequest(); // SubscriptionRequest | 
    try {
      SubscriptionResponse result = apiInstance.patchSubscription(subscriptionRef, subscriptionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#patchSubscription");
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
import org.openapitools.client.api.SubscriptionsApi;

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

    SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
    SubscriptionRequest subscriptionRequest = new SubscriptionRequest(); // SubscriptionRequest | 
    try {
      SubscriptionResponse result = apiInstance.postSubscription(subscriptionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#postSubscription");
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
import org.openapitools.client.api.SubscriptionsApi;

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

    SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
    String contractRef = "CTR-671675563"; // String | External identifier of the deferred billing contract for the customer
    String customerRef = "CUSTOMER REF"; // String | External identifier of the buyer
    String contractStatus = "ACTIVE"; // String | Contract Status
    Integer limit = 10; // Integer | Limits the number of items on a page
    Integer offset = 1; // Integer | Specifies the page number of the list to be displayed
    try {
      SubscriptionsResponse result = apiInstance.searchSubscriptions(contractRef, customerRef, contractStatus, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#searchSubscriptions");
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

