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
import org.openapitools.client.model.BusinessParticularParty;
import org.openapitools.client.model.BusinessParticularPartyParticular;
import org.openapitools.client.model.BusinessProfessionnalParty;
import org.openapitools.client.model.BusinessProfessionnalPartyProfessionnal;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-04T15:17:57.729789200+02:00[Europe/Paris]")
public class BusinessSubscriberParty extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(BusinessSubscriberParty.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!BusinessSubscriberParty.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'BusinessSubscriberParty' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<BusinessParticularParty> adapterBusinessParticularParty = gson.getDelegateAdapter(this, TypeToken.get(BusinessParticularParty.class));
            final TypeAdapter<BusinessProfessionnalParty> adapterBusinessProfessionnalParty = gson.getDelegateAdapter(this, TypeToken.get(BusinessProfessionnalParty.class));

            return (TypeAdapter<T>) new TypeAdapter<BusinessSubscriberParty>() {
                @Override
                public void write(JsonWriter out, BusinessSubscriberParty value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `BusinessParticularParty`
                    if (value.getActualInstance() instanceof BusinessParticularParty) {
                        JsonObject obj = adapterBusinessParticularParty.toJsonTree((BusinessParticularParty)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `BusinessProfessionnalParty`
                    if (value.getActualInstance() instanceof BusinessProfessionnalParty) {
                        JsonObject obj = adapterBusinessProfessionnalParty.toJsonTree((BusinessProfessionnalParty)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: BusinessParticularParty, BusinessProfessionnalParty");
                }

                @Override
                public BusinessSubscriberParty read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize BusinessParticularParty
                    try {
                        // validate the JSON object to see if any exception is thrown
                        BusinessParticularParty.validateJsonObject(jsonObject);
                        actualAdapter = adapterBusinessParticularParty;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'BusinessParticularParty'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for BusinessParticularParty failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'BusinessParticularParty'", e);
                    }

                    // deserialize BusinessProfessionnalParty
                    try {
                        // validate the JSON object to see if any exception is thrown
                        BusinessProfessionnalParty.validateJsonObject(jsonObject);
                        actualAdapter = adapterBusinessProfessionnalParty;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'BusinessProfessionnalParty'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for BusinessProfessionnalParty failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'BusinessProfessionnalParty'", e);
                    }

                    if (match == 1) {
                        BusinessSubscriberParty ret = new BusinessSubscriberParty();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for BusinessSubscriberParty: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public BusinessSubscriberParty() {
        super("oneOf", Boolean.FALSE);
    }

    public BusinessSubscriberParty(BusinessParticularParty o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public BusinessSubscriberParty(BusinessProfessionnalParty o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("BusinessParticularParty", new GenericType<BusinessParticularParty>() {
        });
        schemas.put("BusinessProfessionnalParty", new GenericType<BusinessProfessionnalParty>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return BusinessSubscriberParty.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * BusinessParticularParty, BusinessProfessionnalParty
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof BusinessParticularParty) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof BusinessProfessionnalParty) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be BusinessParticularParty, BusinessProfessionnalParty");
    }

    /**
     * Get the actual instance, which can be the following:
     * BusinessParticularParty, BusinessProfessionnalParty
     *
     * @return The actual instance (BusinessParticularParty, BusinessProfessionnalParty)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `BusinessParticularParty`. If the actual instance is not `BusinessParticularParty`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BusinessParticularParty`
     * @throws ClassCastException if the instance is not `BusinessParticularParty`
     */
    public BusinessParticularParty getBusinessParticularParty() throws ClassCastException {
        return (BusinessParticularParty)super.getActualInstance();
    }

    /**
     * Get the actual instance of `BusinessProfessionnalParty`. If the actual instance is not `BusinessProfessionnalParty`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BusinessProfessionnalParty`
     * @throws ClassCastException if the instance is not `BusinessProfessionnalParty`
     */
    public BusinessProfessionnalParty getBusinessProfessionnalParty() throws ClassCastException {
        return (BusinessProfessionnalParty)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BusinessSubscriberParty
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with BusinessParticularParty
    try {
      BusinessParticularParty.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for BusinessParticularParty failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with BusinessProfessionnalParty
    try {
      BusinessProfessionnalParty.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for BusinessProfessionnalParty failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for BusinessSubscriberParty with oneOf schemas: BusinessParticularParty, BusinessProfessionnalParty. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of BusinessSubscriberParty given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BusinessSubscriberParty
  * @throws IOException if the JSON string is invalid with respect to BusinessSubscriberParty
  */
  public static BusinessSubscriberParty fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessSubscriberParty.class);
  }

 /**
  * Convert an instance of BusinessSubscriberParty to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

