

# SubscriptionResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subscriptionId** | **Integer** | Internal identifier of the subscription |  |
|**subscriptionRef** | **String** | External identifier of the subscription |  [optional] |
|**subscriptionType** | [**SubscriptionTypeEnum**](#SubscriptionTypeEnum) | Type of subscription |  |
|**contract** | [**BusinessContract**](BusinessContract.md) |  |  |
|**seller** | [**BusinessSeller**](BusinessSeller.md) |  |  |
|**buyer** | [**BusinessBuyer**](BusinessBuyer.md) |  |  |
|**payment** | [**BusinessPayment**](BusinessPayment.md) |  |  |



## Enum: SubscriptionTypeEnum

| Name | Value |
|---- | -----|
| DEFERRED_BILLING | &quot;DEFERRED_BILLING&quot; |



