/*
 * Travel Contract
 * The Travel Contract Application System
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import org.openapitools.client.model.BusinessDistributor;
import org.openapitools.client.model.BusinessSubscriber;
import org.openapitools.client.model.ContractRequest;
import org.openapitools.client.model.ContractRequestCustom;
import org.openapitools.client.model.ContractResponseAllOf;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * ContractResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-04T15:17:57.729789200+02:00[Europe/Paris]")
public class ContractResponse {
  public static final String SERIALIZED_NAME_CONTRACT_ID = "contractId";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ID)
  private Integer contractId;

  public static final String SERIALIZED_NAME_CONTRACT_REF = "contractRef";
  @SerializedName(SERIALIZED_NAME_CONTRACT_REF)
  private String contractRef;

  /**
   * External reference of the product
   */
  @JsonAdapter(ProductRefEnum.Adapter.class)
  public enum ProductRefEnum {
    DEFERRED_BILLING("DEFERRED_BILLING");

    private String value;

    ProductRefEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProductRefEnum fromValue(String value) {
      for (ProductRefEnum b : ProductRefEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProductRefEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProductRefEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProductRefEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProductRefEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PRODUCT_REF = "productRef";
  @SerializedName(SERIALIZED_NAME_PRODUCT_REF)
  private ProductRefEnum productRef;

  /**
   * Type of contract
   */
  @JsonAdapter(ContractTypeEnum.Adapter.class)
  public enum ContractTypeEnum {
    DEFERRED_BILLING("DEFERRED_BILLING");

    private String value;

    ContractTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ContractTypeEnum fromValue(String value) {
      for (ContractTypeEnum b : ContractTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ContractTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ContractTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ContractTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ContractTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CONTRACT_TYPE = "contractType";
  @SerializedName(SERIALIZED_NAME_CONTRACT_TYPE)
  private ContractTypeEnum contractType;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private LocalDate createdAt;

  public static final String SERIALIZED_NAME_SIGNED_AT = "signedAt";
  @SerializedName(SERIALIZED_NAME_SIGNED_AT)
  private LocalDate signedAt;

  public static final String SERIALIZED_NAME_ACTIVATED_AT = "activatedAt";
  @SerializedName(SERIALIZED_NAME_ACTIVATED_AT)
  private LocalDate activatedAt;

  public static final String SERIALIZED_NAME_EXPIRE_AT = "expireAt";
  @SerializedName(SERIALIZED_NAME_EXPIRE_AT)
  private LocalDate expireAt;

  /**
   * Status of contact
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    CREATED("CREATED"),
    
    ACTIVE("ACTIVE"),
    
    SUSPENDED("SUSPENDED"),
    
    EXPIRED("EXPIRED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_DISTRIBUTOR = "distributor";
  @SerializedName(SERIALIZED_NAME_DISTRIBUTOR)
  private BusinessDistributor distributor;

  public static final String SERIALIZED_NAME_SUBSCRIBER = "subscriber";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBER)
  private BusinessSubscriber subscriber;

  public static final String SERIALIZED_NAME_CUSTOM = "custom";
  @SerializedName(SERIALIZED_NAME_CUSTOM)
  private ContractRequestCustom custom;

  public ContractResponse() { 
  }

  public ContractResponse contractId(Integer contractId) {
    
    this.contractId = contractId;
    return this;
  }

   /**
   * Internal identifier of the contract
   * @return contractId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "58761542", required = true, value = "Internal identifier of the contract")

  public Integer getContractId() {
    return contractId;
  }


  public void setContractId(Integer contractId) {
    this.contractId = contractId;
  }


  public ContractResponse contractRef(String contractRef) {
    
    this.contractRef = contractRef;
    return this;
  }

   /**
   * External identifier of the contract
   * @return contractRef
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "SUB-YTYE65687", required = true, value = "External identifier of the contract")

  public String getContractRef() {
    return contractRef;
  }


  public void setContractRef(String contractRef) {
    this.contractRef = contractRef;
  }


  public ContractResponse productRef(ProductRefEnum productRef) {
    
    this.productRef = productRef;
    return this;
  }

   /**
   * External reference of the product
   * @return productRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DEFERRED_BILLING", value = "External reference of the product")

  public ProductRefEnum getProductRef() {
    return productRef;
  }


  public void setProductRef(ProductRefEnum productRef) {
    this.productRef = productRef;
  }


  public ContractResponse contractType(ContractTypeEnum contractType) {
    
    this.contractType = contractType;
    return this;
  }

   /**
   * Type of contract
   * @return contractType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "DEFERRED_BILLING", required = true, value = "Type of contract")

  public ContractTypeEnum getContractType() {
    return contractType;
  }


  public void setContractType(ContractTypeEnum contractType) {
    this.contractType = contractType;
  }


  public ContractResponse createdAt(LocalDate createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation date of contract (use ISO 8601 format YYYY-MM-DD)
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Fri Apr 22 02:00:00 CEST 2022", required = true, value = "Creation date of contract (use ISO 8601 format YYYY-MM-DD)")

  public LocalDate getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(LocalDate createdAt) {
    this.createdAt = createdAt;
  }


  public ContractResponse signedAt(LocalDate signedAt) {
    
    this.signedAt = signedAt;
    return this;
  }

   /**
   * Signed date of contract (use ISO 8601 format YYYY-MM-DD)
   * @return signedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Fri Apr 22 02:00:00 CEST 2022", value = "Signed date of contract (use ISO 8601 format YYYY-MM-DD)")

  public LocalDate getSignedAt() {
    return signedAt;
  }


  public void setSignedAt(LocalDate signedAt) {
    this.signedAt = signedAt;
  }


  public ContractResponse activatedAt(LocalDate activatedAt) {
    
    this.activatedAt = activatedAt;
    return this;
  }

   /**
   * Activation date of contract (use ISO 8601 format YYYY-MM-DD)
   * @return activatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Sun Apr 24 02:00:00 CEST 2022", required = true, value = "Activation date of contract (use ISO 8601 format YYYY-MM-DD)")

  public LocalDate getActivatedAt() {
    return activatedAt;
  }


  public void setActivatedAt(LocalDate activatedAt) {
    this.activatedAt = activatedAt;
  }


  public ContractResponse expireAt(LocalDate expireAt) {
    
    this.expireAt = expireAt;
    return this;
  }

   /**
   * Expiration date of contract (use ISO 8601 format YYYY-MM-DD)
   * @return expireAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Sat Apr 01 02:00:00 CEST 2023", required = true, value = "Expiration date of contract (use ISO 8601 format YYYY-MM-DD)")

  public LocalDate getExpireAt() {
    return expireAt;
  }


  public void setExpireAt(LocalDate expireAt) {
    this.expireAt = expireAt;
  }


  public ContractResponse status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status of contact
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ACTIVE", required = true, value = "Status of contact")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ContractResponse distributor(BusinessDistributor distributor) {
    
    this.distributor = distributor;
    return this;
  }

   /**
   * Get distributor
   * @return distributor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BusinessDistributor getDistributor() {
    return distributor;
  }


  public void setDistributor(BusinessDistributor distributor) {
    this.distributor = distributor;
  }


  public ContractResponse subscriber(BusinessSubscriber subscriber) {
    
    this.subscriber = subscriber;
    return this;
  }

   /**
   * Get subscriber
   * @return subscriber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BusinessSubscriber getSubscriber() {
    return subscriber;
  }


  public void setSubscriber(BusinessSubscriber subscriber) {
    this.subscriber = subscriber;
  }


  public ContractResponse custom(ContractRequestCustom custom) {
    
    this.custom = custom;
    return this;
  }

   /**
   * Get custom
   * @return custom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContractRequestCustom getCustom() {
    return custom;
  }


  public void setCustom(ContractRequestCustom custom) {
    this.custom = custom;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractResponse contractResponse = (ContractResponse) o;
    return Objects.equals(this.contractId, contractResponse.contractId) &&
        Objects.equals(this.contractRef, contractResponse.contractRef) &&
        Objects.equals(this.productRef, contractResponse.productRef) &&
        Objects.equals(this.contractType, contractResponse.contractType) &&
        Objects.equals(this.createdAt, contractResponse.createdAt) &&
        Objects.equals(this.signedAt, contractResponse.signedAt) &&
        Objects.equals(this.activatedAt, contractResponse.activatedAt) &&
        Objects.equals(this.expireAt, contractResponse.expireAt) &&
        Objects.equals(this.status, contractResponse.status) &&
        Objects.equals(this.distributor, contractResponse.distributor) &&
        Objects.equals(this.subscriber, contractResponse.subscriber) &&
        Objects.equals(this.custom, contractResponse.custom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractId, contractRef, productRef, contractType, createdAt, signedAt, activatedAt, expireAt, status, distributor, subscriber, custom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractResponse {\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    contractRef: ").append(toIndentedString(contractRef)).append("\n");
    sb.append("    productRef: ").append(toIndentedString(productRef)).append("\n");
    sb.append("    contractType: ").append(toIndentedString(contractType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    signedAt: ").append(toIndentedString(signedAt)).append("\n");
    sb.append("    activatedAt: ").append(toIndentedString(activatedAt)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    distributor: ").append(toIndentedString(distributor)).append("\n");
    sb.append("    subscriber: ").append(toIndentedString(subscriber)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("contractId");
    openapiFields.add("contractRef");
    openapiFields.add("productRef");
    openapiFields.add("contractType");
    openapiFields.add("createdAt");
    openapiFields.add("signedAt");
    openapiFields.add("activatedAt");
    openapiFields.add("expireAt");
    openapiFields.add("status");
    openapiFields.add("distributor");
    openapiFields.add("subscriber");
    openapiFields.add("custom");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("contractId");
    openapiRequiredFields.add("contractRef");
    openapiRequiredFields.add("contractType");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("activatedAt");
    openapiRequiredFields.add("expireAt");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("distributor");
    openapiRequiredFields.add("subscriber");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ContractResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ContractResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContractResponse is not found in the empty JSON string", ContractResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ContractResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContractResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ContractResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("contractRef") != null && !jsonObj.get("contractRef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contractRef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contractRef").toString()));
      }
      if (jsonObj.get("productRef") != null && !jsonObj.get("productRef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productRef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productRef").toString()));
      }
      if (jsonObj.get("contractType") != null && !jsonObj.get("contractType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contractType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contractType").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `distributor`
      if (jsonObj.getAsJsonObject("distributor") != null) {
        BusinessDistributor.validateJsonObject(jsonObj.getAsJsonObject("distributor"));
      }
      // validate the optional field `subscriber`
      if (jsonObj.getAsJsonObject("subscriber") != null) {
        BusinessSubscriber.validateJsonObject(jsonObj.getAsJsonObject("subscriber"));
      }
      // validate the optional field `custom`
      if (jsonObj.getAsJsonObject("custom") != null) {
        ContractRequestCustom.validateJsonObject(jsonObj.getAsJsonObject("custom"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContractResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContractResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContractResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContractResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ContractResponse>() {
           @Override
           public void write(JsonWriter out, ContractResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContractResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ContractResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContractResponse
  * @throws IOException if the JSON string is invalid with respect to ContractResponse
  */
  public static ContractResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContractResponse.class);
  }

 /**
  * Convert an instance of ContractResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

