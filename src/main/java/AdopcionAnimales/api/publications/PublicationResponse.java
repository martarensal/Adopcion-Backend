package AdopcionAnimales.api.publications;

import AdopcionAnimales.api.animals.AnimalResponse;
import AdopcionAnimales.api.requests.RequestResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * PublicationResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
public class PublicationResponse   {
  @JsonProperty("id")
  private Long id = null;
  public PublicationResponse id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   *
   * @return id
   **/
  @ApiModelProperty(example = "1", required = true, value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
  @JsonProperty("publicationDate")
  private OffsetDateTime publicationDate = null;

  public PublicationResponse publicationDate(OffsetDateTime publicationDate) {
    this.publicationDate = publicationDate;
    return this;
  }

  @JsonProperty("image")
  private String image = null;

  @JsonProperty("description")
  private String description = null;

  public PublicationResponse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @ApiModelProperty(example = "description", value = "")

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PublicationResponse image(String image) {
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

  public void setPublicationDate(OffsetDateTime publicationDate) {
    this.publicationDate = publicationDate;
  }
  @JsonProperty("user")
  private Long user = null;

  public PublicationResponse user(Long user) {
    this.user = user;
    return this;
  }
  /**
   * Get user
   * @return user
   **/
  @ApiModelProperty(example = "1", value = "")

  public Long getUser() {
    return user;
  }

  public void setUser(Long user) {
    this.user = user;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicationResponse publicationResponse = (PublicationResponse) o;
    return Objects.equals(this.publicationDate, publicationResponse.publicationDate)&&
    Objects.equals(this.user, publicationResponse.user);

  }

  @Override
  public int hashCode() {
    return Objects.hash(publicationDate, description, image, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicationResponse {\n");
    
    sb.append("    publicationDate: ").append(toIndentedString(publicationDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
