/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.squareup.connect.models.V1Order;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@ApiModel(description = "")

public class V1ListOrdersResponse {
  @JsonProperty("items")
  private List<V1Order> items = new ArrayList<V1Order>();

  public V1ListOrdersResponse items(List<V1Order> items) {
    this.items = items;
    return this;
  }

  public V1ListOrdersResponse addItemsItem(V1Order itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   *
   * @return items
  **/
  @ApiModelProperty(value = "")
  public List<V1Order> getItems() {
    return items;
  }

  public void setItems(List<V1Order> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ListOrdersResponse v1ListOrdersResponse = (V1ListOrdersResponse) o;
    return Objects.equals(this.items, v1ListOrdersResponse.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ListOrdersResponse {\n");

    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

