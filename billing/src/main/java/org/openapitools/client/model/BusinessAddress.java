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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * A postal address splitted in 6 lines ordered as defined in RNVP and french standard AFNOR NF Z 10-011 ([more information about the standards](http://www.rnvp-internationale.com/norme-postale/NF-Z-10-011.php)). All the lines are mandatory. Lines that are optional may be empty. 
 */
@ApiModel(description = "A postal address splitted in 6 lines ordered as defined in RNVP and french standard AFNOR NF Z 10-011 ([more information about the standards](http://www.rnvp-internationale.com/norme-postale/NF-Z-10-011.php)). All the lines are mandatory. Lines that are optional may be empty. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-04T15:12:40.475542300+02:00[Europe/Paris]")
public class BusinessAddress {
  public static final String SERIALIZED_NAME_LINE1 = "line1";
  @SerializedName(SERIALIZED_NAME_LINE1)
  private String line1;

  public static final String SERIALIZED_NAME_LINE2 = "line2";
  @SerializedName(SERIALIZED_NAME_LINE2)
  private String line2;

  public static final String SERIALIZED_NAME_LINE3 = "line3";
  @SerializedName(SERIALIZED_NAME_LINE3)
  private String line3;

  public static final String SERIALIZED_NAME_LINE4 = "line4";
  @SerializedName(SERIALIZED_NAME_LINE4)
  private String line4;

  public static final String SERIALIZED_NAME_LINE5 = "line5";
  @SerializedName(SERIALIZED_NAME_LINE5)
  private Object line5 = null;

  public static final String SERIALIZED_NAME_LOCALITY = "locality";
  @SerializedName(SERIALIZED_NAME_LOCALITY)
  private String locality;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_COUNTRY_NAME = "countryName";
  @SerializedName(SERIALIZED_NAME_COUNTRY_NAME)
  private String countryName;

  public BusinessAddress() { 
  }

  public BusinessAddress line1(String line1) {
    
    this.line1 = line1;
    return this;
  }

   /**
   * Particular: CIVILITÉ - TITRE ou QUALITÉ - PRÉNOM - NOM Progessionnal: RAISON SOCIALE ou DÉNOMINATION 
   * @return line1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ESGI SA", value = "Particular: CIVILITÉ - TITRE ou QUALITÉ - PRÉNOM - NOM Progessionnal: RAISON SOCIALE ou DÉNOMINATION ")

  public String getLine1() {
    return line1;
  }


  public void setLine1(String line1) {
    this.line1 = line1;
  }


  public BusinessAddress line2(String line2) {
    
    this.line2 = line2;
    return this;
  }

   /**
   * Particular: N°APP ou BAL - ÉTAGE - COULOIR - ESC Professionnal: IDENTITÉ DU DESTINATAIRE et ou SERVICE 
   * @return line2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Service comptabilité", value = "Particular: N°APP ou BAL - ÉTAGE - COULOIR - ESC Professionnal: IDENTITÉ DU DESTINATAIRE et ou SERVICE ")

  public String getLine2() {
    return line2;
  }


  public void setLine2(String line2) {
    this.line2 = line2;
  }


  public BusinessAddress line3(String line3) {
    
    this.line3 = line3;
    return this;
  }

   /**
   * ENTRÉE - BÂTIMENT - IMMEUBLE - RÉS - ZI
   * @return line3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ENTRÉE - BÂTIMENT - IMMEUBLE - RÉS - ZI")

  public String getLine3() {
    return line3;
  }


  public void setLine3(String line3) {
    this.line3 = line3;
  }


  public BusinessAddress line4(String line4) {
    
    this.line4 = line4;
    return this;
  }

   /**
   * NUMÉRO - LIBELLÉ DE LA VOIE
   * @return line4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NUMÉRO - LIBELLÉ DE LA VOIE")

  public String getLine4() {
    return line4;
  }


  public void setLine4(String line4) {
    this.line4 = line4;
  }


  public BusinessAddress line5(Object line5) {
    
    this.line5 = line5;
    return this;
  }

   /**
   * LIEU DIT ou SERVICE PARTICULIER DE DISTRIBUTION
   * @return line5
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "LIEU DIT ou SERVICE PARTICULIER DE DISTRIBUTION")

  public Object getLine5() {
    return line5;
  }


  public void setLine5(Object line5) {
    this.line5 = line5;
  }


  public BusinessAddress locality(String locality) {
    
    this.locality = locality;
    return this;
  }

   /**
   * Name of the locality of the address
   * @return locality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the locality of the address")

  public String getLocality() {
    return locality;
  }


  public void setLocality(String locality) {
    this.locality = locality;
  }


  public BusinessAddress countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Country code as defined in standard ISO 3166 ([more information about the standard](https://www.iso.org/fr/iso-3166-country-codes.html))
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Country code as defined in standard ISO 3166 ([more information about the standard](https://www.iso.org/fr/iso-3166-country-codes.html))")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public BusinessAddress countryName(String countryName) {
    
    this.countryName = countryName;
    return this;
  }

   /**
   * Country name as defined in standard ISO 3166 ([more information about the standard](https://www.iso.org/fr/iso-3166-country-codes.html))
   * @return countryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Country name as defined in standard ISO 3166 ([more information about the standard](https://www.iso.org/fr/iso-3166-country-codes.html))")

  public String getCountryName() {
    return countryName;
  }


  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessAddress businessAddress = (BusinessAddress) o;
    return Objects.equals(this.line1, businessAddress.line1) &&
        Objects.equals(this.line2, businessAddress.line2) &&
        Objects.equals(this.line3, businessAddress.line3) &&
        Objects.equals(this.line4, businessAddress.line4) &&
        Objects.equals(this.line5, businessAddress.line5) &&
        Objects.equals(this.locality, businessAddress.locality) &&
        Objects.equals(this.countryCode, businessAddress.countryCode) &&
        Objects.equals(this.countryName, businessAddress.countryName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(line1, line2, line3, line4, line5, locality, countryCode, countryName);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessAddress {\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    line3: ").append(toIndentedString(line3)).append("\n");
    sb.append("    line4: ").append(toIndentedString(line4)).append("\n");
    sb.append("    line5: ").append(toIndentedString(line5)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
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
    openapiFields.add("line1");
    openapiFields.add("line2");
    openapiFields.add("line3");
    openapiFields.add("line4");
    openapiFields.add("line5");
    openapiFields.add("locality");
    openapiFields.add("countryCode");
    openapiFields.add("countryName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BusinessAddress
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BusinessAddress.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BusinessAddress is not found in the empty JSON string", BusinessAddress.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BusinessAddress.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BusinessAddress` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("line1") != null && !jsonObj.get("line1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `line1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("line1").toString()));
      }
      if (jsonObj.get("line2") != null && !jsonObj.get("line2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `line2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("line2").toString()));
      }
      if (jsonObj.get("line3") != null && !jsonObj.get("line3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `line3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("line3").toString()));
      }
      if (jsonObj.get("line4") != null && !jsonObj.get("line4").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `line4` to be a primitive type in the JSON string but got `%s`", jsonObj.get("line4").toString()));
      }
      if (jsonObj.get("locality") != null && !jsonObj.get("locality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locality").toString()));
      }
      if (jsonObj.get("countryCode") != null && !jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
      if (jsonObj.get("countryName") != null && !jsonObj.get("countryName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessAddress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessAddress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessAddress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessAddress.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessAddress>() {
           @Override
           public void write(JsonWriter out, BusinessAddress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BusinessAddress read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BusinessAddress given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BusinessAddress
  * @throws IOException if the JSON string is invalid with respect to BusinessAddress
  */
  public static BusinessAddress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessAddress.class);
  }

 /**
  * Convert an instance of BusinessAddress to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

