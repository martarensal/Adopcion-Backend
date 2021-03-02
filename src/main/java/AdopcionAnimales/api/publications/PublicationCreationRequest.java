package AdopcionAnimales.api.publications;

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

  public void setPublicationDate(OffsetDateTime publicationDate) {
    this.publicationDate = publicationDate;
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
    return Objects.equals(this.publicationDate, publicationCreationRequest.publicationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicationCreationRequest {\n");
    
    sb.append("    publicationDate: ").append(toIndentedString(publicationDate)).append("\n");
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
