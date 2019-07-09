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
import io.smooch.client.model.MergedUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AppUserMerge
 */

public class AppUserMerge {
  @SerializedName("surviving")
  private MergedUser surviving = null;

  @SerializedName("discarded")
  private MergedUser discarded = null;

  public AppUserMerge surviving(MergedUser surviving) {
    this.surviving = surviving;
    return this;
  }

   /**
   * Nested object representing the user that will survive at the end of the merge
   * @return surviving
  **/
  @ApiModelProperty(required = true, value = "Nested object representing the user that will survive at the end of the merge")
  public MergedUser getSurviving() {
    return surviving;
  }

  public void setSurviving(MergedUser surviving) {
    this.surviving = surviving;
  }

  public AppUserMerge discarded(MergedUser discarded) {
    this.discarded = discarded;
    return this;
  }

   /**
   * Nested object representing the user to merge into the surviving user. This user will be deleted as part of the process.
   * @return discarded
  **/
  @ApiModelProperty(required = true, value = "Nested object representing the user to merge into the surviving user. This user will be deleted as part of the process.")
  public MergedUser getDiscarded() {
    return discarded;
  }

  public void setDiscarded(MergedUser discarded) {
    this.discarded = discarded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppUserMerge appUserMerge = (AppUserMerge) o;
    return Objects.equals(this.surviving, appUserMerge.surviving) &&
        Objects.equals(this.discarded, appUserMerge.discarded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(surviving, discarded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppUserMerge {\n");
    
    sb.append("    surviving: ").append(toIndentedString(surviving)).append("\n");
    sb.append("    discarded: ").append(toIndentedString(discarded)).append("\n");
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

