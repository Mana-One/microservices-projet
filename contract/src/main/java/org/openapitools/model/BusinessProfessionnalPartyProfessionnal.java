package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Desribes professionnal party
 */

@Schema(name = "BusinessProfessionnalParty_professionnal", description = "Desribes professionnal party")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-02T16:42:48.383715+02:00[Europe/Paris]")
public class BusinessProfessionnalPartyProfessionnal   {

  @JsonProperty("customerId")
  private String customerId;

  @JsonProperty("customerRef")
  private String customerRef;

  public BusinessProfessionnalPartyProfessionnal customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Internal Identifier of organisation
   * @return customerId
  */
  
  @Schema(name = "customerId", example = "PRO-8996786873", description = "Internal Identifier of organisation", required = false)
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public BusinessProfessionnalPartyProfessionnal customerRef(String customerRef) {
    this.customerRef = customerRef;
    return this;
  }

  /**
   * External identifier of organisation (i.e. CUSTOMER)
   * @return customerRef
  */
  
  @Schema(name = "customerRef", example = "CUSTOMER NUMBER", description = "External identifier of organisation (i.e. CUSTOMER)", required = false)
  public String getCustomerRef() {
    return customerRef;
  }

  public void setCustomerRef(String customerRef) {
    this.customerRef = customerRef;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessProfessionnalPartyProfessionnal businessProfessionnalPartyProfessionnal = (BusinessProfessionnalPartyProfessionnal) o;
    return Objects.equals(this.customerId, businessProfessionnalPartyProfessionnal.customerId) &&
        Objects.equals(this.customerRef, businessProfessionnalPartyProfessionnal.customerRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, customerRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessProfessionnalPartyProfessionnal {\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerRef: ").append(toIndentedString(customerRef)).append("\n");
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

