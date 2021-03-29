package AdopcionAnimales.api.cities;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;


/**
 * CityNameChangeRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
public class CityNameChangeRequest   {
    @JsonProperty("newCityName")
    private String newCityName = null;

    public AdopcionAnimales.api.cities.CityNameChangeRequest newCityName(String newCityName) {
        this.newCityName = newCityName;
        return this;
    }

    /**
     * Get newCityName
     * @return newCityName
     **/
    @ApiModelProperty(example = "Puerto Real", required = true, value = "")
    @NotNull

    public String getNewCityName() {
        return newCityName;
    }

    public void setNewCityName(String newCityName) {
        this.newCityName = newCityName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdopcionAnimales.api.cities.CityNameChangeRequest CityNameChangeRequest = (AdopcionAnimales.api.cities.CityNameChangeRequest) o;
        return Objects.equals(this.newCityName, CityNameChangeRequest.newCityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newCityName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CityNameChangeRequest {\n");

        sb.append("    newCityName: ").append(toIndentedString(newCityName)).append("\n");
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
