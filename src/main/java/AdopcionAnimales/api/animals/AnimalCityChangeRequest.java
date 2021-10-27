package AdopcionAnimales.api.animals;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * AnimalCityChangeRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
public class AnimalCityChangeRequest   {
    @JsonProperty("newAnimalCity_id")
    private Long newAnimalCity_id = 0l;

    /**
     * Get newAnimalCity_id
     * @return newAnimalCity_id
     **/
    @ApiModelProperty(example = "4", required = true, value = "")
    @NotNull

    public Long getNewAnimalCity_id() {
        return newAnimalCity_id;
    }

    public void setNewAnimalCity_id(Long newAnimalCity_id) {
        this.newAnimalCity_id = newAnimalCity_id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnimalCityChangeRequest animalCityChangeRequest = (AnimalCityChangeRequest) o;
        return Objects.equals(this.newAnimalCity_id, animalCityChangeRequest.newAnimalCity_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newAnimalCity_id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnimalCityChangeRequest {\n");

        sb.append("    newAnimalCity_id: ").append(toIndentedString(newAnimalCity_id)).append("\n");
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
