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
 * Describes billing subscription
 */
@ApiModel(description = "Describes billing subscription")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-04T15:12:40.475542300+02:00[Europe/Paris]")
public class SubscriptionRequest {
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

  public SubscriptionRequest() { 
  }

  public SubscriptionRequest subscriptionType(SubscriptionTypeEnum subscriptionType) {
    
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


  public SubscriptionRequest contract(BusinessContract contract) {
    
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


  public SubscriptionRequest seller(BusinessSeller seller) {
    
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


  public SubscriptionRequest buyer(BusinessBuyer buyer) {
    
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


  public SubscriptionRequest payment(BusinessPayment payment) {
    
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
    SubscriptionRequest subscriptionRequest = (SubscriptionRequest) o;
    return Objects.equals(this.subscriptionType, subscriptionRequest.subscriptionType) &&
        Objects.equals(this.contract, subscriptionRequest.contract) &&
        Objects.equals(this.seller, subscriptionRequest.seller) &&
        Objects.equals(this.buyer, subscriptionRequest.buyer) &&
        Objects.equals(this.payment, subscriptionRequest.payment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionType, contract, seller, buyer, payment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionRequest {\n");
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
    openapiFields.add("subscriptionType");
    openapiFields.add("contract");
    openapiFields.add("seller");
    openapiFields.add("buyer");
    openapiFields.add("payment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
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
  * @throws IOException if the JSON Object is invalid with respect to SubscriptionRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SubscriptionRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubscriptionRequest is not found in the empty JSON string", SubscriptionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SubscriptionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubscriptionRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SubscriptionRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
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
       if (!SubscriptionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscriptionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscriptionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscriptionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscriptionRequest>() {
           @Override
           public void write(JsonWriter out, SubscriptionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubscriptionRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubscriptionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubscriptionRequest
  * @throws IOException if the JSON string is invalid with respect to SubscriptionRequest
  */
  public static SubscriptionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscriptionRequest.class);
  }

 /**
  * Convert an instance of SubscriptionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

