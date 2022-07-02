package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.WireTransfertResource;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Describes the payment method used
 */

@Schema(name = "BusinessPayment", description = "Describes the payment method used")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-02T16:42:48.383715+02:00[Europe/Paris]")
public class BusinessPayment   {

  /**
   * Payment method type (Only WIRETRANSFER for differed billing phase 1)
   */
  public enum PaymentMethodTypeEnum {
    WIRETRANSFER("WIRETRANSFER");

    private String value;

    PaymentMethodTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PaymentMethodTypeEnum fromValue(String value) {
      for (PaymentMethodTypeEnum b : PaymentMethodTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("paymentMethodType")
  private PaymentMethodTypeEnum paymentMethodType;

  @JsonProperty("wireTansfert")
  private WireTransfertResource wireTansfert;

  public BusinessPayment paymentMethodType(PaymentMethodTypeEnum paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
    return this;
  }

  /**
   * Payment method type (Only WIRETRANSFER for differed billing phase 1)
   * @return paymentMethodType
  */
  @NotNull 
  @Schema(name = "paymentMethodType", example = "WIRETRANSFER", description = "Payment method type (Only WIRETRANSFER for differed billing phase 1)", required = true)
  public PaymentMethodTypeEnum getPaymentMethodType() {
    return paymentMethodType;
  }

  public void setPaymentMethodType(PaymentMethodTypeEnum paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
  }

  public BusinessPayment wireTansfert(WireTransfertResource wireTansfert) {
    this.wireTansfert = wireTansfert;
    return this;
  }

  /**
   * Get wireTansfert
   * @return wireTansfert
  */
  @Valid 
  @Schema(name = "wireTansfert", required = false)
  public WireTransfertResource getWireTansfert() {
    return wireTansfert;
  }

  public void setWireTansfert(WireTransfertResource wireTansfert) {
    this.wireTansfert = wireTansfert;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessPayment businessPayment = (BusinessPayment) o;
    return Objects.equals(this.paymentMethodType, businessPayment.paymentMethodType) &&
        Objects.equals(this.wireTansfert, businessPayment.wireTansfert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethodType, wireTansfert);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessPayment {\n");
    sb.append("    paymentMethodType: ").append(toIndentedString(paymentMethodType)).append("\n");
    sb.append("    wireTansfert: ").append(toIndentedString(wireTansfert)).append("\n");
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
}

