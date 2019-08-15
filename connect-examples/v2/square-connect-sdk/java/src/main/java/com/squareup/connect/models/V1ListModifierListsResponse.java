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
import com.squareup.connect.models.V1ModifierList;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@ApiModel(description = "")

public class V1ListModifierListsResponse {
  @JsonProperty("items")
  private List<V1ModifierList> items = new ArrayList<V1ModifierList>();

  public V1ListModifierListsResponse items(List<V1ModifierList> items) {
    this.items = items;
    return this;
  }

  public V1ListModifierListsResponse addItemsItem(V1ModifierList itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   *
   * @return items
  **/
  @ApiModelProperty(value = "")
  public List<V1ModifierList> getItems() {
    return items;
  }

  public void setItems(List<V1ModifierList> items) {
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
    V1ListModifierListsResponse v1ListModifierListsResponse = (V1ListModifierListsResponse) o;
    return Objects.equals(this.items, v1ListModifierListsResponse.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ListModifierListsResponse {\n");

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

