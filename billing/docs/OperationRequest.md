

# OperationRequest

Describes an Operation added to deferred billing

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerRef** | **String** | External identifier of the Customer |  [optional] |
|**operationAt** | **LocalDate** | Transaction date in the sales system as defined in ISO 8601 ([more information about the standar](https://www.iso.org/fr/iso-8601-date-and-time-format.html)).  Used format : YYYY-MM-DD  |  [optional] |
|**order** | [**OperationRequestOrder**](OperationRequestOrder.md) |  |  [optional] |



