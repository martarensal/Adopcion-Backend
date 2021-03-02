package AdopcionAnimales.api.animals;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * AnimalSexChangeRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
public class AnimalSexChangeRequest   {
  /**
   * Gets or Sets newAnimalSex
   */
  public enum NewAnimalSexEnum {
    MALE("male"),
    
    FEMALE("female");

    private String value;

    NewAnimalSexEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NewAnimalSexEnum fromValue(String text) {
      for (NewAnimalSexEnum b : NewAnimalSexEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("newAnimalSex")
  private NewAnimalSexEnum newAnimalSex = null;

  public AnimalSexChangeRequest newAnimalSex(NewAnimalSexEnum newAnimalSex) {
    this.newAnimalSex = newAnimalSex;
    return this;
  }

  /**
   * Get newAnimalSex
   * @return newAnimalSex
  **/
  @ApiModelProperty(example = "animal.png", required = true, value = "")
  @NotNull

  public NewAnimalSexEnum getNewAnimalSex() {
    return newAnimalSex;
  }

  public void setNewAnimalSex(NewAnimalSexEnum newAnimalSex) {
    this.newAnimalSex = newAnimalSex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnimalSexChangeRequest animalSexChangeRequest = (AnimalSexChangeRequest) o;
    return Objects.equals(this.newAnimalSex, animalSexChangeRequest.newAnimalSex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newAnimalSex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnimalSexChangeRequest {\n");
    
    sb.append("    newAnimalSex: ").append(toIndentedString(newAnimalSex)).append("\n");
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
