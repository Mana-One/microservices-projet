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
 * Necessary for e-Invoicing &amp; e-Reporting
 */

@Schema(name = "BusinessDistributor_eFacturation", description = "Necessary for e-Invoicing & e-Reporting")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-02T16:42:48.383715+02:00[Europe/Paris]")
public class BusinessDistributorEFacturation   {

  @JsonProperty("siren")
  private String siren;

  @JsonProperty("tvaIntracommunautaire")
  private String tvaIntracommunautaire;

  @JsonProperty("country")
  private String country;

  public BusinessDistributorEFacturation siren(String siren) {
    this.siren = siren;
    return this;
  }

  /**
   * Get siren
   * @return siren
  */
  
  @Schema(name = "siren", example = "356000000", required = false)
  public String getSiren() {
    return siren;
  }

  public void setSiren(String siren) {
    this.siren = siren;
  }

  public BusinessDistributorEFacturation tvaIntracommunautaire(String tvaIntracommunautaire) {
    this.tvaIntracommunautaire = tvaIntracommunautaire;
    return this;
  }

  /**
   * Get tvaIntracommunautaire
   * @return tvaIntracommunautaire
  */
  
  @Schema(name = "tvaIntracommunautaire", example = "FR39356000000", required = false)
  public String getTvaIntracommunautaire() {
    return tvaIntracommunautaire;
  }

  public void setTvaIntracommunautaire(String tvaIntracommunautaire) {
    this.tvaIntracommunautaire = tvaIntracommunautaire;
  }

  public BusinessDistributorEFacturation country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  */
  
  @Schema(name = "country", example = "FRANCE", required = false)
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessDistributorEFacturation businessDistributorEFacturation = (BusinessDistributorEFacturation) o;
    return Objects.equals(this.siren, businessDistributorEFacturation.siren) &&
        Objects.equals(this.tvaIntracommunautaire, businessDistributorEFacturation.tvaIntracommunautaire) &&
        Objects.equals(this.country, businessDistributorEFacturation.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siren, tvaIntracommunautaire, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessDistributorEFacturation {\n");
    sb.append("    siren: ").append(toIndentedString(siren)).append("\n");
    sb.append("    tvaIntracommunautaire: ").append(toIndentedString(tvaIntracommunautaire)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

