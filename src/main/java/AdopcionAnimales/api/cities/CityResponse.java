package AdopcionAnimales.api.cities;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * CityResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
public class CityResponse   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("province")
  private String province = null;

  @JsonProperty("autonomousCommunity")
  private String autonomousCommunity = null;

  public CityResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Cadiz", required = true, value = "")
  @NotNull

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CityResponse province(String province) {
    this.province = province;
    return this;
  }

  /**
   * Get province
   * @return province
  **/
  @ApiModelProperty(example = "115010", required = true, value = "")
  @NotNull

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public CityResponse autonomousCommunity(String autonomousCommunity) {
    this.autonomousCommunity = autonomousCommunity;
    return this;
  }

  /**
   * Get autonomousCommunity
   * @return autonomousCommunity
  **/
  @ApiModelProperty(example = "Spain", required = true, value = "")
  @NotNull

  public String getAutonomousCommunity() {
    return autonomousCommunity;
  }

  public void setAutonomousCommunity(String autonomousCommunity) {
    this.autonomousCommunity = autonomousCommunity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CityResponse cityResponse = (CityResponse) o;
    return Objects.equals(this.name, cityResponse.name) &&
        Objects.equals(this.province, cityResponse.province) &&
        Objects.equals(this.autonomousCommunity, cityResponse.autonomousCommunity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, province, autonomousCommunity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CityResponse {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    autonomousCommunity: ").append(toIndentedString(autonomousCommunity)).append("\n");
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
