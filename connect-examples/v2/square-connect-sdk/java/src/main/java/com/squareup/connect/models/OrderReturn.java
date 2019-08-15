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
import com.squareup.connect.models.OrderMoneyAmounts;
import com.squareup.connect.models.OrderReturnDiscount;
import com.squareup.connect.models.OrderReturnLineItem;
import com.squareup.connect.models.OrderReturnServiceCharge;
import com.squareup.connect.models.OrderReturnTax;
import com.squareup.connect.models.OrderRoundingAdjustment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * The set of line items, service charges, taxes, discounts, tips, etc. being returned in an Order.
 */
@ApiModel(description = "The set of line items, service charges, taxes, discounts, tips, etc. being returned in an Order.")

public class OrderReturn {
  @JsonProperty("uid")
  private String uid = null;

  @JsonProperty("source_order_id")
  private String sourceOrderId = null;

  @JsonProperty("return_line_items")
  private List<OrderReturnLineItem> returnLineItems = new ArrayList<OrderReturnLineItem>();

  @JsonProperty("return_service_charges")
  private List<OrderReturnServiceCharge> returnServiceCharges = new ArrayList<OrderReturnServiceCharge>();

  @JsonProperty("return_taxes")
  private List<OrderReturnTax> returnTaxes = new ArrayList<OrderReturnTax>();

  @JsonProperty("return_discounts")
  private List<OrderReturnDiscount> returnDiscounts = new ArrayList<OrderReturnDiscount>();

  @JsonProperty("rounding_adjustment")
  private OrderRoundingAdjustment roundingAdjustment = null;

  @JsonProperty("return_amounts")
  private OrderMoneyAmounts returnAmounts = null;

  public OrderReturn uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Unique ID that identifies the return only within this order.
   * @return uid
  **/
  @ApiModelProperty(value = "Unique ID that identifies the return only within this order.")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public OrderReturn sourceOrderId(String sourceOrderId) {
    this.sourceOrderId = sourceOrderId;
    return this;
  }

   /**
   * Order which contains the original sale of these returned line items. This will be unset for unlinked returns.
   * @return sourceOrderId
  **/
  @ApiModelProperty(value = "Order which contains the original sale of these returned line items. This will be unset for unlinked returns.")
  public String getSourceOrderId() {
    return sourceOrderId;
  }

  public void setSourceOrderId(String sourceOrderId) {
    this.sourceOrderId = sourceOrderId;
  }

  public OrderReturn returnLineItems(List<OrderReturnLineItem> returnLineItems) {
    this.returnLineItems = returnLineItems;
    return this;
  }

  public OrderReturn addReturnLineItemsItem(OrderReturnLineItem returnLineItemsItem) {
    this.returnLineItems.add(returnLineItemsItem);
    return this;
  }

   /**
   * Collection of line items which are being returned.
   * @return returnLineItems
  **/
  @ApiModelProperty(value = "Collection of line items which are being returned.")
  public List<OrderReturnLineItem> getReturnLineItems() {
    return returnLineItems;
  }

  public void setReturnLineItems(List<OrderReturnLineItem> returnLineItems) {
    this.returnLineItems = returnLineItems;
  }

  public OrderReturn returnServiceCharges(List<OrderReturnServiceCharge> returnServiceCharges) {
    this.returnServiceCharges = returnServiceCharges;
    return this;
  }

  public OrderReturn addReturnServiceChargesItem(OrderReturnServiceCharge returnServiceChargesItem) {
    this.returnServiceCharges.add(returnServiceChargesItem);
    return this;
  }

   /**
   * Collection of service charges which are being returned.
   * @return returnServiceCharges
  **/
  @ApiModelProperty(value = "Collection of service charges which are being returned.")
  public List<OrderReturnServiceCharge> getReturnServiceCharges() {
    return returnServiceCharges;
  }

  public void setReturnServiceCharges(List<OrderReturnServiceCharge> returnServiceCharges) {
    this.returnServiceCharges = returnServiceCharges;
  }

  public OrderReturn returnTaxes(List<OrderReturnTax> returnTaxes) {
    this.returnTaxes = returnTaxes;
    return this;
  }

  public OrderReturn addReturnTaxesItem(OrderReturnTax returnTaxesItem) {
    this.returnTaxes.add(returnTaxesItem);
    return this;
  }

