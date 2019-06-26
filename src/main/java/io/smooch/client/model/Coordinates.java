package io.smooch.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * Action
 */

public class Coordinates {
  @SerializedName("lat")
  private Double latitude = null;

  @SerializedName("long")
  private Double longitude = null;

  public Coordinates lat(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  @ApiModelProperty(required = true, value = "A floating point value representing the latitude of the location.")
  public Double getLat() {
    return latitude;
  }

  public void setLat(Double latitude) {
    this.latitude = latitude;
  }

  @ApiModelProperty(required = true, value = "A floating point value representing the longitude of the location.")
  public Double getLong() {
    return longitude;
  }

  public void setLong(Double longitude) {
    this.longitude = longitude;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Coordinates coordinates = (Coordinates) o;
    return Objects.equals(this.latitude, coordinates.latitude) &&
            Objects.equals(this.longitude, coordinates.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Coordinates {\n");
    sb.append("    lat: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    long: ").append(toIndentedString(longitude)).append("\n");
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