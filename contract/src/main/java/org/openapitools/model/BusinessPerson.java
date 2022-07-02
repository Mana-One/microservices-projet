package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BusinessPerson
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-02T16:42:48.383715+02:00[Europe/Paris]")
public class BusinessPerson   {

  @JsonProperty("ccui")
  private JsonNullable<Object> ccui = JsonNullable.undefined();

  /**
   * Gender of the contact
   */
  public enum GenderEnum {
    M("M"),
    
    MME("MME");

    private String value;

    GenderEnum(String value) {
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
    public static GenderEnum fromValue(String value) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("gender")
  private GenderEnum gender;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("mail")
  private String mail;

  @JsonProperty("phone")
  private String phone;

  public BusinessPerson ccui(Object ccui) {
    this.ccui = JsonNullable.of(ccui);
    return this;
  }

  /**
   * CCUI
   * @return ccui
  */
  
  @Schema(name = "ccui", example = "CCU-123", description = "CCUI", required = false)
  public JsonNullable<Object> getCcui() {
    return ccui;
  }

  public void setCcui(JsonNullable<Object> ccui) {
    this.ccui = ccui;
  }

  public BusinessPerson gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Gender of the contact
   * @return gender
  */
  
  @Schema(name = "gender", example = "M", description = "Gender of the contact", required = false)
  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public BusinessPerson firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name of the contact
   * @return firstName
  */
  
  @Schema(name = "firstName", example = "John", description = "First name of the contact", required = false)
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public BusinessPerson lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name of the contact
   * @return lastName
  */
  @NotNull 
  @Schema(name = "lastName", example = "DOE", description = "Last name of the contact", required = true)
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public BusinessPerson mail(String mail) {
    this.mail = mail;
    return this;
  }

  /**
   * Mail address of the contact
   * @return mail
  */
  @NotNull @javax.validation.constraints.Email
  @Schema(name = "mail", example = "john.doe@acme.com", description = "Mail address of the contact", required = true)
  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public BusinessPerson phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Phone number of the contact
   * @return phone
  */
  
  @Schema(name = "phone", example = "+33 (0)1 56 87 65 78", description = "Phone number of the contact", required = false)
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessPerson businessPerson = (BusinessPerson) o;
    return Objects.equals(this.ccui, businessPerson.ccui) &&
        Objects.equals(this.gender, businessPerson.gender) &&
        Objects.equals(this.firstName, businessPerson.firstName) &&
        Objects.equals(this.lastName, businessPerson.lastName) &&
        Objects.equals(this.mail, businessPerson.mail) &&
        Objects.equals(this.phone, businessPerson.phone);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ccui, gender, firstName, lastName, mail, phone);
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
    sb.append("class BusinessPerson {\n");
    sb.append("    ccui: ").append(toIndentedString(ccui)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

