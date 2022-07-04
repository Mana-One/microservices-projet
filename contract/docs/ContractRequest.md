

# ContractRequest

Describes contract

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**productRef** | [**ProductRefEnum**](#ProductRefEnum) | External reference of the product |  [optional] |
|**contractType** | [**ContractTypeEnum**](#ContractTypeEnum) | Type of contract |  |
|**createdAt** | **LocalDate** | Creation date of contract (use ISO 8601 format YYYY-MM-DD) |  |
|**signedAt** | **LocalDate** | Signed date of contract (use ISO 8601 format YYYY-MM-DD) |  [optional] |
|**activatedAt** | **LocalDate** | Activation date of contract (use ISO 8601 format YYYY-MM-DD) |  |
|**expireAt** | **LocalDate** | Expiration date of contract (use ISO 8601 format YYYY-MM-DD) |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status of contact |  |
|**distributor** | [**BusinessDistributor**](BusinessDistributor.md) |  |  |
|**subscriber** | [**BusinessSubscriber**](BusinessSubscriber.md) |  |  |
|**custom** | [**ContractRequestCustom**](ContractRequestCustom.md) |  |  [optional] |



## Enum: ProductRefEnum

| Name | Value |
|---- | -----|
| DEFERRED_BILLING | &quot;DEFERRED_BILLING&quot; |



## Enum: ContractTypeEnum

| Name | Value |
|---- | -----|
| DEFERRED_BILLING | &quot;DEFERRED_BILLING&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;CREATED&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| SUSPENDED | &quot;SUSPENDED&quot; |
| EXPIRED | &quot;EXPIRED&quot; |



