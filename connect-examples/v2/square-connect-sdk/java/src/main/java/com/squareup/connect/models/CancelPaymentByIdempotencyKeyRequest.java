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
 * Specifies idempotency key of a payment to cancel.
 */
@ApiModel(description = "Specifies idempotency key of a payment to cancel.")

public class CancelPaymentByIdempotencyKeyRequest {
  @JsonProperty("idempotency_key")
  private String idempotencyKey = null;

  public CancelPaymentByIdempotencyKeyRequest idempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
    return this;
  }

   /**
   * `idempotency_key` identifying the payment to be canceled.
   * @return idempotencyKey
  **/
  @ApiModelProperty(required = true, value = "`idempotency_key` identifying the payment to be canceled.")
  public String getIdempotencyKey() {
    return idempotencyKey;
  }

  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelPaymentByIdempotencyKeyRequest cancelPaymentByIdempotencyKeyRequest = (CancelPaymentByIdempotencyKeyRequest) o;
    return Objects.equals(this.idempotencyKey, cancelPaymentByIdempotencyKeyRequest.idempotencyKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idempotencyKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelPaymentByIdempotencyKeyRequest {\n");

    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
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

