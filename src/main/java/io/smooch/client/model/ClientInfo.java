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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClientInfo
 */

public class ClientInfo {
  @SerializedName("appName")
  private String appName = null;

  @SerializedName("avatarUrl")
  private String avatarUrl = null;

  @SerializedName("carrier")
  private String carrier = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("deviceModel")
  private String deviceModel = null;

  @SerializedName("devicePlatform")
  private String devicePlatform = null;

  @SerializedName("gender")
  private String gender = null;

  @SerializedName("isPaymentEnabled")
  private Boolean isPaymentEnabled = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("os")
  private String os = null;

  @SerializedName("osVersion")
  private String osVersion = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("radioAccessTechnology")
  private String radioAccessTechnology = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("timezone")
  private Integer timezone = null;

  @SerializedName("wifi")
  private String wifi = null;

  public ClientInfo appName(String appName) {
    this.appName = appName;
    return this;
  }

   /**
   * Name of the app associated with the client.
   * @return appName
  **/
  @ApiModelProperty(value = "Name of the app associated with the client.")
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public ClientInfo avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * The client's avatar URL.
   * @return avatarUrl
  **/
  @ApiModelProperty(value = "The client's avatar URL.")
  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public ClientInfo carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }

   /**
   * The client's carrier.
   * @return carrier
  **/
  @ApiModelProperty(value = "The client's carrier.")
  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public ClientInfo city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The client's city.
   * @return city
  **/
  @ApiModelProperty(value = "The client's city.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public ClientInfo country(String country) {
    this.country = country;
    return this;
  }

   /**
   * The client's country.
   * @return country
  **/
  @ApiModelProperty(value = "The client's country.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public ClientInfo deviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
    return this;
  }

   /**
   * The client's device model.
   * @return deviceModel
  **/
  @ApiModelProperty(value = "The client's device model.")
  public String getDeviceModel() {
    return deviceModel;
  }

  public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
  }

  public ClientInfo devicePlatform(String devicePlatform) {
    this.devicePlatform = devicePlatform;
    return this;
  }

   /**
   * The client's device platform.
   * @return devicePlatform
  **/
  @ApiModelProperty(value = "The client's device platform.")
  public String getDevicePlatform() {
    return devicePlatform;
  }

  public void setDevicePlatform(String devicePlatform) {
    this.devicePlatform = devicePlatform;
  }

  public ClientInfo gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * The client user's gender.
   * @return gender
  **/
  @ApiModelProperty(value = "The client user's gender.")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public ClientInfo isPaymentEnabled(Boolean isPaymentEnabled) {
    this.isPaymentEnabled = isPaymentEnabled;
    return this;
  }

   /**
   * Whether or not payment is enabled for client.
   * @return isPaymentEnabled
  **/
  @ApiModelProperty(value = "Whether or not payment is enabled for client.")
  public Boolean getIsPaymentEnabled() {
    return isPaymentEnabled;
  }

  public void setIsPaymentEnabled(Boolean isPaymentEnabled) {
    this.isPaymentEnabled = isPaymentEnabled;
  }

  public ClientInfo locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * The client's locale.
   * @return locale
  **/
  @ApiModelProperty(value = "The client's locale.")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public ClientInfo os(String os) {
    this.os = os;
    return this;
  }

   /**
   * The client's OS.
   * @return os
  **/
  @ApiModelProperty(value = "The client's OS.")
  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }

  public ClientInfo osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

   /**
   * The client's OS version.
   * @return osVersion
  **/
  @ApiModelProperty(value = "The client's OS version.")
  public String getOsVersion() {
    return osVersion;
  }

  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

  public ClientInfo phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The client's phone number.
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "The client's phone number.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public ClientInfo radioAccessTechnology(String radioAccessTechnology) {
    this.radioAccessTechnology = radioAccessTechnology;
    return this;
  }

   /**
   * The client's radioAccessTechnology (Ex. HSDPA).
   * @return radioAccessTechnology
  **/
  @ApiModelProperty(value = "The client's radioAccessTechnology (Ex. HSDPA).")
  public String getRadioAccessTechnology() {
    return radioAccessTechnology;
  }

  public void setRadioAccessTechnology(String radioAccessTechnology) {
    this.radioAccessTechnology = radioAccessTechnology;
  }

  public ClientInfo state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The client's state or province.
   * @return state
  **/
  @ApiModelProperty(value = "The client's state or province.")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public ClientInfo timezone(Integer timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * The client's timezone offset.
   * @return timezone
  **/
  @ApiModelProperty(value = "The client's timezone offset.")
  public Integer getTimezone() {
    return timezone;
  }

  public void setTimezone(Integer timezone) {
    this.timezone = timezone;
  }

  public ClientInfo wifi(String wifi) {
    this.wifi = wifi;
    return this;
  }

   /**
   * Whether or not the client has wifi.
   * @return wifi
  **/
  @ApiModelProperty(value = "Whether or not the client has wifi.")
  public String getWifi() {
    return wifi;
  }

  public void setWifi(String wifi) {
    this.wifi = wifi;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientInfo clientInfo = (ClientInfo) o;
    return Objects.equals(this.appName, clientInfo.appName) &&
        Objects.equals(this.avatarUrl, clientInfo.avatarUrl) &&
        Objects.equals(this.carrier, clientInfo.carrier) &&
        Objects.equals(this.city, clientInfo.city) &&
        Objects.equals(this.country, clientInfo.country) &&
        Objects.equals(this.deviceModel, clientInfo.deviceModel) &&
        Objects.equals(this.devicePlatform, clientInfo.devicePlatform) &&
        Objects.equals(this.gender, clientInfo.gender) &&
        Objects.equals(this.isPaymentEnabled, clientInfo.isPaymentEnabled) &&
        Objects.equals(this.locale, clientInfo.locale) &&
        Objects.equals(this.os, clientInfo.os) &&
        Objects.equals(this.osVersion, clientInfo.osVersion) &&
        Objects.equals(this.phoneNumber, clientInfo.phoneNumber) &&
        Objects.equals(this.radioAccessTechnology, clientInfo.radioAccessTechnology) &&
        Objects.equals(this.state, clientInfo.state) &&
        Objects.equals(this.timezone, clientInfo.timezone) &&
        Objects.equals(this.wifi, clientInfo.wifi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, avatarUrl, carrier, city, country, deviceModel, devicePlatform, gender, isPaymentEnabled, locale, os, osVersion, phoneNumber, radioAccessTechnology, state, timezone, wifi);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientInfo {\n");
    
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    deviceModel: ").append(toIndentedString(deviceModel)).append("\n");
    sb.append("    devicePlatform: ").append(toIndentedString(devicePlatform)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    isPaymentEnabled: ").append(toIndentedString(isPaymentEnabled)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    radioAccessTechnology: ").append(toIndentedString(radioAccessTechnology)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    wifi: ").append(toIndentedString(wifi)).append("\n");
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

