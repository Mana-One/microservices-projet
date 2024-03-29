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
import org.openapitools.client.model.BusinessAddress;
import org.openapitools.client.model.BusinessSubscriberContactPerson;
import org.openapitools.client.model.BusinessSubscriberEInvoicing;
import org.openapitools.client.model.BusinessSubscriberParty;

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
 * Describes subscriber organisation &amp; contact
 */
@ApiModel(description = "Describes subscriber organisation & contact")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-04T15:17:57.729789200+02:00[Europe/Paris]")
public class BusinessSubscriber {
  public static final String SERIALIZED_NAME_SUBSCRIBER_REF = "subscriberRef";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBER_REF)
  private String subscriberRef;

  /**
   * Gets or Sets subscriberType
   */
  @JsonAdapter(SubscriberTypeEnum.Adapter.class)
  public enum SubscriberTypeEnum {
    PARTICULAR("PARTICULAR"),
    
    PROFESSIONNAL("PROFESSIONNAL");

    private String value;

    SubscriberTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubscriberTypeEnum fromValue(String value) {
      for (SubscriberTypeEnum b : SubscriberTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SubscriberTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubscriberTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubscriberTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SubscriberTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SUBSCRIBER_TYPE = "subscriberType";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBER_TYPE)
  private SubscriberTypeEnum subscriberType;

  public static final String SERIALIZED_NAME_PARTY = "party";
  @SerializedName(SERIALIZED_NAME_PARTY)
  private BusinessSubscriberParty party;

  public static final String SERIALIZED_NAME_E_INVOICING = "eInvoicing";
  @SerializedName(SERIALIZED_NAME_E_INVOICING)
  private BusinessSubscriberEInvoicing eInvoicing;

  public static final String SERIALIZED_NAME_CONTACT_PERSON = "contactPerson";
  @SerializedName(SERIALIZED_NAME_CONTACT_PERSON)
  private BusinessSubscriberContactPerson contactPerson;

  public static final String SERIALIZED_NAME_CONTACT_ADDRESS = "contactAddress";
  @SerializedName(SERIALIZED_NAME_CONTACT_ADDRESS)
  private BusinessAddress contactAddress;

  public static final String SERIALIZED_NAME_BILLING_ADDRESS = "billingAddress";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS)
  private BusinessAddress billingAddress;

  public BusinessSubscriber() { 
  }

  public BusinessSubscriber subscriberRef(String subscriberRef) {
    
    this.subscriberRef = subscriberRef;
    return this;
  }

   /**
   * External reference of subscriber (By example: social reason of the company)
   * @return subscriberRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Ma Petite Entreprise", value = "External reference of subscriber (By example: social reason of the company)")

  public String getSubscriberRef() {
    return subscriberRef;
  }


  public void setSubscriberRef(String subscriberRef) {
    this.subscriberRef = subscriberRef;
  }


  public BusinessSubscriber subscriberType(SubscriberTypeEnum subscriberType) {
    
    this.subscriberType = subscriberType;
    return this;
  }

   /**
   * Get subscriberType
   * @return subscriberType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "PROFESSIONNAL", required = true, value = "")

  public SubscriberTypeEnum getSubscriberType() {
    return subscriberType;
  }


  public void setSubscriberType(SubscriberTypeEnum subscriberType) {
    this.subscriberType = subscriberType;
  }


  public BusinessSubscriber party(BusinessSubscriberParty party) {
    
    this.party = party;
    return this;
  }

   /**
   * Get party
   * @return party
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BusinessSubscriberParty getParty() {
    return party;
  }


  public void setParty(BusinessSubscriberParty party) {
    this.party = party;
  }


  public BusinessSubscriber eInvoicing(BusinessSubscriberEInvoicing eInvoicing) {
    
    this.eInvoicing = eInvoicing;
    return this;
  }

   /**
   * Get eInvoicing
   * @return eInvoicing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BusinessSubscriberEInvoicing geteInvoicing() {
    return eInvoicing;
  }


  public void seteInvoicing(BusinessSubscriberEInvoicing eInvoicing) {
    this.eInvoicing = eInvoicing;
  }


  public BusinessSubscriber contactPerson(BusinessSubscriberContactPerson contactPerson) {
    
    this.contactPerson = contactPerson;
    return this;
  }

   /**
   * Get contactPerson
   * @return contactPerson
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BusinessSubscriberContactPerson getContactPerson() {
    return contactPerson;
  }


  public void setContactPerson(BusinessSubscriberContactPerson contactPerson) {
    this.contactPerson = contactPerson;
  }


  public BusinessSubscriber contactAddress(BusinessAddress contactAddress) {
    
    this.contactAddress = contactAddress;
    return this;
  }

   /**
   * Get contactAddress
   * @return contactAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BusinessAddress getContactAddress() {
    return contactAddress;
  }


  public void setContactAddress(BusinessAddress contactAddress) {
    this.contactAddress = contactAddress;
  }


  public BusinessSubscriber billingAddress(BusinessAddress billingAddress) {
    
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BusinessAddress getBillingAddress() {
    return billingAddress;
  }


  public void setBillingAddress(BusinessAddress billingAddress) {
    this.billingAddress = billingAddress;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessSubscriber businessSubscriber = (BusinessSubscriber) o;
    return Objects.equals(this.subscriberRef, businessSubscriber.subscriberRef) &&
        Objects.equals(this.subscriberType, businessSubscriber.subscriberType) &&
        Objects.equals(this.party, businessSubscriber.party) &&
        Objects.equals(this.eInvoicing, businessSubscriber.eInvoicing) &&
        Objects.equals(this.contactPerson, businessSubscriber.contactPerson) &&
        Objects.equals(this.contactAddress, businessSubscriber.contactAddress) &&
        Objects.equals(this.billingAddress, businessSubscriber.billingAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriberRef, subscriberType, party, eInvoicing, contactPerson, contactAddress, billingAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessSubscriber {\n");
    sb.append("    subscriberRef: ").append(toIndentedString(subscriberRef)).append("\n");
    sb.append("    subscriberType: ").append(toIndentedString(subscriberType)).append("\n");
    sb.append("    party: ").append(toIndentedString(party)).append("\n");
    sb.append("    eInvoicing: ").append(toIndentedString(eInvoicing)).append("\n");
    sb.append("    contactPerson: ").append(toIndentedString(contactPerson)).append("\n");
    sb.append("    contactAddress: ").append(toIndentedString(contactAddress)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
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
    openapiFields.add("subscriberRef");
    openapiFields.add("subscriberType");
    openapiFields.add("party");
    openapiFields.add("eInvoicing");
    openapiFields.add("contactPerson");
    openapiFields.add("contactAddress");
    openapiFields.add("billingAddress");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("subscriberType");
    openapiRequiredFields.add("contactPerson");
    openapiRequiredFields.add("contactAddress");
    openapiRequiredFields.add("billingAddress");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BusinessSubscriber
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BusinessSubscriber.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BusinessSubscriber is not found in the empty JSON string", BusinessSubscriber.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BusinessSubscriber.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BusinessSubscriber` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BusinessSubscriber.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("subscriberRef") != null && !jsonObj.get("subscriberRef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscriberRef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscriberRef").toString()));
      }
      if (jsonObj.get("subscriberType") != null && !jsonObj.get("subscriberType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscriberType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscriberType").toString()));
      }
      // validate the optional field `party`
      if (jsonObj.getAsJsonObject("party") != null) {
        BusinessSubscriberParty.validateJsonObject(jsonObj.getAsJsonObject("party"));
      }
      // validate the optional field `eInvoicing`
      if (jsonObj.getAsJsonObject("eInvoicing") != null) {
        BusinessSubscriberEInvoicing.validateJsonObject(jsonObj.getAsJsonObject("eInvoicing"));
      }
      // validate the optional field `contactPerson`
      if (jsonObj.getAsJsonObject("contactPerson") != null) {
        BusinessSubscriberContactPerson.validateJsonObject(jsonObj.getAsJsonObject("contactPerson"));
      }
      // validate the optional field `contactAddress`
      if (jsonObj.getAsJsonObject("contactAddress") != null) {
        BusinessAddress.validateJsonObject(jsonObj.getAsJsonObject("contactAddress"));
      }
      // validate the optional field `billingAddress`
      if (jsonObj.getAsJsonObject("billingAddress") != null) {
        BusinessAddress.validateJsonObject(jsonObj.getAsJsonObject("billingAddress"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessSubscriber.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessSubscriber' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessSubscriber> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessSubscriber.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessSubscriber>() {
           @Override
           public void write(JsonWriter out, BusinessSubscriber value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BusinessSubscriber read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BusinessSubscriber given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BusinessSubscriber
  * @throws IOException if the JSON string is invalid with respect to BusinessSubscriber
  */
  public static BusinessSubscriber fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessSubscriber.class);
  }

 /**
  * Convert an instance of BusinessSubscriber to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

