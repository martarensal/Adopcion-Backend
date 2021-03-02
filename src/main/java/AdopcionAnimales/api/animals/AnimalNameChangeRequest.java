package AdopcionAnimales.api.animals;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * AnimalNameChangeRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
public class AnimalNameChangeRequest   {
  @JsonProperty("newAnimalName")
  private String newAnimalName = null;

  public AnimalNameChangeRequest newAnimalName(String newAnimalName) {
    this.newAnimalName = newAnimalName;
    return this;
  }

  /**
   * Get newAnimalName
   * @return newAnimalName
  **/
  @ApiModelProperty(example = "Maya", required = true, value = "")
  @NotNull

  public String getNewAnimalName() {
    return newAnimalName;
  }

  public void setNewAnimalName(String newAnimalName) {
    this.newAnimalName = newAnimalName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnimalNameChangeRequest animalNameChangeRequest = (AnimalNameChangeRequest) o;
    return Objects.equals(this.newAnimalName, animalNameChangeRequest.newAnimalName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newAnimalName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnimalNameChangeRequest {\n");
    
    sb.append("    newAnimalName: ").append(toIndentedString(newAnimalName)).append("\n");
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
