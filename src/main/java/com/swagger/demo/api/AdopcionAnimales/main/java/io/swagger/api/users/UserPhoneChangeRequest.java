package com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.users;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * UserPhoneChangeRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
public class UserPhoneChangeRequest   {
  @JsonProperty("newPhone")
  private String newPhone = null;

  public UserPhoneChangeRequest newPhone(String newPhone) {
    this.newPhone = newPhone;
    return this;
  }

  /**
   * Get newPhone
   * @return newPhone
  **/
  @ApiModelProperty(example = "766767676", required = true, value = "")
  @NotNull

  public String getNewPhone() {
    return newPhone;
  }

  public void setNewPhone(String newPhone) {
    this.newPhone = newPhone;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPhoneChangeRequest userPhoneChangeRequest = (UserPhoneChangeRequest) o;
    return Objects.equals(this.newPhone, userPhoneChangeRequest.newPhone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newPhone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPhoneChangeRequest {\n");
    
    sb.append("    newPhone: ").append(toIndentedString(newPhone)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
