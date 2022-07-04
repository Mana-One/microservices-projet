# Phase2Api

All URIs are relative to *https://api.esgi.fr/billing/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**invoicesGet**](Phase2Api.md#invoicesGet) | **GET** /invoices |  |
| [**invoicesInvoiceRefGet**](Phase2Api.md#invoicesInvoiceRefGet) | **GET** /invoices/{invoiceRef} |  |
| [**operationsGet**](Phase2Api.md#operationsGet) | **GET** /operations |  |


<a name="invoicesGet"></a>
# **invoicesGet**
> InvoicesGet200Response invoicesGet(subscriptionId, contractRef, customerRef, contactRef, limit, offset)



Returns a list of Invoices

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Phase2Api;

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

    Phase2Api apiInstance = new Phase2Api(defaultClient);
    String subscriptionId = "123e4567-e89b-12d3-a456-556642440000"; // String | External identifier of subscription
    String contractRef = "CTR-671675563"; // String | External identifier of the deferred billing contract for the customer
    String customerRef = "CUSTOMER REF"; // String | External identifier of the buyer
    String contactRef = "CTR-671675563"; // String | IDExternal identifier of the Customer's contact
    Integer limit = 10; // Integer | Limits the number of items on a page
    Integer offset = 1; // Integer | Specifies the page number of the list to be displayed
    try {
      InvoicesGet200Response result = apiInstance.invoicesGet(subscriptionId, contractRef, customerRef, contactRef, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Phase2Api#invoicesGet");
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
| **subscriptionId** | **String**| External identifier of subscription | [optional] |
| **contractRef** | **String**| External identifier of the deferred billing contract for the customer | [optional] |
| **customerRef** | **String**| External identifier of the buyer | [optional] |
| **contactRef** | **String**| IDExternal identifier of the Customer&#39;s contact | [optional] |
| **limit** | **Integer**| Limits the number of items on a page | [optional] |
| **offset** | **Integer**| Specifies the page number of the list to be displayed | [optional] |

### Return type

[**InvoicesGet200Response**](InvoicesGet200Response.md)

### Authorization

[ApiKey](../README.md#ApiKey), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully returned a list of Invoices |  -  |
| **401** | ERROR - Not authenticated |  -  |
| **403** | ERROR - Access token does not have the required scope |  -  |
| **500** | ERROR - Internal Server error |  -  |

<a name="invoicesInvoiceRefGet"></a>
# **invoicesInvoiceRefGet**
> Invoice invoicesInvoiceRefGet(invoiceRef)



Returns an invoice

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Phase2Api;

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

    Phase2Api apiInstance = new Phase2Api(defaultClient);
    String invoiceRef = "BIL-HGDU12687628"; // String | External identifier of the invoice
    try {
      Invoice result = apiInstance.invoicesInvoiceRefGet(invoiceRef);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Phase2Api#invoicesInvoiceRefGet");
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
| **invoiceRef** | **String**| External identifier of the invoice | |

### Return type

[**Invoice**](Invoice.md)

### Authorization

[ApiKey](../README.md#ApiKey), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully returned a list of invoices |  -  |
| **401** | ERROR - Not authenticated |  -  |
| **403** | ERROR - Access token does not have the required scope |  -  |
| **500** | ERROR - Internal Server error |  -  |

<a name="operationsGet"></a>
# **operationsGet**
> OperationsGet200Response operationsGet(subscriptionId, invoiceRef, customerRef, contactRef, limit, offset)



Returns a list of Operation added to deferred billing

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Phase2Api;

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

    Phase2Api apiInstance = new Phase2Api(defaultClient);
    String subscriptionId = "123e4567-e89b-12d3-a456-556642440000"; // String | External identifier of subscription
    String invoiceRef = "invoiceRef_example"; // String | External identifier of the invoice
    String customerRef = "CUSTOMER REF"; // String | External identifier of the buyer
    String contactRef = "CTR-671675563"; // String | IDExternal identifier of the Customer's contact
    Integer limit = 10; // Integer | Limits the number of items on a page
    Integer offset = 1; // Integer | Specifies the page number of the list to be displayed
    try {
      OperationsGet200Response result = apiInstance.operationsGet(subscriptionId, invoiceRef, customerRef, contactRef, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Phase2Api#operationsGet");
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
| **subscriptionId** | **String**| External identifier of subscription | [optional] |
| **invoiceRef** | **String**| External identifier of the invoice | [optional] |
| **customerRef** | **String**| External identifier of the buyer | [optional] |
| **contactRef** | **String**| IDExternal identifier of the Customer&#39;s contact | [optional] |
| **limit** | **Integer**| Limits the number of items on a page | [optional] |
| **offset** | **Integer**| Specifies the page number of the list to be displayed | [optional] |

### Return type

[**OperationsGet200Response**](OperationsGet200Response.md)

### Authorization

[ApiKey](../README.md#ApiKey), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully returned a list of Operations |  -  |
| **401** | ERROR - Not authenticated |  -  |
| **403** | ERROR - Access token does not have the required scope |  -  |
| **500** | ERROR - Internal Server error |  -  |

