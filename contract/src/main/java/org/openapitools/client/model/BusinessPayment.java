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
import org.openapitools.client.model.WireTransfertResource;

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
 * Describes the payment method used
 */
@ApiModel(description = "Describes the payment method used")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-04T15:17:57.729789200+02:00[Europe/Paris]")
public class BusinessPayment {
  /**
   * Payment method type (Only WIRETRANSFER for differed billing phase 1)
   */
  @JsonAdapter(PaymentMethodTypeEnum.Adapter.class)
  public enum PaymentMethodTypeEnum {
    WIRETRANSFER("WIRETRANSFER");

    private String value;

    PaymentMethodTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentMethodTypeEnum fromValue(String value) {
      for (PaymentMethodTypeEnum b : PaymentMethodTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PaymentMethodTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentMethodTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentMethodTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PaymentMethodTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAYMENT_METHOD_TYPE = "paymentMethodType";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD_TYPE)
  private PaymentMethodTypeEnum paymentMethodType;

  public static final String SERIALIZED_NAME_WIRE_TANSFERT = "wireTansfert";
  @SerializedName(SERIALIZED_NAME_WIRE_TANSFERT)
  private WireTransfertResource wireTansfert;

  public BusinessPayment() { 
  }

  public BusinessPayment paymentMethodType(PaymentMethodTypeEnum paymentMethodType) {
    
    this.paymentMethodType = paymentMethodType;
    return this;
  }

   /**
   * Payment method type (Only WIRETRANSFER for differed billing phase 1)
   * @return paymentMethodType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "WIRETRANSFER", required = true, value = "Payment method type (Only WIRETRANSFER for differed billing phase 1)")

  public PaymentMethodTypeEnum getPaymentMethodType() {
    return paymentMethodType;
  }


  public void setPaymentMethodType(PaymentMethodTypeEnum paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
  }


  public BusinessPayment wireTansfert(WireTransfertResource wireTansfert) {
    
    this.wireTansfert = wireTansfert;
    return this;
  }

   /**
   * Get wireTansfert
   * @return wireTansfert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WireTransfertResource getWireTansfert() {
    return wireTansfert;
  }


  public void setWireTansfert(WireTransfertResource wireTansfert) {
    this.wireTansfert = wireTansfert;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessPayment businessPayment = (BusinessPayment) o;
    return Objects.equals(this.paymentMethodType, businessPayment.paymentMethodType) &&
        Objects.equals(this.wireTansfert, businessPayment.wireTansfert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethodType, wireTansfert);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessPayment {\n");
    sb.append("    paymentMethodType: ").append(toIndentedString(paymentMethodType)).append("\n");
    sb.append("    wireTansfert: ").append(toIndentedString(wireTansfert)).append("\n");
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
    openapiFields.add("paymentMethodType");
    openapiFields.add("wireTansfert");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("paymentMethodType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BusinessPayment
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BusinessPayment.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BusinessPayment is not found in the empty JSON string", BusinessPayment.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BusinessPayment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BusinessPayment` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BusinessPayment.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("paymentMethodType") != null && !jsonObj.get("paymentMethodType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentMethodType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentMethodType").toString()));
      }
      // validate the optional field `wireTansfert`
      if (jsonObj.getAsJsonObject("wireTansfert") != null) {
        WireTransfertResource.validateJsonObject(jsonObj.getAsJsonObject("wireTansfert"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessPayment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessPayment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessPayment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessPayment.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessPayment>() {
           @Override
           public void write(JsonWriter out, BusinessPayment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BusinessPayment read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BusinessPayment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BusinessPayment
  * @throws IOException if the JSON string is invalid with respect to BusinessPayment
  */
  public static BusinessPayment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessPayment.class);
  }

 /**
  * Convert an instance of BusinessPayment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

