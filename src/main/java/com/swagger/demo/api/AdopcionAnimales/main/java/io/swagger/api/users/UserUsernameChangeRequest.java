package com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.users;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * UserUsernameChangeRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
public class UserUsernameChangeRequest   {
  @JsonProperty("newUsername")
  private String newUsername = null;

  public UserUsernameChangeRequest newUsername(String newUsername) {
    this.newUsername = newUsername;
    return this;
  }

  /**
   * Get newUsername
   * @return newUsername
  **/
  @ApiModelProperty(example = "newJohn", required = true, value = "")
  @NotNull

  public String getNewUsername() {
    return newUsername;
  }

  public void setNewUsername(String newUsername) {
    this.newUsername = newUsername;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserUsernameChangeRequest userUsernameChangeRequest = (UserUsernameChangeRequest) o;
    return Objects.equals(this.newUsername, userUsernameChangeRequest.newUsername);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newUsername);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUsernameChangeRequest {\n");
    
    sb.append("    newUsername: ").append(toIndentedString(newUsername)).append("\n");
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
