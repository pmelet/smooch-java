/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 5.14
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.smooch.client.model.Message;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * QuotedMessage
 */

public class QuotedMessage {
  @SerializedName("type")
  private String type = null;

  @SerializedName("externalMessageId")
  private String externalMessageId = null;

  @SerializedName("content")
  private Message content = null;

  public QuotedMessage type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The quoted message type. See [**QuotedMessageTypeEnum**](Enums.md#QuotedMessageTypeEnum) for available values.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The quoted message type. See [**QuotedMessageTypeEnum**](Enums.md#QuotedMessageTypeEnum) for available values.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public QuotedMessage externalMessageId(String externalMessageId) {
    this.externalMessageId = externalMessageId;
    return this;
  }

   /**
   * The external message Id of the quoted message. Only for quoted messages with type set to externalMessageId. 
   * @return externalMessageId
  **/
  @ApiModelProperty(value = "The external message Id of the quoted message. Only for quoted messages with type set to externalMessageId. ")
  public String getExternalMessageId() {
    return externalMessageId;
  }

  public void setExternalMessageId(String externalMessageId) {
    this.externalMessageId = externalMessageId;
  }

  public QuotedMessage content(Message content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")
  public Message getContent() {
    return content;
  }

  public void setContent(Message content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotedMessage quotedMessage = (QuotedMessage) o;
    return Objects.equals(this.type, quotedMessage.type) &&
        Objects.equals(this.externalMessageId, quotedMessage.externalMessageId) &&
        Objects.equals(this.content, quotedMessage.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, externalMessageId, content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuotedMessage {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    externalMessageId: ").append(toIndentedString(externalMessageId)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

