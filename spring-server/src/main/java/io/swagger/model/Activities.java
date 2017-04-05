package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Activity;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * Activities
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-05T01:24:56.281Z")

public class Activities   {
  @JsonProperty("offset")
  private Integer offset = null;

  @JsonProperty("limit")
  private Integer limit = null;

  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("history")
  private List<Activity> history = new ArrayList<Activity>();

  public Activities offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Position in pagination.
   * @return offset
  **/
  @ApiModelProperty(value = "Position in pagination.")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public Activities limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Number of items to retrieve (100 max).
   * @return limit
  **/
  @ApiModelProperty(value = "Number of items to retrieve (100 max).")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public Activities count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Total number of items available.
   * @return count
  **/
  @ApiModelProperty(value = "Total number of items available.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public Activities history(List<Activity> history) {
    this.history = history;
    return this;
  }

  public Activities addHistoryItem(Activity historyItem) {
    this.history.add(historyItem);
    return this;
  }

   /**
   * Get history
   * @return history
  **/
  @ApiModelProperty(value = "")
  public List<Activity> getHistory() {
    return history;
  }

  public void setHistory(List<Activity> history) {
    this.history = history;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Activities activities = (Activities) o;
    return Objects.equals(this.offset, activities.offset) &&
        Objects.equals(this.limit, activities.limit) &&
        Objects.equals(this.count, activities.count) &&
        Objects.equals(this.history, activities.history);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, limit, count, history);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Activities {\n");
    
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
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

