package AdopcionAnimales.api.requests;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * RequestStatusChangeRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
public class RequestStatusChangeRequest   {
    /**
     * Gets or Sets newRequestStatus
     */
    public enum NewRequestStatusEnum {
        ACCEPTED("Accepted"),

        SENT("sent"),

        REJECTED("rejected");

        private String value;

        NewRequestStatusEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AdopcionAnimales.api.requests.RequestStatusChangeRequest.NewRequestStatusEnum fromValue(String text) {
            for (RequestStatusChangeRequest.NewRequestStatusEnum b : RequestStatusChangeRequest.NewRequestStatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }
    @JsonProperty("newRequestStatus")
    private String newRequestStatus = null;

    public AdopcionAnimales.api.requests.RequestStatusChangeRequest newRequestStatus(String newRequestStatus) {
        this.newRequestStatus = newRequestStatus;
        return this;
    }

    /**
     * Get newRequestStatus
     * @return newRequestStatus
     **/
    @ApiModelProperty(example = "Sent", required = true, value = "")
    @NotNull

    public String getNewRequestStatus() {
        return newRequestStatus;
    }

    public void setNewRequestStatus(String newRequestStatus) {
        this.newRequestStatus = newRequestStatus;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdopcionAnimales.api.requests.RequestStatusChangeRequest requestStatusChangeRequest = (AdopcionAnimales.api.requests.RequestStatusChangeRequest) o;
        return Objects.equals(this.newRequestStatus, requestStatusChangeRequest.newRequestStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newRequestStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnimalStatusChangeRequest {\n");

        sb.append("    newAnimalStatus: ").append(toIndentedString(newRequestStatus)).append("\n");
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
