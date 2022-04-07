package AdopcionAnimales.api.animals;

import AdopcionAnimales.types.Type;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * AnimalChangeRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
public class AnimalTypeChangeRequest   {
    @JsonProperty("newAnimalType_id")
    private Long newAnimalType_id = 0l;
    /**
     * Get newAnimalType_id
     * @return newAnimalType_id
     **/
    @ApiModelProperty(example = "2", required = true, value = "")
    @NotNull

    public Long getAnimalType_id() {
        return newAnimalType_id;
    }

    public void setAnimalType_id(Long type_id) {
        this.newAnimalType_id = newAnimalType_id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnimalTypeChangeRequest animalTypeChangeRequest = (AnimalTypeChangeRequest) o;
        return Objects.equals(this.newAnimalType_id, animalTypeChangeRequest.newAnimalType_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newAnimalType_id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnimalTypeChangeRequest {\n");

        sb.append("    newAnimalType_id: ").append(toIndentedString(newAnimalType_id)).append("\n");
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
