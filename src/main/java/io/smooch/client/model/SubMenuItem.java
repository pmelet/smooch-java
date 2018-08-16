/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 3.15
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
 * SubMenuItem
 */

public class SubMenuItem {
  @SerializedName("text")
  private String text = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("payload")
  private String payload = null;

  public SubMenuItem text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The button text of the menu item.
   * @return text
  **/
  @ApiModelProperty(required = true, value = "The button text of the menu item.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public SubMenuItem uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * A valid address, like http://smooch.io. Required for a link type item.
   * @return uri
  **/
  @ApiModelProperty(value = "A valid address, like http://smooch.io. Required for a link type item.")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public SubMenuItem type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Can either be link, postback, which correspond to Smooch’s link and postback actions, or submenu for nested menus.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Can either be link, postback, which correspond to Smooch’s link and postback actions, or submenu for nested menus.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SubMenuItem payload(String payload) {
    this.payload = payload;
    return this;
  }

   /**
   * A payload for a postback. Required for a postback type item.
   * @return payload
  **/
  @ApiModelProperty(value = "A payload for a postback. Required for a postback type item.")
  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubMenuItem subMenuItem = (SubMenuItem) o;
    return Objects.equals(this.text, subMenuItem.text) &&
        Objects.equals(this.uri, subMenuItem.uri) &&
        Objects.equals(this.type, subMenuItem.type) &&
        Objects.equals(this.payload, subMenuItem.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, uri, type, payload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubMenuItem {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

