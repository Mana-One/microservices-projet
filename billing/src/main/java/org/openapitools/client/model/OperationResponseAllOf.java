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
import org.openapitools.client.model.OperationResponseAllOfBilling;
import org.openapitools.client.model.OperationResponseAllOfInvoice;

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
 * OperationResponseAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-04T15:12:40.475542300+02:00[Europe/Paris]")
public class OperationResponseAllOf {
  public static final String SERIALIZED_NAME_OPERATION_ID = "operationId";
  @SerializedName(SERIALIZED_NAME_OPERATION_ID)
  private Integer operationId;

  public static final String SERIALIZED_NAME_OPERATION_REF = "operationRef";
  @SerializedName(SERIALIZED_NAME_OPERATION_REF)
  private String operationRef;

  public static final String SERIALIZED_NAME_BILLING = "billing";
  @SerializedName(SERIALIZED_NAME_BILLING)
  private OperationResponseAllOfBilling billing;

  public static final String SERIALIZED_NAME_INVOICE = "invoice";
  @SerializedName(SERIALIZED_NAME_INVOICE)
  private OperationResponseAllOfInvoice invoice;

  public OperationResponseAllOf() { 
  }

  public OperationResponseAllOf operationId(Integer operationId) {
    
    this.operationId = operationId;
    return this;
  }

   /**
   * Internal identifier of the Operation
   * @return operationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Internal identifier of the Operation")

  public Integer getOperationId() {
    return operationId;
  }


  public void setOperationId(Integer operationId) {
    this.operationId = operationId;
  }


  public OperationResponseAllOf operationRef(String operationRef) {
    
    this.operationRef = operationRef;
    return this;
  }

   /**
   * External identifier of the Operation
   * @return operationRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "HA-8768376537", value = "External identifier of the Operation")

  public String getOperationRef() {
    return operationRef;
  }


  public void setOperationRef(String operationRef) {
    this.operationRef = operationRef;
  }


  public OperationResponseAllOf billing(OperationResponseAllOfBilling billing) {
    
    this.billing = billing;
    return this;
  }

   /**
   * Get billing
   * @return billing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OperationResponseAllOfBilling getBilling() {
    return billing;
  }


  public void setBilling(OperationResponseAllOfBilling billing) {
    this.billing = billing;
  }


  public OperationResponseAllOf invoice(OperationResponseAllOfInvoice invoice) {
    
    this.invoice = invoice;
    return this;
  }

   /**
   * Get invoice
   * @return invoice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OperationResponseAllOfInvoice getInvoice() {
    return invoice;
  }


  public void setInvoice(OperationResponseAllOfInvoice invoice) {
    this.invoice = invoice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationResponseAllOf operationResponseAllOf = (OperationResponseAllOf) o;
    return Objects.equals(this.operationId, operationResponseAllOf.operationId) &&
        Objects.equals(this.operationRef, operationResponseAllOf.operationRef) &&
        Objects.equals(this.billing, operationResponseAllOf.billing) &&
        Objects.equals(this.invoice, operationResponseAllOf.invoice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationId, operationRef, billing, invoice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationResponseAllOf {\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    operationRef: ").append(toIndentedString(operationRef)).append("\n");
    sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
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
    openapiFields.add("operationId");
    openapiFields.add("operationRef");
    openapiFields.add("billing");
    openapiFields.add("invoice");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OperationResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OperationResponseAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OperationResponseAllOf is not found in the empty JSON string", OperationResponseAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OperationResponseAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OperationResponseAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("operationRef") != null && !jsonObj.get("operationRef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operationRef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operationRef").toString()));
      }
      // validate the optional field `billing`
      if (jsonObj.getAsJsonObject("billing") != null) {
        OperationResponseAllOfBilling.validateJsonObject(jsonObj.getAsJsonObject("billing"));
      }
      // validate the optional field `invoice`
      if (jsonObj.getAsJsonObject("invoice") != null) {
        OperationResponseAllOfInvoice.validateJsonObject(jsonObj.getAsJsonObject("invoice"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OperationResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OperationResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OperationResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OperationResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<OperationResponseAllOf>() {
           @Override
           public void write(JsonWriter out, OperationResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OperationResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OperationResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OperationResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to OperationResponseAllOf
  */
  public static OperationResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OperationResponseAllOf.class);
  }

 /**
  * Convert an instance of OperationResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

