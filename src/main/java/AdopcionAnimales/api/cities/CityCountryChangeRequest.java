package AdopcionAnimales.api.cities;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * CityCountryChangeRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
public class CityCountryChangeRequest   {
    @JsonProperty("newCityCountry")
    private String newCityCountry = null;

    public AdopcionAnimales.api.cities.CityCountryChangeRequest newCityCountry(String newCityCountry) {
        this.newCityCountry = newCityCountry;
        return this;
    }

    /**
     * Get newCityCountry
     * @return newCityCountry
     **/
    @ApiModelProperty(example = "España", required = true, value = "")
    @NotNull

    public String getNewCityCountry() {
        return newCityCountry;
    }

    public void setNewCityCountry(String newCityCountry) {
        this.newCityCountry = newCityCountry;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdopcionAnimales.api.cities.CityCountryChangeRequest CityCountryChangeRequest = (AdopcionAnimales.api.cities.CityCountryChangeRequest) o;
        return Objects.equals(this.newCityCountry, CityCountryChangeRequest.newCityCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newCityCountry);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CityCountryChangeRequest {\n");

        sb.append("    newCityCountry: ").append(toIndentedString(newCityCountry)).append("\n");
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
