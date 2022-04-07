package AdopcionAnimales.api.users;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * UserLastnameChangeRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
public class UserLastnameChangeRequest   {
  @JsonProperty("newLastname")
  private String newLastname = null;

  public UserLastnameChangeRequest newLastname(String newLastname) {
    this.newLastname = newLastname;
    return this;
  }

  /**
   * Get newLastname
   * @return newLastname
  **/
  @ApiModelProperty(example = "Diaz", required = true, value = "")
  @NotNull

  public String getNewLastname() {
    return newLastname;
  }

  public void setNewLastname(String newLastname) {
    this.newLastname = newLastname;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserLastnameChangeRequest userLastnameChangeRequest = (UserLastnameChangeRequest) o;
    return Objects.equals(this.newLastname, userLastnameChangeRequest.newLastname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newLastname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserLastnameChangeRequest {\n");
    
    sb.append("    newLastname: ").append(toIndentedString(newLastname)).append("\n");
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
