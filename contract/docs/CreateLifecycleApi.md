# CreateLifecycleApi

All URIs are relative to *https://api.esgi.fr/refcontract/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**patchContract**](CreateLifecycleApi.md#patchContract) | **PATCH** /contracts/{contractRef} | Patch a Contract |
| [**postContract**](CreateLifecycleApi.md#postContract) | **POST** /contracts | Add a Contract |


<a name="patchContract"></a>
# **patchContract**
> patchContract(contractRef, contractActionRequest)

Patch a Contract

Update an existing Contract

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CreateLifecycleApi;

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

    CreateLifecycleApi apiInstance = new CreateLifecycleApi(defaultClient);
    String contractRef = "CTR-671675563"; // String | External identifier of the contract
    ContractActionRequest contractActionRequest = new ContractActionRequest(); // ContractActionRequest | 
    try {
      apiInstance.patchContract(contractRef, contractActionRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreateLifecycleApi#patchContract");
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
| **contractActionRequest** | [**ContractActionRequest**](ContractActionRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | NO_CONTENT |  -  |
| **400** | ERROR - Invalid object request |  -  |
| **401** | ERROR - Not authenticated |  -  |
| **403** | ERROR - Access token does not have the required scope |  -  |
| **500** | ERROR - Internal Server error |  -  |

<a name="postContract"></a>
# **postContract**
> ContractResponse postContract(contractRequest)

Add a Contract

Add a new Contract

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CreateLifecycleApi;

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

    CreateLifecycleApi apiInstance = new CreateLifecycleApi(defaultClient);
    ContractRequest contractRequest = new ContractRequest(); // ContractRequest | 
    try {
      ContractResponse result = apiInstance.postContract(contractRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreateLifecycleApi#postContract");
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
| **contractRequest** | [**ContractRequest**](ContractRequest.md)|  | [optional] |

### Return type

[**ContractResponse**](ContractResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | SUCCESS - Contract created |  -  |
| **400** | ERROR - Invalid object request |  -  |
| **401** | ERROR - Not authenticated |  -  |
| **403** | ERROR - Access token does not have the required scope |  -  |
| **500** | ERROR - Internal Server error |  -  |

