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
 * Describe contract action
 */

@Schema(name = "ContractActionRequest", description = "Describe contract action")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-02T16:42:48.383715+02:00[Europe/Paris]")
public class ContractActionRequest   {

  @JsonProperty("action")
  private String action;

  @JsonProperty("contractRef")
  private String contractRef;

  public ContractActionRequest action(String action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
  */
  
  @Schema(name = "action", example = "activation", required = false)
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
  */
  
  @Schema(name = "contractRef", required = false)
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
}

