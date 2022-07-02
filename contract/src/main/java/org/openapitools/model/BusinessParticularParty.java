package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.BusinessParticularPartyParticular;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Describes particular physical person
 */

@Schema(name = "BusinessParticularParty", description = "Describes particular physical person")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-02T16:42:48.383715+02:00[Europe/Paris]")
public class BusinessParticularParty   {

  @JsonProperty("particular")
  private BusinessParticularPartyParticular particular;

  public BusinessParticularParty particular(BusinessParticularPartyParticular particular) {
    this.particular = particular;
    return this;
  }

  /**
   * Get particular
   * @return particular
  */
  @Valid 
  @Schema(name = "particular", required = false)
  public BusinessParticularPartyParticular getParticular() {
    return particular;
  }

  public void setParticular(BusinessParticularPartyParticular particular) {
    this.particular = particular;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessParticularParty businessParticularParty = (BusinessParticularParty) o;
    return Objects.equals(this.particular, businessParticularParty.particular);
  }

  @Override
  public int hashCode() {
    return Objects.hash(particular);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessParticularParty {\n");
    sb.append("    particular: ").append(toIndentedString(particular)).append("\n");
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

