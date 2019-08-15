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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A request for a set of &#x60;EmployeeWage&#x60; objects
 */
@ApiModel(description = "A request for a set of `EmployeeWage` objects")

public class ListEmployeeWagesRequest {
  @JsonProperty("employee_id")
  private String employeeId = null;

  @JsonProperty("limit")
  private Integer limit = null;

  @JsonProperty("cursor")
  private String cursor = null;

  public ListEmployeeWagesRequest employeeId(String employeeId) {
    this.employeeId = employeeId;
    return this;
  }

   /**
   * Filter wages returned to only those that are associated with the specified employee.
   * @return employeeId
  **/
  @ApiModelProperty(value = "Filter wages returned to only those that are associated with the specified employee.")
  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public ListEmployeeWagesRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Maximum number of Employee Wages to return per page. Can range between 1 and 200. The default is the maximum at 200.
   * minimum: 1
   * maximum: 200
   * @return limit
  **/
  @ApiModelProperty(value = "Maximum number of Employee Wages to return per page. Can range between 1 and 200. The default is the maximum at 200.")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public ListEmployeeWagesRequest cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * Pointer to the next page of Employee Wage results to fetch.
   * @return cursor
  **/
  @ApiModelProperty(value = "Pointer to the next page of Employee Wage results to fetch.")
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListEmployeeWagesRequest listEmployeeWagesRequest = (ListEmployeeWagesRequest) o;
    return Objects.equals(this.employeeId, listEmployeeWagesRequest.employeeId) &&
        Objects.equals(this.limit, listEmployeeWagesRequest.limit) &&
        Objects.equals(this.cursor, listEmployeeWagesRequest.cursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeId, limit, cursor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListEmployeeWagesRequest {\n");

    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
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

