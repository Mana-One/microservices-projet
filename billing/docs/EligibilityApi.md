# EligibilityApi

All URIs are relative to *https://api.esgi.fr/billing/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**readEligibility**](EligibilityApi.md#readEligibility) | **GET** /eligibility/{customerRef} | Rerieves Eligibility status |


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
import org.openapitools.client.api.EligibilityApi;

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

    EligibilityApi apiInstance = new EligibilityApi(defaultClient);
    String customerRef = "CUSTOMER NUMBER"; // String | External reference of the buyer
    try {
      EligibilityResponse result = apiInstance.readEligibility(customerRef);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EligibilityApi#readEligibility");
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

