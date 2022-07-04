

# OperationRequestOrder

Describes Purchase or Refund Operation

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderRef** | **String** | External Order reference |  [optional] |
|**currencyCode** | **String** | Billing currency code as defined in ISO 4217 ([more information about the standard](https://www.iso.org/fr/iso-4217-currency-codes.html)) |  [optional] |
|**orderType** | [**OrderTypeEnum**](#OrderTypeEnum) | Necessary for e-Invoicing :  LB &#x3D; Livraison de Biens, PS &#x3D; Prestation de Service LBPS &#x3D; Double  |  [optional] |
|**orderItems** | [**List&lt;OperationRequestOrderOrderItemsInner&gt;**](OperationRequestOrderOrderItemsInner.md) |  |  [optional] |
|**totalWithoutTax** | **BigDecimal** |  |  [optional] |
|**totalTax** | **BigDecimal** |  |  [optional] |
|**totalWithTax** | **BigDecimal** |  |  [optional] |
|**amountEcoParticipation** | **BigDecimal** | Necessary for e-Invoicing |  [optional] |



## Enum: OrderTypeEnum

| Name | Value |
|---- | -----|
| LB | &quot;LB&quot; |
| PS | &quot;PS&quot; |
| LBPS | &quot;LBPS&quot; |



