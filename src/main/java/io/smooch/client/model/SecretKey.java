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
 * SecretKey
 */

public class SecretKey {
  @SerializedName("_id")
  private String id = null;

  @SerializedName("secret")
  private String secret = null;

  @SerializedName("name")
  private String name = null;

  public SecretKey id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The secret key ID, generated automatically.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The secret key ID, generated automatically.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SecretKey secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * The secret itself.
   * @return secret
  **/
  @ApiModelProperty(required = true, value = "The secret itself.")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public SecretKey name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A friendly identifier for the secret key.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "A friendly identifier for the secret key.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecretKey secretKey = (SecretKey) o;
    return Objects.equals(this.id, secretKey.id) &&
        Objects.equals(this.secret, secretKey.secret) &&
        Objects.equals(this.name, secretKey.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, secret, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecretKey {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

