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
 * OperationResponseAllOfBilling
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-04T15:12:40.475542300+02:00[Europe/Paris]")
public class OperationResponseAllOfBilling {
  public static final String SERIALIZED_NAME_SUBSCRIPTION_REF = "subscriptionRef";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_REF)
  private String subscriptionRef;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private LocalDate createdAt;

  public static final String SERIALIZED_NAME_COMMING_SOON = "commingSoon";
  @SerializedName(SERIALIZED_NAME_COMMING_SOON)
  private Object commingSoon;

  public OperationResponseAllOfBilling() { 
  }

  public OperationResponseAllOfBilling subscriptionRef(String subscriptionRef) {
    
    this.subscriptionRef = subscriptionRef;
    return this;
  }

   /**
   * Get subscriptionRef
   * @return subscriptionRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubscriptionRef() {
    return subscriptionRef;
  }


  public void setSubscriptionRef(String subscriptionRef) {
    this.subscriptionRef = subscriptionRef;
  }


  public OperationResponseAllOfBilling createdAt(LocalDate createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(LocalDate createdAt) {
    this.createdAt = createdAt;
  }


  public OperationResponseAllOfBilling commingSoon(Object commingSoon) {
    
    this.commingSoon = commingSoon;
    return this;
  }

   /**
   * Get commingSoon
   * @return commingSoon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getCommingSoon() {
    return commingSoon;
  }


  public void setCommingSoon(Object commingSoon) {
    this.commingSoon = commingSoon;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationResponseAllOfBilling operationResponseAllOfBilling = (OperationResponseAllOfBilling) o;
    return Objects.equals(this.subscriptionRef, operationResponseAllOfBilling.subscriptionRef) &&
        Objects.equals(this.createdAt, operationResponseAllOfBilling.createdAt) &&
        Objects.equals(this.commingSoon, operationResponseAllOfBilling.commingSoon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionRef, createdAt, commingSoon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationResponseAllOfBilling {\n");
    sb.append("    subscriptionRef: ").append(toIndentedString(subscriptionRef)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    commingSoon: ").append(toIndentedString(commingSoon)).append("\n");
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
    openapiFields.add("subscriptionRef");
    openapiFields.add("createdAt");
    openapiFields.add("commingSoon");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OperationResponseAllOfBilling
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OperationResponseAllOfBilling.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OperationResponseAllOfBilling is not found in the empty JSON string", OperationResponseAllOfBilling.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OperationResponseAllOfBilling.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OperationResponseAllOfBilling` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("subscriptionRef") != null && !jsonObj.get("subscriptionRef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscriptionRef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscriptionRef").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OperationResponseAllOfBilling.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OperationResponseAllOfBilling' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OperationResponseAllOfBilling> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OperationResponseAllOfBilling.class));

       return (TypeAdapter<T>) new TypeAdapter<OperationResponseAllOfBilling>() {
           @Override
           public void write(JsonWriter out, OperationResponseAllOfBilling value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OperationResponseAllOfBilling read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OperationResponseAllOfBilling given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OperationResponseAllOfBilling
  * @throws IOException if the JSON string is invalid with respect to OperationResponseAllOfBilling
  */
  public static OperationResponseAllOfBilling fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OperationResponseAllOfBilling.class);
  }

 /**
  * Convert an instance of OperationResponseAllOfBilling to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
