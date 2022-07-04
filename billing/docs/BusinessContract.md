

# BusinessContract

Describe business contract

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contractId** | **Integer** | Internal identifier of the subscription |  [optional] |
|**contractRef** | **String** | External contract reference |  [optional] |
|**createdAt** | **LocalDate** | Creation date of contract (use ISO 8601 format YYYY-MM-DD) |  [optional] |
|**activatedAt** | **LocalDate** | Activation date of contract (use ISO 8601 format YYYY-MM-DD) |  [optional] |
|**expireAt** | **LocalDate** | Expiration date of contract (use ISO 8601 format YYYY-MM-DD) |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of contact |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;CREATED&quot; |
| ACTIVATED | &quot;ACTIVATED&quot; |
| SUSPENDED | &quot;SUSPENDED&quot; |
| EXPIRED | &quot;EXPIRED&quot; |



