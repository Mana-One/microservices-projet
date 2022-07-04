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
 * Describe contract action
 */
@ApiModel(description = "Describe contract action")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-04T15:17:57.729789200+02:00[Europe/Paris]")
public class ContractActionRequest {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_CONTRACT_REF = "contractRef";
  @SerializedName(SERIALIZED_NAME_CONTRACT_REF)
  private String contractRef;

  public ContractActionRequest() { 
  }

  public ContractActionRequest action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "activation", value = "")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public ContractActionRequest contractRef(String contractRef) {
    
    this.contractRef = contractRef;
    return this;
  }

   /**
   * Get contractRef
   * @return contractRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getContractRef() {
    return contractRef;
  }


  public void setContractRef(String contractRef) {
    this.contractRef = contractRef;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractActionRequest contractActionRequest = (ContractActionRequest) o;
    return Objects.equals(this.action, contractActionRequest.action) &&
        Objects.equals(this.contractRef, contractActionRequest.contractRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, contractRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractActionRequest {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    contractRef: ").append(toIndentedString(contractRef)).append("\n");
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
    openapiFields.add("action");
    openapiFields.add("contractRef");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ContractActionRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ContractActionRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContractActionRequest is not found in the empty JSON string", ContractActionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ContractActionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContractActionRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("action") != null && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      if (jsonObj.get("contractRef") != null && !jsonObj.get("contractRef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contractRef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contractRef").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContractActionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContractActionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContractActionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContractActionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ContractActionRequest>() {
           @Override
           public void write(JsonWriter out, ContractActionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContractActionRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ContractActionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContractActionRequest
  * @throws IOException if the JSON string is invalid with respect to ContractActionRequest
  */
  public static ContractActionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContractActionRequest.class);
  }

 /**
  * Convert an instance of ContractActionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

