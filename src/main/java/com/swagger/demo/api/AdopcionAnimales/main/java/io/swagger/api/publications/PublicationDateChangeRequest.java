package com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.publications;

import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PublicationDateChangeRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
public class PublicationDateChangeRequest   {
  @JsonProperty("newPublicationDate")
  private OffsetDateTime newPublicationDate = null;

  public PublicationDateChangeRequest newPublicationDate(OffsetDateTime newPublicationDate) {
    this.newPublicationDate = newPublicationDate;
    return this;
  }

  /**
   * Get newPublicationDate
   * @return newPublicationDate
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public OffsetDateTime getNewPublicationDate() {
    return newPublicationDate;
  }

  public void setNewPublicationDate(OffsetDateTime newPublicationDate) {
    this.newPublicationDate = newPublicationDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicationDateChangeRequest publicationDateChangeRequest = (PublicationDateChangeRequest) o;
    return Objects.equals(this.newPublicationDate, publicationDateChangeRequest.newPublicationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newPublicationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicationDateChangeRequest {\n");
    
    sb.append("    newPublicationDate: ").append(toIndentedString(newPublicationDate)).append("\n");
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
