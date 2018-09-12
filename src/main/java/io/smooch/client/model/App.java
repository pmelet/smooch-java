/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 3.17
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.smooch.client.model.AppSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * App
 */

public class App {
  @SerializedName("_id")
  private String id = null;

  @SerializedName("appToken")
  private String appToken = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("settings")
  private AppSettings settings = null;

  @SerializedName("metadata")
  private Object metadata = null;

  public App id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The app's ID.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The app's ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public App appToken(String appToken) {
    this.appToken = appToken;
    return this;
  }

   /**
   * The appToken, used to initialize the Web, iOS and Android clients and to make calls to the app user facing API.
   * @return appToken
  **/
  @ApiModelProperty(required = true, value = "The appToken, used to initialize the Web, iOS and Android clients and to make calls to the app user facing API.")
  public String getAppToken() {
    return appToken;
  }

  public void setAppToken(String appToken) {
    this.appToken = appToken;
  }

  public App name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The app's name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The app's name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public App settings(AppSettings settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @ApiModelProperty(value = "")
  public AppSettings getSettings() {
    return settings;
  }

  public void setSettings(AppSettings settings) {
    this.settings = settings;
  }

  public App metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Flat JSON object containing any custom properties associated with the app.
   * @return metadata
  **/
  @ApiModelProperty(value = "Flat JSON object containing any custom properties associated with the app.")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    App app = (App) o;
    return Objects.equals(this.id, app.id) &&
        Objects.equals(this.appToken, app.appToken) &&
        Objects.equals(this.name, app.name) &&
        Objects.equals(this.settings, app.settings) &&
        Objects.equals(this.metadata, app.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, appToken, name, settings, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class App {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    appToken: ").append(toIndentedString(appToken)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

