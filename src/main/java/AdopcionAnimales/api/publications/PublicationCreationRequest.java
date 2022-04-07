package AdopcionAnimales.api.publications;

import AdopcionAnimales.api.animals.AnimalCreationRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * PublicationCreationRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
public class PublicationCreationRequest   {
  @JsonProperty("publicationDate")
  private OffsetDateTime publicationDate = null;

  public PublicationCreationRequest publicationDate(OffsetDateTime publicationDate) {
    this.publicationDate = publicationDate;
    return this;
  }

  /**
   * Get publicationDate
   * @return publicationDate
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public OffsetDateTime getPublicationDate() {
    return publicationDate;
  }
  @JsonProperty("image")
  private String image = null;
  @JsonProperty("description")
  private String description = null;

  public void setPublicationDate(OffsetDateTime publicationDate) {
    this.publicationDate = publicationDate;
  }

  public PublicationCreationRequest image(String image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
   **/
  @ApiModelProperty(example = "animal.png", value = "")

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }








  public PublicationCreationRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @ApiModelProperty(example = "Description", value = "")

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicationCreationRequest publicationCreationRequest = (PublicationCreationRequest) o;
    return Objects.equals(this.publicationDate, publicationCreationRequest.publicationDate)
            && Objects.equals(this.image, publicationCreationRequest.image)&&
            Objects.equals(this.image, publicationCreationRequest.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicationDate, image, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicationCreationRequest {\n");
    
    sb.append("    publicationDate: ").append(toIndentedString(publicationDate)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");


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
