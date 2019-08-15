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
import com.squareup.connect.models.BreakType;
import com.squareup.connect.models.Error;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * The response to a request to get a &#x60;BreakType&#x60;. Contains the requested &#x60;BreakType&#x60; objects. May contain a set of &#x60;Error&#x60; objects if the request resulted in errors.
 */
@ApiModel(description = "The response to a request to get a `BreakType`. Contains the requested `BreakType` objects. May contain a set of `Error` objects if the request resulted in errors.")

public class GetBreakTypeResponse {
  @JsonProperty("break_type")
  private BreakType breakType = null;

  @JsonProperty("errors")
  private List<Error> errors = new ArrayList<Error>();

  public GetBreakTypeResponse breakType(BreakType breakType) {
    this.breakType = breakType;
    return this;
  }

   /**
   * The response object.
   * @return breakType
  **/
  @ApiModelProperty(value = "The response object.")
  public BreakType getBreakType() {
    return breakType;
  }

  public void setBreakType(BreakType breakType) {
    this.breakType = breakType;
  }

  public GetBreakTypeResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public GetBreakTypeResponse addErrorsItem(Error errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Any errors that occurred during the request.
   * @return errors
  **/
  @ApiModelProperty(value = "Any errors that occurred during the request.")
  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBreakTypeResponse getBreakTypeResponse = (GetBreakTypeResponse) o;
    return Objects.equals(this.breakType, getBreakTypeResponse.breakType) &&
        Objects.equals(this.errors, getBreakTypeResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(breakType, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBreakTypeResponse {\n");

    sb.append("    breakType: ").append(toIndentedString(breakType)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

