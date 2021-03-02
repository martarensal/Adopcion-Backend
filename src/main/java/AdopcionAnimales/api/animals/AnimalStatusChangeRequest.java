package AdopcionAnimales.api.animals;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * AnimalStatusChangeRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
public class AnimalStatusChangeRequest   {
  /**
   * Gets or Sets newAnimalStatus
   */
  public enum NewAnimalStatusEnum {
    ADOPTED("adopted"),
    
    HOMELESS("homeless"),
    
    SHELTER("shelter");

    private String value;

    NewAnimalStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NewAnimalStatusEnum fromValue(String text) {
      for (NewAnimalStatusEnum b : NewAnimalStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("newAnimalStatus")
  private NewAnimalStatusEnum newAnimalStatus = null;

  public AnimalStatusChangeRequest newAnimalStatus(NewAnimalStatusEnum newAnimalStatus) {
    this.newAnimalStatus = newAnimalStatus;
    return this;
  }

  /**
   * Get newAnimalStatus
   * @return newAnimalStatus
  **/
  @ApiModelProperty(example = "Adopted", required = true, value = "")
  @NotNull

  public NewAnimalStatusEnum getNewAnimalStatus() {
    return newAnimalStatus;
  }

  public void setNewAnimalStatus(NewAnimalStatusEnum newAnimalStatus) {
    this.newAnimalStatus = newAnimalStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnimalStatusChangeRequest animalStatusChangeRequest = (AnimalStatusChangeRequest) o;
    return Objects.equals(this.newAnimalStatus, animalStatusChangeRequest.newAnimalStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newAnimalStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnimalStatusChangeRequest {\n");
    
    sb.append("    newAnimalStatus: ").append(toIndentedString(newAnimalStatus)).append("\n");
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
