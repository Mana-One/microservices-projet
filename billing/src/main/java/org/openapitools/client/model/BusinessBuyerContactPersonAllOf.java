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
 * BusinessBuyerContactPersonAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-04T15:12:40.475542300+02:00[Europe/Paris]")
public class BusinessBuyerContactPersonAllOf {
  public static final String SERIALIZED_NAME_CONTACT_ID = "contactId";
  @SerializedName(SERIALIZED_NAME_CONTACT_ID)
  private String contactId;

  public BusinessBuyerContactPersonAllOf() { 
  }

  public BusinessBuyerContactPersonAllOf contactId(String contactId) {
    
    this.contactId = contactId;
    return this;
  }

   /**
   * Internal contact identifier (legal represenative of entity)
   * @return contactId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CCU-001524", required = true, value = "Internal contact identifier (legal represenative of entity)")

  public String getContactId() {
    return contactId;
  }


  public void setContactId(String contactId) {
    this.contactId = contactId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessBuyerContactPersonAllOf businessBuyerContactPersonAllOf = (BusinessBuyerContactPersonAllOf) o;
    return Objects.equals(this.contactId, businessBuyerContactPersonAllOf.contactId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessBuyerContactPersonAllOf {\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
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
    openapiFields.add("contactId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("contactId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BusinessBuyerContactPersonAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BusinessBuyerContactPersonAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BusinessBuyerContactPersonAllOf is not found in the empty JSON string", BusinessBuyerContactPersonAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BusinessBuyerContactPersonAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BusinessBuyerContactPersonAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BusinessBuyerContactPersonAllOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("contactId") != null && !jsonObj.get("contactId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contactId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contactId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessBuyerContactPersonAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessBuyerContactPersonAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessBuyerContactPersonAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessBuyerContactPersonAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessBuyerContactPersonAllOf>() {
           @Override
           public void write(JsonWriter out, BusinessBuyerContactPersonAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BusinessBuyerContactPersonAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BusinessBuyerContactPersonAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BusinessBuyerContactPersonAllOf
  * @throws IOException if the JSON string is invalid with respect to BusinessBuyerContactPersonAllOf
  */
  public static BusinessBuyerContactPersonAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessBuyerContactPersonAllOf.class);
  }

 /**
  * Convert an instance of BusinessBuyerContactPersonAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

