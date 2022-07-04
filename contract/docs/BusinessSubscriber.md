

# BusinessSubscriber

Describes subscriber organisation & contact

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subscriberRef** | **String** | External reference of subscriber (By example: social reason of the company) |  [optional] |
|**subscriberType** | [**SubscriberTypeEnum**](#SubscriberTypeEnum) |  |  |
|**party** | [**BusinessSubscriberParty**](BusinessSubscriberParty.md) |  |  [optional] |
|**eInvoicing** | [**BusinessSubscriberEInvoicing**](BusinessSubscriberEInvoicing.md) |  |  [optional] |
|**contactPerson** | [**BusinessSubscriberContactPerson**](BusinessSubscriberContactPerson.md) |  |  |
|**contactAddress** | [**BusinessAddress**](BusinessAddress.md) |  |  |
|**billingAddress** | [**BusinessAddress**](BusinessAddress.md) |  |  |



## Enum: SubscriberTypeEnum

| Name | Value |
|---- | -----|
| PARTICULAR | &quot;PARTICULAR&quot; |
| PROFESSIONNAL | &quot;PROFESSIONNAL&quot; |



