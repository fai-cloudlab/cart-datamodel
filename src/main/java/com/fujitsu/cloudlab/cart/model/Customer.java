/*
 * FAI Cart API
 * This API is part of Fujitsu's Cloud Lab Demo
 *
 * OpenAPI spec version: 1.0.0
 * Contact: pavan.vadarevu@fujitsu.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.fujitsu.cloudlab.cart.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Customer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-04T20:28:40.576-04:00")
public class Customer {
  @JsonProperty("customerId")
  private String customerId = null;

  @JsonProperty("emailAdr")
  private String emailAdr = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  public Customer customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Customer Identifier represents a person or organization that initiates contact with a company or responds to a company initiation of contact.
   * @return customerId
  **/
  @ApiModelProperty(value = "Customer Identifier represents a person or organization that initiates contact with a company or responds to a company initiation of contact.")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public Customer emailAdr(String emailAdr) {
    this.emailAdr = emailAdr;
    return this;
  }

   /**
   * Electronic Mail (Email) Address specifies a character string which, when input within a particular context, will direct information to a resource available to a specific owner. 
   * @return emailAdr
  **/
  @ApiModelProperty(value = "Electronic Mail (Email) Address specifies a character string which, when input within a particular context, will direct information to a resource available to a specific owner. ")
  public String getEmailAdr() {
    return emailAdr;
  }

  public void setEmailAdr(String emailAdr) {
    this.emailAdr = emailAdr;
  }

  public Customer firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First Name of the customer
   * @return firstName
  **/
  @ApiModelProperty(value = "First Name of the customer")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Customer lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last Name of the customer
   * @return lastName
  **/
  @ApiModelProperty(value = "Last Name of the customer")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.customerId, customer.customerId) &&
        Objects.equals(this.emailAdr, customer.emailAdr) &&
        Objects.equals(this.firstName, customer.firstName) &&
        Objects.equals(this.lastName, customer.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, emailAdr, firstName, lastName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    emailAdr: ").append(toIndentedString(emailAdr)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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

