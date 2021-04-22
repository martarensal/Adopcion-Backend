package AdopcionAnimales.api.requests;

import AdopcionAnimales.api.animals.AnimalCreationRequest;
import AdopcionAnimales.api.publications.PublicationCreationRequest;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * RequestCreationRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
public class RequestCreationRequest   {

  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  public RequestCreationRequest requestStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public OffsetDateTime getstartDate() {
    return startDate;
  }

  public void setstartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  @JsonProperty("endDate")
  private OffsetDateTime endDate = null;

  public RequestCreationRequest requestEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public OffsetDateTime getendDate() {
    return endDate;
  }

  public void setendDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    ACCEPTED("accepted"),

    REJECTED("rejected"),

    SENT("sent");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("status")
  private StatusEnum status = null;

  public RequestCreationRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @ApiModelProperty(example = "sent", required = true, value = "")
  @NotNull

  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    SHELTER("shelter"),
    
    ADOPTION("adoption");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("type")
  private TypeEnum type = null;

  public RequestCreationRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "shelter", required = true, value = "")
  @NotNull

  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestCreationRequest requestCreationRequest = (RequestCreationRequest) o;
    return Objects.equals(this.endDate, requestCreationRequest.endDate) &&
            Objects.equals(this.startDate, requestCreationRequest.startDate) &&
            Objects.equals(this.status, requestCreationRequest.status) &&
                    Objects.equals(this.type, requestCreationRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, startDate, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestCreationRequest {\n");
    
    sb.append("    requestEndDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    requestStartDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
