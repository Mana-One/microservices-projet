/*
 * Travel Billing
 * The Travel Invoicing Application System
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
import org.openapitools.client.model.BusinessBuyer;
import org.openapitools.client.model.BusinessContract;
import org.openapitools.client.model.BusinessPayment;
import org.openapitools.client.model.BusinessSeller;
import org.openapitools.client.model.SubscriptionRequest;
import org.openapitools.client.model.SubscriptionResponseAllOf;

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
 * SubscriptionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-04T15:12:40.475542300+02:00[Europe/Paris]")
public class SubscriptionResponse {
  public static final String SERIALIZED_NAME_SUBSCRIPTION_ID = "subscriptionId";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_ID)
  private Integer subscriptionId;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_REF = "subscriptionRef";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_REF)
  private String subscriptionRef;

  /**
   * Type of subscription
   */
  @JsonAdapter(SubscriptionTypeEnum.Adapter.class)
  public enum SubscriptionTypeEnum {
    DEFERRED_BILLING("DEFERRED_BILLING");

    private String value;

    SubscriptionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubscriptionTypeEnum fromValue(String value) {
      for (SubscriptionTypeEnum b : SubscriptionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SubscriptionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubscriptionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubscriptionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SubscriptionTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SUBSCRIPTION_TYPE = "subscriptionType";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_TYPE)
  private SubscriptionTypeEnum subscriptionType;

  public static final String SERIALIZED_NAME_CONTRACT = "contract";
  @SerializedName(SERIALIZED_NAME_CONTRACT)
  private BusinessContract contract;

  public static final String SERIALIZED_NAME_SELLER = "seller";
  @SerializedName(SERIALIZED_NAME_SELLER)
  private BusinessSeller seller;

  public static final String SERIALIZED_NAME_BUYER = "buyer";
  @SerializedName(SERIALIZED_NAME_BUYER)
  private BusinessBuyer buyer;

  public static final String SERIALIZED_NAME_PAYMENT = "payment";
  @SerializedName(SERIALIZED_NAME_PAYMENT)
  private BusinessPayment payment;

  public SubscriptionResponse() { 
  }

  public SubscriptionResponse subscriptionId(Integer subscriptionId) {
    
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Internal identifier of the subscription
   * @return subscriptionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "58761542", required = true, value = "Internal identifier of the subscription")

  public Integer getSubscriptionId() {
    return subscriptionId;
  }


  public void setSubscriptionId(Integer subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  public SubscriptionResponse subscriptionRef(String subscriptionRef) {
    
    this.subscriptionRef = subscriptionRef;
    return this;
  }

   /**
   * External identifier of the subscription
   * @return subscriptionRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUB-YTYE65687", value = "External identifier of the subscription")

  public String getSubscriptionRef() {
    return subscriptionRef;
  }


  public void setSubscriptionRef(String subscriptionRef) {
    this.subscriptionRef = subscriptionRef;
  }


  public SubscriptionResponse subscriptionType(SubscriptionTypeEnum subscriptionType) {
    
    this.subscriptionType = subscriptionType;
    return this;
  }

   /**
   * Type of subscription
   * @return subscriptionType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "DEFERRED_BILLING", required = true, value = "Type of subscription")

  public SubscriptionTypeEnum getSubscriptionType() {
    return subscriptionType;
  }


  public void setSubscriptionType(SubscriptionTypeEnum subscriptionType) {
    this.subscriptionType = subscriptionType;
  }


  public SubscriptionResponse contract(BusinessContract contract) {
    
    this.contract = contract;
    return this;
  }

   /**
   * Get contract
   * @return contract
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BusinessContract getContract() {
    return contract;
  }


  public void setContract(BusinessContract contract) {
    this.contract = contract;
  }


  public SubscriptionResponse seller(BusinessSeller seller) {
    
    this.seller = seller;
    return this;
  }

   /**
   * Get seller
   * @return seller
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BusinessSeller getSeller() {
    return seller;
  }


  public void setSeller(BusinessSeller seller) {
    this.seller = seller;
  }


  public SubscriptionResponse buyer(BusinessBuyer buyer) {
    
    this.buyer = buyer;
    return this;
  }

   /**
   * Get buyer
   * @return buyer
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BusinessBuyer getBuyer() {
    return buyer;
  }


  public void setBuyer(BusinessBuyer buyer) {
    this.buyer = buyer;
  }


  public SubscriptionResponse payment(BusinessPayment payment) {
    
    this.payment = payment;
    return this;
  }

   /**
   * Get payment
   * @return payment
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BusinessPayment getPayment() {
    return payment;
  }


  public void setPayment(BusinessPayment payment) {
    this.payment = payment;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionResponse subscriptionResponse = (SubscriptionResponse) o;
    return Objects.equals(this.subscriptionId, subscriptionResponse.subscriptionId) &&
        Objects.equals(this.subscriptionRef, subscriptionResponse.subscriptionRef) &&
        Objects.equals(this.subscriptionType, subscriptionResponse.subscriptionType) &&
        Objects.equals(this.contract, subscriptionResponse.contract) &&
        Objects.equals(this.seller, subscriptionResponse.seller) &&
        Objects.equals(this.buyer, subscriptionResponse.buyer) &&
        Objects.equals(this.payment, subscriptionResponse.payment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, subscriptionRef, subscriptionType, contract, seller, buyer, payment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionResponse {\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    subscriptionRef: ").append(toIndentedString(subscriptionRef)).append("\n");
    sb.append("    subscriptionType: ").append(toIndentedString(subscriptionType)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
    sb.append("    buyer: ").append(toIndentedString(buyer)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
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
    openapiFields.add("subscriptionId");
    openapiFields.add("subscriptionRef");
    openapiFields.add("subscriptionType");
    openapiFields.add("contract");
    openapiFields.add("seller");
    openapiFields.add("buyer");
    openapiFields.add("payment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("subscriptionId");
    openapiRequiredFields.add("subscriptionType");
    openapiRequiredFields.add("contract");
    openapiRequiredFields.add("seller");
    openapiRequiredFields.add("buyer");
    openapiRequiredFields.add("payment");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubscriptionResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SubscriptionResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubscriptionResponse is not found in the empty JSON string", SubscriptionResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SubscriptionResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubscriptionResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SubscriptionResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("subscriptionRef") != null && !jsonObj.get("subscriptionRef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscriptionRef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscriptionRef").toString()));
      }
      if (jsonObj.get("subscriptionType") != null && !jsonObj.get("subscriptionType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscriptionType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscriptionType").toString()));
      }
      // validate the optional field `contract`
      if (jsonObj.getAsJsonObject("contract") != null) {
        BusinessContract.validateJsonObject(jsonObj.getAsJsonObject("contract"));
      }
      // validate the optional field `seller`
      if (jsonObj.getAsJsonObject("seller") != null) {
        BusinessSeller.validateJsonObject(jsonObj.getAsJsonObject("seller"));
      }
      // validate the optional field `buyer`
      if (jsonObj.getAsJsonObject("buyer") != null) {
        BusinessBuyer.validateJsonObject(jsonObj.getAsJsonObject("buyer"));
      }
      // validate the optional field `payment`
      if (jsonObj.getAsJsonObject("payment") != null) {
        BusinessPayment.validateJsonObject(jsonObj.getAsJsonObject("payment"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscriptionResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscriptionResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscriptionResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscriptionResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscriptionResponse>() {
           @Override
           public void write(JsonWriter out, SubscriptionResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubscriptionResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubscriptionResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubscriptionResponse
  * @throws IOException if the JSON string is invalid with respect to SubscriptionResponse
  */
  public static SubscriptionResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscriptionResponse.class);
  }

 /**
  * Convert an instance of SubscriptionResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
