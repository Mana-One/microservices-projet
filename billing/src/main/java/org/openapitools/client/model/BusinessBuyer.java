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
import org.openapitools.client.model.BusinessAddress;
import org.openapitools.client.model.BusinessBuyerContactPerson;
import org.openapitools.client.model.BusinessBuyerEInvoicing;
import org.openapitools.client.model.BusinessBuyerParty;

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
 * Describes buyer organisation &amp; contact
 */
@ApiModel(description = "Describes buyer organisation & contact")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-04T15:12:40.475542300+02:00[Europe/Paris]")
public class BusinessBuyer {
  public static final String SERIALIZED_NAME_BUYER_REF = "buyerRef";
  @SerializedName(SERIALIZED_NAME_BUYER_REF)
  private String buyerRef;

  /**
   * Gets or Sets buyerType
   */
  @JsonAdapter(BuyerTypeEnum.Adapter.class)
  public enum BuyerTypeEnum {
    PARTICULAR("PARTICULAR"),
    
    PROFESSIONNAL("PROFESSIONNAL");

    private String value;

    BuyerTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BuyerTypeEnum fromValue(String value) {
      for (BuyerTypeEnum b : BuyerTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BuyerTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BuyerTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BuyerTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BuyerTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BUYER_TYPE = "buyerType";
  @SerializedName(SERIALIZED_NAME_BUYER_TYPE)
  private BuyerTypeEnum buyerType;

  public static final String SERIALIZED_NAME_PARTY = "party";
  @SerializedName(SERIALIZED_NAME_PARTY)
  private BusinessBuyerParty party;

  public static final String SERIALIZED_NAME_E_INVOICING = "eInvoicing";
  @SerializedName(SERIALIZED_NAME_E_INVOICING)
  private BusinessBuyerEInvoicing eInvoicing;

  public static final String SERIALIZED_NAME_CONTACT_PERSON = "contactPerson";
  @SerializedName(SERIALIZED_NAME_CONTACT_PERSON)
  private BusinessBuyerContactPerson contactPerson;

  public static final String SERIALIZED_NAME_CONTACT_ADDRESS = "contactAddress";
  @SerializedName(SERIALIZED_NAME_CONTACT_ADDRESS)
  private BusinessAddress contactAddress;

  public static final String SERIALIZED_NAME_BILLING_ADDRESS = "billingAddress";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS)
  private BusinessAddress billingAddress;

  public BusinessBuyer() { 
  }

  public BusinessBuyer buyerRef(String buyerRef) {
    
    this.buyerRef = buyerRef;
    return this;
  }

   /**
   * External reference of buyer (By example: social reason of the company)
   * @return buyerRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Ma Petite Entreprise", value = "External reference of buyer (By example: social reason of the company)")

  public String getBuyerRef() {
    return buyerRef;
  }


  public void setBuyerRef(String buyerRef) {
    this.buyerRef = buyerRef;
  }


  public BusinessBuyer buyerType(BuyerTypeEnum buyerType) {
    
    this.buyerType = buyerType;
    return this;
  }

   /**
   * Get buyerType
   * @return buyerType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "PROFESSIONNAL", required = true, value = "")

  public BuyerTypeEnum getBuyerType() {
    return buyerType;
  }


  public void setBuyerType(BuyerTypeEnum buyerType) {
    this.buyerType = buyerType;
  }


  public BusinessBuyer party(BusinessBuyerParty party) {
    
    this.party = party;
    return this;
  }

   /**
   * Get party
   * @return party
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BusinessBuyerParty getParty() {
    return party;
  }


  public void setParty(BusinessBuyerParty party) {
    this.party = party;
  }


  public BusinessBuyer eInvoicing(BusinessBuyerEInvoicing eInvoicing) {
    
    this.eInvoicing = eInvoicing;
    return this;
  }

   /**
   * Get eInvoicing
   * @return eInvoicing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BusinessBuyerEInvoicing geteInvoicing() {
    return eInvoicing;
  }


  public void seteInvoicing(BusinessBuyerEInvoicing eInvoicing) {
    this.eInvoicing = eInvoicing;
  }


  public BusinessBuyer contactPerson(BusinessBuyerContactPerson contactPerson) {
    
    this.contactPerson = contactPerson;
    return this;
  }

   /**
   * Get contactPerson
   * @return contactPerson
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BusinessBuyerContactPerson getContactPerson() {
    return contactPerson;
  }


  public void setContactPerson(BusinessBuyerContactPerson contactPerson) {
    this.contactPerson = contactPerson;
  }


  public BusinessBuyer contactAddress(BusinessAddress contactAddress) {
    
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


  public BusinessBuyer billingAddress(BusinessAddress billingAddress) {
    
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
    BusinessBuyer businessBuyer = (BusinessBuyer) o;
    return Objects.equals(this.buyerRef, businessBuyer.buyerRef) &&
        Objects.equals(this.buyerType, businessBuyer.buyerType) &&
        Objects.equals(this.party, businessBuyer.party) &&
        Objects.equals(this.eInvoicing, businessBuyer.eInvoicing) &&
        Objects.equals(this.contactPerson, businessBuyer.contactPerson) &&
        Objects.equals(this.contactAddress, businessBuyer.contactAddress) &&
        Objects.equals(this.billingAddress, businessBuyer.billingAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyerRef, buyerType, party, eInvoicing, contactPerson, contactAddress, billingAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessBuyer {\n");
    sb.append("    buyerRef: ").append(toIndentedString(buyerRef)).append("\n");
    sb.append("    buyerType: ").append(toIndentedString(buyerType)).append("\n");
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
    openapiFields.add("buyerRef");
    openapiFields.add("buyerType");
    openapiFields.add("party");
    openapiFields.add("eInvoicing");
    openapiFields.add("contactPerson");
    openapiFields.add("contactAddress");
    openapiFields.add("billingAddress");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("buyerType");
    openapiRequiredFields.add("contactPerson");
    openapiRequiredFields.add("contactAddress");
    openapiRequiredFields.add("billingAddress");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BusinessBuyer
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BusinessBuyer.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BusinessBuyer is not found in the empty JSON string", BusinessBuyer.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BusinessBuyer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BusinessBuyer` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BusinessBuyer.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("buyerRef") != null && !jsonObj.get("buyerRef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buyerRef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buyerRef").toString()));
      }
      if (jsonObj.get("buyerType") != null && !jsonObj.get("buyerType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buyerType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buyerType").toString()));
      }
      // validate the optional field `party`
      if (jsonObj.getAsJsonObject("party") != null) {
        BusinessBuyerParty.validateJsonObject(jsonObj.getAsJsonObject("party"));
      }
      // validate the optional field `eInvoicing`
      if (jsonObj.getAsJsonObject("eInvoicing") != null) {
        BusinessBuyerEInvoicing.validateJsonObject(jsonObj.getAsJsonObject("eInvoicing"));
      }
      // validate the optional field `contactPerson`
      if (jsonObj.getAsJsonObject("contactPerson") != null) {
        BusinessBuyerContactPerson.validateJsonObject(jsonObj.getAsJsonObject("contactPerson"));
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
       if (!BusinessBuyer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessBuyer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessBuyer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessBuyer.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessBuyer>() {
           @Override
           public void write(JsonWriter out, BusinessBuyer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BusinessBuyer read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BusinessBuyer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BusinessBuyer
  * @throws IOException if the JSON string is invalid with respect to BusinessBuyer
  */
  public static BusinessBuyer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessBuyer.class);
  }

 /**
  * Convert an instance of BusinessBuyer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

