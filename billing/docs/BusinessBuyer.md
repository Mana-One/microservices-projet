

# BusinessBuyer

Describes buyer organisation & contact

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**buyerRef** | **String** | External reference of buyer (By example: social reason of the company) |  [optional] |
|**buyerType** | [**BuyerTypeEnum**](#BuyerTypeEnum) |  |  |
|**party** | [**BusinessBuyerParty**](BusinessBuyerParty.md) |  |  [optional] |
|**eInvoicing** | [**BusinessBuyerEInvoicing**](BusinessBuyerEInvoicing.md) |  |  [optional] |
|**contactPerson** | [**BusinessBuyerContactPerson**](BusinessBuyerContactPerson.md) |  |  |
|**contactAddress** | [**BusinessAddress**](BusinessAddress.md) |  |  |
|**billingAddress** | [**BusinessAddress**](BusinessAddress.md) |  |  |



## Enum: BuyerTypeEnum

| Name | Value |
|---- | -----|
| PARTICULAR | &quot;PARTICULAR&quot; |
| PROFESSIONNAL | &quot;PROFESSIONNAL&quot; |



