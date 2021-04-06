package AdopcionAnimales.api.requests;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * RequestTypeChangeRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
public class RequestTypeChangeRequest   {
    /**
     * Gets or Sets newRequestType
     */
    public enum NewRequestTypeEnum {
        ADOPTION("adoption"),

        SHELTER("shelter");

        private String value;

        NewRequestTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AdopcionAnimales.api.requests.RequestTypeChangeRequest.NewRequestTypeEnum fromValue(String text) {
            for (RequestTypeChangeRequest.NewRequestTypeEnum b : RequestTypeChangeRequest.NewRequestTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }
    @JsonProperty("newRequestType")
    private String newRequestType = null;

    public AdopcionAnimales.api.requests.RequestTypeChangeRequest newRequestType(String newRequestType) {
        this.newRequestType = newRequestType;
        return this;
    }

    /**
     * Get newRequestType
     * @return newRequestType
     **/
    @ApiModelProperty(example = "Adopted", required = true, value = "")
    @NotNull

    public String getNewRequestType() {
        return newRequestType;
    }

    public void setNewRequestType(String newRequestType) {
        this.newRequestType = newRequestType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdopcionAnimales.api.requests.RequestTypeChangeRequest requestTypeChangeRequest = (AdopcionAnimales.api.requests.RequestTypeChangeRequest) o;
        return Objects.equals(this.newRequestType, requestTypeChangeRequest.newRequestType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newRequestType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnimalTypeChangeRequest {\n");

        sb.append("    newAnimalType: ").append(toIndentedString(newRequestType)).append("\n");
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
