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
 * ContractResponseAllOf
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-02T16:42:48.383715+02:00[Europe/Paris]")
public class ContractResponseAllOf   {

  @JsonProperty("contractId")
  private Integer contractId;

  @JsonProperty("contractRef")
  private String contractRef;

  public ContractResponseAllOf contractId(Integer contractId) {
    this.contractId = contractId;
    return this;
  }

  /**
   * Internal identifier of the contract
   * @return contractId
  */
  
  @Schema(name = "contractId", example = "58761542", description = "Internal identifier of the contract", required = false)
  public Integer getContractId() {
    return contractId;
  }

  public void setContractId(Integer contractId) {
    this.contractId = contractId;
  }

  public ContractResponseAllOf contractRef(String contractRef) {
    this.contractRef = contractRef;
    return this;
  }

  /**
   * External identifier of the contract
   * @return contractRef
  */
  
  @Schema(name = "contractRef", example = "SUB-YTYE65687", description = "External identifier of the contract", required = false)
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
    ContractResponseAllOf contractResponseAllOf = (ContractResponseAllOf) o;
    return Objects.equals(this.contractId, contractResponseAllOf.contractId) &&
        Objects.equals(this.contractRef, contractResponseAllOf.contractRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractId, contractRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractResponseAllOf {\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
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
}

