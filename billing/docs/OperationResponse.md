

# OperationResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operationId** | **Integer** | Internal identifier of the Operation |  [optional] |
|**operationRef** | **String** | External identifier of the Operation |  [optional] |
|**billing** | [**OperationResponseAllOfBilling**](OperationResponseAllOfBilling.md) |  |  [optional] |
|**invoice** | [**OperationResponseAllOfInvoice**](OperationResponseAllOfInvoice.md) |  |  [optional] |
|**customerRef** | **String** | External identifier of the Customer |  [optional] |
|**operationAt** | **LocalDate** | Transaction date in the sales system as defined in ISO 8601 ([more information about the standar](https://www.iso.org/fr/iso-8601-date-and-time-format.html)).  Used format : YYYY-MM-DD  |  [optional] |
|**order** | [**OperationRequestOrder**](OperationRequestOrder.md) |  |  [optional] |



