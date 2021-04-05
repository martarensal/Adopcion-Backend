package AdopcionAnimales.api.animals;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * AnimalSizeChangeRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
public class AnimalSizeChangeRequest   {
  /**
   * Gets or Sets newAnimalSize
   */
  public enum NewAnimalSizeEnum {
    SMALL("small"),
    
    MEDIUM("medium"),
    
    BIG("big");

    private String value;

    NewAnimalSizeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NewAnimalSizeEnum fromValue(String text) {
      for (NewAnimalSizeEnum b : NewAnimalSizeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("newAnimalSize")
  private String newAnimalSize = null;

  public AnimalSizeChangeRequest newAnimalSize(String newAnimalSize) {
    this.newAnimalSize = newAnimalSize;
    return this;
  }

  /**
   * Get newAnimalSize
   * @return newAnimalSize
  **/
  @ApiModelProperty(example = "small", required = true, value = "")
  @NotNull

  public String getNewAnimalSize() {
    return newAnimalSize;
  }

  public void setNewAnimalSize(String newAnimalSize) {
    this.newAnimalSize = newAnimalSize;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnimalSizeChangeRequest animalSizeChangeRequest = (AnimalSizeChangeRequest) o;
    return Objects.equals(this.newAnimalSize, animalSizeChangeRequest.newAnimalSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newAnimalSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnimalSizeChangeRequest {\n");
    
    sb.append("    newAnimalSize: ").append(toIndentedString(newAnimalSize)).append("\n");
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
