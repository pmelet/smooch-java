/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 5.16
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AppUserUpdate
 */

public class AppUserUpdate {
  @SerializedName("givenName")
  private String givenName = null;

  @SerializedName("surname")
  private String surname = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("signedUpAt")
  private String signedUpAt = null;

  @SerializedName("properties")
  private Object properties = null;

  public AppUserUpdate givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

   /**
   * The app user's given name.
   * @return givenName
  **/
  @ApiModelProperty(value = "The app user's given name.")
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public AppUserUpdate surname(String surname) {
    this.surname = surname;
    return this;
  }

   /**
   * The app user's surname.
   * @return surname
  **/
  @ApiModelProperty(value = "The app user's surname.")
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public AppUserUpdate email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The app user's email.
   * @return email
  **/
  @ApiModelProperty(value = "The app user's email.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AppUserUpdate signedUpAt(String signedUpAt) {
    this.signedUpAt = signedUpAt;
    return this;
  }

   /**
   * A datetime string with the format *yyyy-mm-ddThh:mm:ssZ* representing the moment an appUser was created.
   * @return signedUpAt
  **/
  @ApiModelProperty(value = "A datetime string with the format *yyyy-mm-ddThh:mm:ssZ* representing the moment an appUser was created.")
  public String getSignedUpAt() {
    return signedUpAt;
  }

  public void setSignedUpAt(String signedUpAt) {
    this.signedUpAt = signedUpAt;
  }

  public AppUserUpdate properties(Object properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Custom properties for the app user.
   * @return properties
  **/
  @ApiModelProperty(value = "Custom properties for the app user.")
  public Object getProperties() {
    return properties;
  }

  public void setProperties(Object properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppUserUpdate appUserUpdate = (AppUserUpdate) o;
    return Objects.equals(this.givenName, appUserUpdate.givenName) &&
        Objects.equals(this.surname, appUserUpdate.surname) &&
        Objects.equals(this.email, appUserUpdate.email) &&
        Objects.equals(this.signedUpAt, appUserUpdate.signedUpAt) &&
        Objects.equals(this.properties, appUserUpdate.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(givenName, surname, email, signedUpAt, properties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppUserUpdate {\n");
    
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    signedUpAt: ").append(toIndentedString(signedUpAt)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

