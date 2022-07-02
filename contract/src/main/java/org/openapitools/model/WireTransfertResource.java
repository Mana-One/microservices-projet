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
 * SEPA Informations
 */

@Schema(name = "WireTransfertResource", description = "SEPA Informations")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-02T16:42:48.383715+02:00[Europe/Paris]")
public class WireTransfertResource   {

  @JsonProperty("rum")
  private String rum;

  public WireTransfertResource rum(String rum) {
    this.rum = rum;
    return this;
  }

  /**
   * Référence Unique de Mandat
   * @return rum
  */
  
  @Schema(name = "rum", example = "RUM08918098739762ABCGDF65524255658", description = "Référence Unique de Mandat", required = false)
  public String getRum() {
    return rum;
  }

  public void setRum(String rum) {
    this.rum = rum;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WireTransfertResource wireTransfertResource = (WireTransfertResource) o;
    return Objects.equals(this.rum, wireTransfertResource.rum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WireTransfertResource {\n");
    sb.append("    rum: ").append(toIndentedString(rum)).append("\n");
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

