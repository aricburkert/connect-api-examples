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
 * A mapping between a client-supplied temporary ID and a permanent server ID.
 */
@ApiModel(description = "A mapping between a client-supplied temporary ID and a permanent server ID.")

public class CatalogIdMapping {
  @JsonProperty("client_object_id")
  private String clientObjectId = null;

  @JsonProperty("object_id")
  private String objectId = null;

  public CatalogIdMapping clientObjectId(String clientObjectId) {
    this.clientObjectId = clientObjectId;
    return this;
  }

   /**
   * The client-supplied, temporary `#`-prefixed ID for a new [CatalogObject](#type-catalogobject).
   * @return clientObjectId
  **/
  @ApiModelProperty(value = "The client-supplied, temporary `#`-prefixed ID for a new [CatalogObject](#type-catalogobject).")
  public String getClientObjectId() {
    return clientObjectId;
  }

  public void setClientObjectId(String clientObjectId) {
    this.clientObjectId = clientObjectId;
  }

  public CatalogIdMapping objectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

   /**
   * The permanent ID for the [CatalogObject](#type-catalogobject) created by the server.
   * @return objectId
  **/
  @ApiModelProperty(value = "The permanent ID for the [CatalogObject](#type-catalogobject) created by the server.")
  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogIdMapping catalogIdMapping = (CatalogIdMapping) o;
    return Objects.equals(this.clientObjectId, catalogIdMapping.clientObjectId) &&
        Objects.equals(this.objectId, catalogIdMapping.objectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientObjectId, objectId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogIdMapping {\n");

    sb.append("    clientObjectId: ").append(toIndentedString(clientObjectId)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
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

