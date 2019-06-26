package io.smooch.client.model;

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
}