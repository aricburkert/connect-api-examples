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
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@ApiModel(description = "")

public class BatchRetrieveCatalogObjectsRequest {
  @JsonProperty("object_ids")
  private List<String> objectIds = new ArrayList<String>();

  @JsonProperty("include_related_objects")
  private Boolean includeRelatedObjects = null;

  public BatchRetrieveCatalogObjectsRequest objectIds(List<String> objectIds) {
    this.objectIds = objectIds;
    return this;
  }

  public BatchRetrieveCatalogObjectsRequest addObjectIdsItem(String objectIdsItem) {
    this.objectIds.add(objectIdsItem);
    return this;
  }

   /**
   * The IDs of the [CatalogObject](#type-catalogobject)s to be retrieved.
   * @return objectIds
  **/
  @ApiModelProperty(required = true, value = "The IDs of the [CatalogObject](#type-catalogobject)s to be retrieved.")
  public List<String> getObjectIds() {
    return objectIds;
  }

  public void setObjectIds(List<String> objectIds) {
    this.objectIds = objectIds;
  }

  public BatchRetrieveCatalogObjectsRequest includeRelatedObjects(Boolean includeRelatedObjects) {
    this.includeRelatedObjects = includeRelatedObjects;
    return this;
  }

   /**
   * If `true`, the response will include additional objects that are related to the requested objects, as follows:  If the `objects` field of the response contains a [CatalogItem](#type-catalogitem),  its associated [CatalogCategory](#type-catalogcategory), [CatalogTax](#type-catalogtax)es, [CatalogImage](#type-catalogimage)s and [CatalogModifierList](#type-catalogmodifierlist)s will be returned in the `related_objects` field of the response. If the `objects` field of the response contains a [CatalogItemVariation](#type-catalogitemvariation), its parent [CatalogItem](#type-catalogitem) will be returned in the `related_objects` field of the response.
   * @return includeRelatedObjects
  **/
  @ApiModelProperty(value = "If `true`, the response will include additional objects that are related to the requested objects, as follows:  If the `objects` field of the response contains a [CatalogItem](#type-catalogitem),  its associated [CatalogCategory](#type-catalogcategory), [CatalogTax](#type-catalogtax)es, [CatalogImage](#type-catalogimage)s and [CatalogModifierList](#type-catalogmodifierlist)s will be returned in the `related_objects` field of the response. If the `objects` field of the response contains a [CatalogItemVariation](#type-catalogitemvariation), its parent [CatalogItem](#type-catalogitem) will be returned in the `related_objects` field of the response.")
  public Boolean getIncludeRelatedObjects() {
    return includeRelatedObjects;
  }

  public void setIncludeRelatedObjects(Boolean includeRelatedObjects) {
    this.includeRelatedObjects = includeRelatedObjects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchRetrieveCatalogObjectsRequest batchRetrieveCatalogObjectsRequest = (BatchRetrieveCatalogObjectsRequest) o;
    return Objects.equals(this.objectIds, batchRetrieveCatalogObjectsRequest.objectIds) &&
        Objects.equals(this.includeRelatedObjects, batchRetrieveCatalogObjectsRequest.includeRelatedObjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectIds, includeRelatedObjects);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchRetrieveCatalogObjectsRequest {\n");

    sb.append("    objectIds: ").append(toIndentedString(objectIds)).append("\n");
    sb.append("    includeRelatedObjects: ").append(toIndentedString(includeRelatedObjects)).append("\n");
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

