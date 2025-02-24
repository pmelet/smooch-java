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
 * Select
 */

public class Select {
  @SerializedName("_id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("label")
  private String label = null;

  public Select id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The select ID, generated automatically.
   * @return id
  **/
  @ApiModelProperty(value = "The select ID, generated automatically.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Select name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the selected option.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the selected option.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Select label(String label) {
    this.label = label;
    return this;
  }

   /**
   * The label of the selected option.
   * @return label
  **/
  @ApiModelProperty(required = true, value = "The label of the selected option.")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Select select = (Select) o;
    return Objects.equals(this.id, select.id) &&
        Objects.equals(this.name, select.name) &&
        Objects.equals(this.label, select.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, label);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Select {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

