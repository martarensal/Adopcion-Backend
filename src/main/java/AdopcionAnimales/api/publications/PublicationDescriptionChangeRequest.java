package AdopcionAnimales.api.publications;

import AdopcionAnimales.api.animals.AnimalNameChangeRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * PublicationDateChangeRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
public class PublicationDescriptionChangeRequest   {
    @JsonProperty("newPublicationDescription")
    private String newPublicationDescription = null;

    public PublicationDescriptionChangeRequest newPublicationDescription(String newPublicationDescription) {
        this.newPublicationDescription = newPublicationDescription;
        return this;
    }

    /**
     * Get newPublicationDescription
     * @return newPublicationDescription
     **/
    @ApiModelProperty(example = "Maya", required = true, value = "")
    @NotNull

    public String getnewPublicationDescription() {
        return newPublicationDescription;
    }

    public void setnewPublicationDescription(String newPublicationDescription) {
        this.newPublicationDescription = newPublicationDescription;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PublicationDescriptionChangeRequest publicationDescriptionChangeRequest = (PublicationDescriptionChangeRequest) o;
        return Objects.equals(this.newPublicationDescription, publicationDescriptionChangeRequest.newPublicationDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newPublicationDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicationDescriptionChangeRequest {\n");

        sb.append("    newAnimalDescription: ").append(toIndentedString(newPublicationDescription)).append("\n");
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
