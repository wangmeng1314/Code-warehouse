package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * Profile
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-05T01:24:56.281Z")

public class Profile   {
  @JsonProperty("first_name")
  private String firstName = null;

  @JsonProperty("last_name")
  private String lastName = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("picture")
  private String picture = null;

  @JsonProperty("promo_code")
  private String promoCode = null;

  public Profile firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of the Uber user.
   * @return firstName
  **/
  @ApiModelProperty(value = "First name of the Uber user.")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Profile lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of the Uber user.
   * @return lastName
  **/
  @ApiModelProperty(value = "Last name of the Uber user.")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Profile email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email address of the Uber user
   * @return email
  **/
  @ApiModelProperty(value = "Email address of the Uber user")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Profile picture(String picture) {
    this.picture = picture;
    return this;
  }

   /**
   * Image URL of the Uber user.
   * @return picture
  **/
  @ApiModelProperty(value = "Image URL of the Uber user.")
  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }

  public Profile promoCode(String promoCode) {
    this.promoCode = promoCode;
    return this;
  }

   /**
   * Promo code of the Uber user.
   * @return promoCode
  **/
  @ApiModelProperty(value = "Promo code of the Uber user.")
  public String getPromoCode() {
    return promoCode;
  }

  public void setPromoCode(String promoCode) {
    this.promoCode = promoCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Profile profile = (Profile) o;
    return Objects.equals(this.firstName, profile.firstName) &&
        Objects.equals(this.lastName, profile.lastName) &&
        Objects.equals(this.email, profile.email) &&
        Objects.equals(this.picture, profile.picture) &&
        Objects.equals(this.promoCode, profile.promoCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, email, picture, promoCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Profile {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
    sb.append("    promoCode: ").append(toIndentedString(promoCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

