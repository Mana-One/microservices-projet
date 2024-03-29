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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.OperationRequestOrderOrderItemsInner;

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
 * Describes Purchase or Refund Operation
 */
@ApiModel(description = "Describes Purchase or Refund Operation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-04T15:12:40.475542300+02:00[Europe/Paris]")
public class OperationRequestOrder {
  public static final String SERIALIZED_NAME_ORDER_REF = "orderRef";
  @SerializedName(SERIALIZED_NAME_ORDER_REF)
  private String orderRef;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  /**
   * Necessary for e-Invoicing :  LB &#x3D; Livraison de Biens, PS &#x3D; Prestation de Service LBPS &#x3D; Double 
   */
  @JsonAdapter(OrderTypeEnum.Adapter.class)
  public enum OrderTypeEnum {
    LB("LB"),
    
    PS("PS"),
    
    LBPS("LBPS");

    private String value;

    OrderTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OrderTypeEnum fromValue(String value) {
      for (OrderTypeEnum b : OrderTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OrderTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrderTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OrderTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OrderTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ORDER_TYPE = "orderType";
  @SerializedName(SERIALIZED_NAME_ORDER_TYPE)
  private OrderTypeEnum orderType;

  public static final String SERIALIZED_NAME_ORDER_ITEMS = "orderItems";
  @SerializedName(SERIALIZED_NAME_ORDER_ITEMS)
  private List<OperationRequestOrderOrderItemsInner> orderItems = null;

  public static final String SERIALIZED_NAME_TOTAL_WITHOUT_TAX = "totalWithoutTax";
  @SerializedName(SERIALIZED_NAME_TOTAL_WITHOUT_TAX)
  private BigDecimal totalWithoutTax;

  public static final String SERIALIZED_NAME_TOTAL_TAX = "totalTax";
  @SerializedName(SERIALIZED_NAME_TOTAL_TAX)
  private BigDecimal totalTax;

  public static final String SERIALIZED_NAME_TOTAL_WITH_TAX = "totalWithTax";
  @SerializedName(SERIALIZED_NAME_TOTAL_WITH_TAX)
  private BigDecimal totalWithTax;

  public static final String SERIALIZED_NAME_AMOUNT_ECO_PARTICIPATION = "amountEcoParticipation";
  @SerializedName(SERIALIZED_NAME_AMOUNT_ECO_PARTICIPATION)
  private BigDecimal amountEcoParticipation;

  public OperationRequestOrder() { 
  }

  public OperationRequestOrder orderRef(String orderRef) {
    
    this.orderRef = orderRef;
    return this;
  }

   /**
   * External Order reference
   * @return orderRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "789e4567-e89b-12d3-a456-556642440000", value = "External Order reference")

  public String getOrderRef() {
    return orderRef;
  }


  public void setOrderRef(String orderRef) {
    this.orderRef = orderRef;
  }


  public OperationRequestOrder currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Billing currency code as defined in ISO 4217 ([more information about the standard](https://www.iso.org/fr/iso-4217-currency-codes.html))
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EUR", value = "Billing currency code as defined in ISO 4217 ([more information about the standard](https://www.iso.org/fr/iso-4217-currency-codes.html))")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public OperationRequestOrder orderType(OrderTypeEnum orderType) {
    
    this.orderType = orderType;
    return this;
  }

   /**
   * Necessary for e-Invoicing :  LB &#x3D; Livraison de Biens, PS &#x3D; Prestation de Service LBPS &#x3D; Double 
   * @return orderType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "LB", value = "Necessary for e-Invoicing :  LB = Livraison de Biens, PS = Prestation de Service LBPS = Double ")

  public OrderTypeEnum getOrderType() {
    return orderType;
  }


  public void setOrderType(OrderTypeEnum orderType) {
    this.orderType = orderType;
  }


  public OperationRequestOrder orderItems(List<OperationRequestOrderOrderItemsInner> orderItems) {
    
    this.orderItems = orderItems;
    return this;
  }

  public OperationRequestOrder addOrderItemsItem(OperationRequestOrderOrderItemsInner orderItemsItem) {
    if (this.orderItems == null) {
      this.orderItems = new ArrayList<>();
    }
    this.orderItems.add(orderItemsItem);
    return this;
  }

   /**
   * Get orderItems
   * @return orderItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OperationRequestOrderOrderItemsInner> getOrderItems() {
    return orderItems;
  }


  public void setOrderItems(List<OperationRequestOrderOrderItemsInner> orderItems) {
    this.orderItems = orderItems;
  }


  public OperationRequestOrder totalWithoutTax(BigDecimal totalWithoutTax) {
    
    this.totalWithoutTax = totalWithoutTax;
    return this;
  }

   /**
   * Get totalWithoutTax
   * @return totalWithoutTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTotalWithoutTax() {
    return totalWithoutTax;
  }


  public void setTotalWithoutTax(BigDecimal totalWithoutTax) {
    this.totalWithoutTax = totalWithoutTax;
  }


  public OperationRequestOrder totalTax(BigDecimal totalTax) {
    
    this.totalTax = totalTax;
    return this;
  }

   /**
   * Get totalTax
   * @return totalTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTotalTax() {
    return totalTax;
  }


  public void setTotalTax(BigDecimal totalTax) {
    this.totalTax = totalTax;
  }


  public OperationRequestOrder totalWithTax(BigDecimal totalWithTax) {
    
    this.totalWithTax = totalWithTax;
    return this;
  }

   /**
   * Get totalWithTax
   * @return totalWithTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTotalWithTax() {
    return totalWithTax;
  }


  public void setTotalWithTax(BigDecimal totalWithTax) {
    this.totalWithTax = totalWithTax;
  }


  public OperationRequestOrder amountEcoParticipation(BigDecimal amountEcoParticipation) {
    
    this.amountEcoParticipation = amountEcoParticipation;
    return this;
  }

   /**
   * Necessary for e-Invoicing
   * @return amountEcoParticipation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Necessary for e-Invoicing")

  public BigDecimal getAmountEcoParticipation() {
    return amountEcoParticipation;
  }


  public void setAmountEcoParticipation(BigDecimal amountEcoParticipation) {
    this.amountEcoParticipation = amountEcoParticipation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationRequestOrder operationRequestOrder = (OperationRequestOrder) o;
    return Objects.equals(this.orderRef, operationRequestOrder.orderRef) &&
        Objects.equals(this.currencyCode, operationRequestOrder.currencyCode) &&
        Objects.equals(this.orderType, operationRequestOrder.orderType) &&
        Objects.equals(this.orderItems, operationRequestOrder.orderItems) &&
        Objects.equals(this.totalWithoutTax, operationRequestOrder.totalWithoutTax) &&
        Objects.equals(this.totalTax, operationRequestOrder.totalTax) &&
        Objects.equals(this.totalWithTax, operationRequestOrder.totalWithTax) &&
        Objects.equals(this.amountEcoParticipation, operationRequestOrder.amountEcoParticipation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderRef, currencyCode, orderType, orderItems, totalWithoutTax, totalTax, totalWithTax, amountEcoParticipation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationRequestOrder {\n");
    sb.append("    orderRef: ").append(toIndentedString(orderRef)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    orderItems: ").append(toIndentedString(orderItems)).append("\n");
    sb.append("    totalWithoutTax: ").append(toIndentedString(totalWithoutTax)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
    sb.append("    totalWithTax: ").append(toIndentedString(totalWithTax)).append("\n");
    sb.append("    amountEcoParticipation: ").append(toIndentedString(amountEcoParticipation)).append("\n");
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
    openapiFields.add("orderRef");
    openapiFields.add("currencyCode");
    openapiFields.add("orderType");
    openapiFields.add("orderItems");
    openapiFields.add("totalWithoutTax");
    openapiFields.add("totalTax");
    openapiFields.add("totalWithTax");
    openapiFields.add("amountEcoParticipation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OperationRequestOrder
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OperationRequestOrder.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OperationRequestOrder is not found in the empty JSON string", OperationRequestOrder.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OperationRequestOrder.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OperationRequestOrder` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("orderRef") != null && !jsonObj.get("orderRef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderRef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderRef").toString()));
      }
      if (jsonObj.get("currencyCode") != null && !jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
      if (jsonObj.get("orderType") != null && !jsonObj.get("orderType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderType").toString()));
      }
      JsonArray jsonArrayorderItems = jsonObj.getAsJsonArray("orderItems");
      if (jsonArrayorderItems != null) {
        // ensure the json data is an array
        if (!jsonObj.get("orderItems").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `orderItems` to be an array in the JSON string but got `%s`", jsonObj.get("orderItems").toString()));
        }

        // validate the optional field `orderItems` (array)
        for (int i = 0; i < jsonArrayorderItems.size(); i++) {
          OperationRequestOrderOrderItemsInner.validateJsonObject(jsonArrayorderItems.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OperationRequestOrder.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OperationRequestOrder' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OperationRequestOrder> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OperationRequestOrder.class));

       return (TypeAdapter<T>) new TypeAdapter<OperationRequestOrder>() {
           @Override
           public void write(JsonWriter out, OperationRequestOrder value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OperationRequestOrder read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OperationRequestOrder given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OperationRequestOrder
  * @throws IOException if the JSON string is invalid with respect to OperationRequestOrder
  */
  public static OperationRequestOrder fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OperationRequestOrder.class);
  }

 /**
  * Convert an instance of OperationRequestOrder to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

