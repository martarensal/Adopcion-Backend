package AdopcionAnimales.api.types;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * TypeNameChangeRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
public class TypeNameChangeRequest   {
    @JsonProperty("newTypeName")
    private String newTypeName = null;

    public AdopcionAnimales.api.types.TypeNameChangeRequest newTypeName(String newTypeName) {
        this.newTypeName = newTypeName;
        return this;
    }

    /**
     * Get newTypeName
     * @return newTypeName
     **/
    @ApiModelProperty(example = "Perro", required = true, value = "")
    @NotNull

    public String getNewTypeName() {
        return newTypeName;
    }

    public void setNewTypeName(String newTypeName) {
        this.newTypeName = newTypeName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdopcionAnimales.api.types.TypeNameChangeRequest TypeNameChangeRequest = (AdopcionAnimales.api.types.TypeNameChangeRequest) o;
        return Objects.equals(this.newTypeName, TypeNameChangeRequest.newTypeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newTypeName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TypeNameChangeRequest {\n");

        sb.append("    newTypeName: ").append(toIndentedString(newTypeName)).append("\n");
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
