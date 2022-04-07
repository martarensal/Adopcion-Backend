package AdopcionAnimales.api.publications;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * PublicationImageChangeRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
public class PublicationImageChangeRequest   {
    @JsonProperty("newPublicationImage")
    private String newPublicationImage = null;

    public AdopcionAnimales.api.publications.PublicationImageChangeRequest newPublicationImage(String newPublicationImage) {
        this.newPublicationImage = newPublicationImage;
        return this;
    }

    /**
     * Get newPublicationImage
     * @return newPublicationImage
     **/
    @ApiModelProperty(example = "animal.png", value = "")

    public String getnewPublicationImage() {
        return newPublicationImage;
    }

    public void setnewPublicationImage(String newPublicationImage) {
        this.newPublicationImage = newPublicationImage;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdopcionAnimales.api.publications.PublicationImageChangeRequest PublicationImageChangeRequest = (AdopcionAnimales.api.publications.PublicationImageChangeRequest) o;
        return Objects.equals(this.newPublicationImage, PublicationImageChangeRequest.newPublicationImage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newPublicationImage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicationImageChangeRequest {\n");

        sb.append("    newPublicationImage: ").append(toIndentedString(newPublicationImage)).append("\n");
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