   /**
   * Collection of references to taxes being returned for an order, including the total applied tax amount to be returned. The taxes must reference a top-level tax ID from the source order.
   * @return returnTaxes
  **/
  @ApiModelProperty(value = "Collection of references to taxes being returned for an order, including the total applied tax amount to be returned. The taxes must reference a top-level tax ID from the source order.")
  public List<OrderReturnTax> getReturnTaxes() {
    return returnTaxes;
  }

  public void setReturnTaxes(List<OrderReturnTax> returnTaxes) {
    this.returnTaxes = returnTaxes;
  }

  public OrderReturn returnDiscounts(List<OrderReturnDiscount> returnDiscounts) {
    this.returnDiscounts = returnDiscounts;
    return this;
  }

  public OrderReturn addReturnDiscountsItem(OrderReturnDiscount returnDiscountsItem) {
    this.returnDiscounts.add(returnDiscountsItem);
    return this;
  }

   /**
   * Collection of references to discounts being returned for an order, including the total applied discount amount to be returned. The discounts must reference a top-level discount ID from the source order.
   * @return returnDiscounts
  **/
  @ApiModelProperty(value = "Collection of references to discounts being returned for an order, including the total applied discount amount to be returned. The discounts must reference a top-level discount ID from the source order.")
  public List<OrderReturnDiscount> getReturnDiscounts() {
    return returnDiscounts;
  }

  public void setReturnDiscounts(List<OrderReturnDiscount> returnDiscounts) {
    this.returnDiscounts = returnDiscounts;
  }

  public OrderReturn roundingAdjustment(OrderRoundingAdjustment roundingAdjustment) {
    this.roundingAdjustment = roundingAdjustment;
    return this;
  }

   /**
   * A positive or negative rounding adjustment to the total value being returned. Commonly used to apply Cash Rounding when the minimum unit of account is smaller than the lowest physical denomination of currency.
   * @return roundingAdjustment
  **/
  @ApiModelProperty(value = "A positive or negative rounding adjustment to the total value being returned. Commonly used to apply Cash Rounding when the minimum unit of account is smaller than the lowest physical denomination of currency.")
  public OrderRoundingAdjustment getRoundingAdjustment() {
    return roundingAdjustment;
  }

  public void setRoundingAdjustment(OrderRoundingAdjustment roundingAdjustment) {
    this.roundingAdjustment = roundingAdjustment;
  }

  public OrderReturn returnAmounts(OrderMoneyAmounts returnAmounts) {
    this.returnAmounts = returnAmounts;
    return this;
  }

   /**
   * Aggregate monetary value being returned by this Return entry.
   * @return returnAmounts
  **/
  @ApiModelProperty(value = "Aggregate monetary value being returned by this Return entry.")
  public OrderMoneyAmounts getReturnAmounts() {
    return returnAmounts;
  }

  public void setReturnAmounts(OrderMoneyAmounts returnAmounts) {
    this.returnAmounts = returnAmounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderReturn orderReturn = (OrderReturn) o;
    return Objects.equals(this.uid, orderReturn.uid) &&
        Objects.equals(this.sourceOrderId, orderReturn.sourceOrderId) &&
        Objects.equals(this.returnLineItems, orderReturn.returnLineItems) &&
        Objects.equals(this.returnServiceCharges, orderReturn.returnServiceCharges) &&
        Objects.equals(this.returnTaxes, orderReturn.returnTaxes) &&
        Objects.equals(this.returnDiscounts, orderReturn.returnDiscounts) &&
        Objects.equals(this.roundingAdjustment, orderReturn.roundingAdjustment) &&
        Objects.equals(this.returnAmounts, orderReturn.returnAmounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, sourceOrderId, returnLineItems, returnServiceCharges, returnTaxes, returnDiscounts, roundingAdjustment, returnAmounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderReturn {\n");

    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    sourceOrderId: ").append(toIndentedString(sourceOrderId)).append("\n");
    sb.append("    returnLineItems: ").append(toIndentedString(returnLineItems)).append("\n");
    sb.append("    returnServiceCharges: ").append(toIndentedString(returnServiceCharges)).append("\n");
    sb.append("    returnTaxes: ").append(toIndentedString(returnTaxes)).append("\n");
    sb.append("    returnDiscounts: ").append(toIndentedString(returnDiscounts)).append("\n");
    sb.append("    roundingAdjustment: ").append(toIndentedString(roundingAdjustment)).append("\n");
    sb.append("    returnAmounts: ").append(toIndentedString(returnAmounts)).append("\n");
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

