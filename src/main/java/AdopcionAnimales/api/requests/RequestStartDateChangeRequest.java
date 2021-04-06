package AdopcionAnimales.api.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * RequestStartDateChangeRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
public class RequestStartDateChangeRequest {
    @JsonProperty("newRequestStartDate")
    private OffsetDateTime newRequestStartDate = null;

    public RequestStartDateChangeRequest newRequestStartDate(OffsetDateTime newRequestStartDate) {
        this.newRequestStartDate = newRequestStartDate;
        return this;
    }

    /**
     * Get newRequestStartDate
     * @return newRequestStartDate
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid
    public OffsetDateTime getNewRequestStartDate() {
        return newRequestStartDate;
    }

    public void setNewRequestStartDate(OffsetDateTime newRequestStartDate) {
        this.newRequestStartDate = newRequestStartDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RequestStartDateChangeRequest requestStartDateChangeRequest = (RequestStartDateChangeRequest) o;
        return Objects.equals(this.newRequestStartDate, requestStartDateChangeRequest.newRequestStartDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newRequestStartDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicationDateChangeRequest {\n");

        sb.append("    newPublicationDate: ").append(toIndentedString(newRequestStartDate)).append("\n");
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
