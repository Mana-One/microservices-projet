# SearchReadApi

All URIs are relative to *https://api.esgi.fr/refcontract/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getContract**](SearchReadApi.md#getContract) | **GET** /contracts/{contractRef} | Read a Contract |
| [**searchContracts**](SearchReadApi.md#searchContracts) | **GET** /contracts | Search Contracts |


<a name="getContract"></a>
# **getContract**
> ContractResponse getContract(contractRef)

Read a Contract

Get an existing Contract

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SearchReadApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.esgi.fr/refcontract/v1");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SearchReadApi apiInstance = new SearchReadApi(defaultClient);
    String contractRef = "CTR-671675563"; // String | External identifier of the contract
    try {
      ContractResponse result = apiInstance.getContract(contractRef);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchReadApi#getContract");
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
| **contractRef** | **String**| External identifier of the contract | |

### Return type

[**ContractResponse**](ContractResponse.md)

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

<a name="searchContracts"></a>
# **searchContracts**
> ContractsResponse searchContracts(subscriberRef, contractStatus, limit, offset)

Search Contracts

Multi-criteria search for contracts. The result is a list (maybe empty) of contracts

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SearchReadApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.esgi.fr/refcontract/v1");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SearchReadApi apiInstance = new SearchReadApi(defaultClient);
    String subscriberRef = "CUSTOMER NUMBER"; // String | External identifier of the subscriber
    String contractStatus = "ACTIVE"; // String | Contract Status
    Integer limit = 10; // Integer | Limits the number of items on a page
    Integer offset = 1; // Integer | Specifies the page number of the list to be displayed
    try {
      ContractsResponse result = apiInstance.searchContracts(subscriberRef, contractStatus, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchReadApi#searchContracts");
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
| **subscriberRef** | **String**| External identifier of the subscriber | [optional] |
| **contractStatus** | **String**| Contract Status | [optional] |
| **limit** | **Integer**| Limits the number of items on a page | [optional] |
| **offset** | **Integer**| Specifies the page number of the list to be displayed | [optional] |

### Return type

[**ContractsResponse**](ContractsResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | SUCCESS - Returns a list of Contracts |  -  |
| **401** | ERROR - Not authenticated |  -  |
| **403** | ERROR - Access token does not have the required scope |  -  |
| **500** | ERROR - Internal Server error |  -  |

