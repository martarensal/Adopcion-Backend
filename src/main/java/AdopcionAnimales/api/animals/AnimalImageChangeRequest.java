package AdopcionAnimales.api.animals;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * AnimalImageChangeRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
public class AnimalImageChangeRequest   {
  @JsonProperty("newAnimalImage")
  private String newAnimalImage = null;

  public AnimalImageChangeRequest newAnimalImage(String newAnimalImage) {
    this.newAnimalImage = newAnimalImage;
    return this;
  }

  /**
   * Get newAnimalImage
   * @return newAnimalImage
  **/
  @ApiModelProperty(example = "animal.png", value = "")

  public String getNewAnimalImage() {
    return newAnimalImage;
  }

  public void setNewAnimalImage(String newAnimalImage) {
    this.newAnimalImage = newAnimalImage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnimalImageChangeRequest animalImageChangeRequest = (AnimalImageChangeRequest) o;
    return Objects.equals(this.newAnimalImage, animalImageChangeRequest.newAnimalImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newAnimalImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnimalImageChangeRequest {\n");
    
    sb.append("    newAnimalImage: ").append(toIndentedString(newAnimalImage)).append("\n");
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
