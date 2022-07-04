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
import java.time.LocalDate;
import org.openapitools.client.model.OperationRequestOrder;

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
 * Describes an Operation added to deferred billing
 */
@ApiModel(description = "Describes an Operation added to deferred billing")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-04T15:12:40.475542300+02:00[Europe/Paris]")
public class OperationRequest {
  public static final String SERIALIZED_NAME_CUSTOMER_REF = "customerRef";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_REF)
  private String customerRef;

  public static final String SERIALIZED_NAME_OPERATION_AT = "operationAt";
  @SerializedName(SERIALIZED_NAME_OPERATION_AT)
  private LocalDate operationAt;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private OperationRequestOrder order;

  public OperationRequest() { 
  }

  public OperationRequest customerRef(String customerRef) {
    
    this.customerRef = customerRef;
    return this;
  }

   /**
   * External identifier of the Customer
   * @return customerRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "HA-8768376537", value = "External identifier of the Customer")

  public String getCustomerRef() {
    return customerRef;
  }


  public void setCustomerRef(String customerRef) {
    this.customerRef = customerRef;
  }


  public OperationRequest operationAt(LocalDate operationAt) {
    
    this.operationAt = operationAt;
    return this;
  }

   /**
   * Transaction date in the sales system as defined in ISO 8601 ([more information about the standar](https://www.iso.org/fr/iso-8601-date-and-time-format.html)).  Used format : YYYY-MM-DD 
   * @return operationAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Wed Apr 27 02:00:00 CEST 2022", value = "Transaction date in the sales system as defined in ISO 8601 ([more information about the standar](https://www.iso.org/fr/iso-8601-date-and-time-format.html)).  Used format : YYYY-MM-DD ")

  public LocalDate getOperationAt() {
    return operationAt;
  }


  public void setOperationAt(LocalDate operationAt) {
    this.operationAt = operationAt;
  }


  public OperationRequest order(OperationRequestOrder order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OperationRequestOrder getOrder() {
    return order;
  }


  public void setOrder(OperationRequestOrder order) {
    this.order = order;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationRequest operationRequest = (OperationRequest) o;
    return Objects.equals(this.customerRef, operationRequest.customerRef) &&
        Objects.equals(this.operationAt, operationRequest.operationAt) &&
        Objects.equals(this.order, operationRequest.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerRef, operationAt, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationRequest {\n");
    sb.append("    customerRef: ").append(toIndentedString(customerRef)).append("\n");
    sb.append("    operationAt: ").append(toIndentedString(operationAt)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
    openapiFields.add("customerRef");
    openapiFields.add("operationAt");
    openapiFields.add("order");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OperationRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OperationRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OperationRequest is not found in the empty JSON string", OperationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OperationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OperationRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("customerRef") != null && !jsonObj.get("customerRef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerRef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerRef").toString()));
      }
      // validate the optional field `order`
      if (jsonObj.getAsJsonObject("order") != null) {
        OperationRequestOrder.validateJsonObject(jsonObj.getAsJsonObject("order"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OperationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OperationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OperationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OperationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OperationRequest>() {
           @Override
           public void write(JsonWriter out, OperationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OperationRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OperationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OperationRequest
  * @throws IOException if the JSON string is invalid with respect to OperationRequest
  */
  public static OperationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OperationRequest.class);
  }

 /**
  * Convert an instance of OperationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

