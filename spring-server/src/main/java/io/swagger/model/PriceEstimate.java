package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
/**
 * PriceEstimate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-05T01:24:56.281Z")

public class PriceEstimate   {
  @JsonProperty("product_id")
  private String productId = null;

  @JsonProperty("currency_code")
  private String currencyCode = null;

  @JsonProperty("display_name")
  private String displayName = null;

  @JsonProperty("estimate")
  private String estimate = null;

  @JsonProperty("low_estimate")
  private BigDecimal lowEstimate = null;

  @JsonProperty("high_estimate")
  private BigDecimal highEstimate = null;

  @JsonProperty("surge_multiplier")
  private BigDecimal surgeMultiplier = null;

  public PriceEstimate productId(String productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Unique identifier representing a specific product for a given latitude & longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles
   * @return productId
  **/
  @ApiModelProperty(value = "Unique identifier representing a specific product for a given latitude & longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles")
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public PriceEstimate currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217) currency code.
   * @return currencyCode
  **/
  @ApiModelProperty(value = "[ISO 4217](http://en.wikipedia.org/wiki/ISO_4217) currency code.")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public PriceEstimate displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name of product.
   * @return displayName
  **/
  @ApiModelProperty(value = "Display name of product.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public PriceEstimate estimate(String estimate) {
    this.estimate = estimate;
    return this;
  }

   /**
   * Formatted string of estimate in local currency of the start location. Estimate could be a range, a single number (flat rate) or \"Metered\" for TAXI.
   * @return estimate
  **/
  @ApiModelProperty(value = "Formatted string of estimate in local currency of the start location. Estimate could be a range, a single number (flat rate) or \"Metered\" for TAXI.")
  public String getEstimate() {
    return estimate;
  }

  public void setEstimate(String estimate) {
    this.estimate = estimate;
  }

  public PriceEstimate lowEstimate(BigDecimal lowEstimate) {
    this.lowEstimate = lowEstimate;
    return this;
  }

   /**
   * Lower bound of the estimated price.
   * @return lowEstimate
  **/
  @ApiModelProperty(value = "Lower bound of the estimated price.")
  public BigDecimal getLowEstimate() {
    return lowEstimate;
  }

  public void setLowEstimate(BigDecimal lowEstimate) {
    this.lowEstimate = lowEstimate;
  }

  public PriceEstimate highEstimate(BigDecimal highEstimate) {
    this.highEstimate = highEstimate;
    return this;
  }

   /**
   * Upper bound of the estimated price.
   * @return highEstimate
  **/
  @ApiModelProperty(value = "Upper bound of the estimated price.")
  public BigDecimal getHighEstimate() {
    return highEstimate;
  }

  public void setHighEstimate(BigDecimal highEstimate) {
    this.highEstimate = highEstimate;
  }

  public PriceEstimate surgeMultiplier(BigDecimal surgeMultiplier) {
    this.surgeMultiplier = surgeMultiplier;
    return this;
  }

   /**
   * Expected surge multiplier. Surge is active if surge_multiplier is greater than 1. Price estimate already factors in the surge multiplier.
   * @return surgeMultiplier
  **/
  @ApiModelProperty(value = "Expected surge multiplier. Surge is active if surge_multiplier is greater than 1. Price estimate already factors in the surge multiplier.")
  public BigDecimal getSurgeMultiplier() {
    return surgeMultiplier;
  }

  public void setSurgeMultiplier(BigDecimal surgeMultiplier) {
    this.surgeMultiplier = surgeMultiplier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceEstimate priceEstimate = (PriceEstimate) o;
    return Objects.equals(this.productId, priceEstimate.productId) &&
        Objects.equals(this.currencyCode, priceEstimate.currencyCode) &&
        Objects.equals(this.displayName, priceEstimate.displayName) &&
        Objects.equals(this.estimate, priceEstimate.estimate) &&
        Objects.equals(this.lowEstimate, priceEstimate.lowEstimate) &&
        Objects.equals(this.highEstimate, priceEstimate.highEstimate) &&
        Objects.equals(this.surgeMultiplier, priceEstimate.surgeMultiplier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, currencyCode, displayName, estimate, lowEstimate, highEstimate, surgeMultiplier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceEstimate {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    estimate: ").append(toIndentedString(estimate)).append("\n");
    sb.append("    lowEstimate: ").append(toIndentedString(lowEstimate)).append("\n");
    sb.append("    highEstimate: ").append(toIndentedString(highEstimate)).append("\n");
    sb.append("    surgeMultiplier: ").append(toIndentedString(surgeMultiplier)).append("\n");
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

