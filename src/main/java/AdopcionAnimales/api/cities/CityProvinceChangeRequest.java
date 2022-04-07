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

public class CityProvinceChangeRequest {

        @JsonProperty("newCityProvince")
        private String newCityProvince = null;

        public CityProvinceChangeRequest newCityProvince(String newCityProvince) {
            this.newCityProvince = newCityProvince;
            return this;
        }

        /**
         * Get newCityProvince
         * @return newCityProvince
         **/
        @ApiModelProperty(example = "11555", required = true, value = "")
        @NotNull

        public String getNewCityProvince() {
            return newCityProvince;
        }

        public void setNewCityProvince(String newCityProvince) {
            this.newCityProvince = newCityProvince;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            CityProvinceChangeRequest CityPostalCodeChangeRequest = (CityProvinceChangeRequest) o;
            return Objects.equals(this.newCityProvince, CityPostalCodeChangeRequest.newCityProvince);
        }

        @Override
        public int hashCode() {
            return Objects.hash(newCityProvince);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class CityPostalCodeChangeRequest {\n");

            sb.append("    newCityProvince: ").append(toIndentedString(newCityProvince)).append("\n");
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
