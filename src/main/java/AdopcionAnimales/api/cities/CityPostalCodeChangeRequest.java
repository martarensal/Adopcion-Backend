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

public class CityPostalCodeChangeRequest {

        @JsonProperty("newCityPostalCode")
        private String newCityPostalCode = null;

        public AdopcionAnimales.api.cities.CityPostalCodeChangeRequest newCityPostalCode(String newCityPostalCode) {
            this.newCityPostalCode = newCityPostalCode;
            return this;
        }

        /**
         * Get newCityPostalCode
         * @return newCityPostalCode
         **/
        @ApiModelProperty(example = "11555", required = true, value = "")
        @NotNull

        public String getNewCityPostalCode() {
            return newCityPostalCode;
        }

        public void setNewCityPostalCode(String newCityPostalCode) {
            this.newCityPostalCode = newCityPostalCode;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            AdopcionAnimales.api.cities.CityPostalCodeChangeRequest CityPostalCodeChangeRequest = (AdopcionAnimales.api.cities.CityPostalCodeChangeRequest) o;
            return Objects.equals(this.newCityPostalCode, CityPostalCodeChangeRequest.newCityPostalCode);
        }

        @Override
        public int hashCode() {
            return Objects.hash(newCityPostalCode);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class CityPostalCodeChangeRequest {\n");

            sb.append("    newCityPostalCode: ").append(toIndentedString(newCityPostalCode)).append("\n");
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
