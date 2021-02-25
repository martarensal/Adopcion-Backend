package com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.users;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * AnimalAgeChangeRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
public class AnimalAgeChangeRequest   {
  @JsonProperty("newAnimalAge")
  private Integer newAnimalAge = null;

  public AnimalAgeChangeRequest newAnimalAge(Integer newAnimalAge) {
    this.newAnimalAge = newAnimalAge;
    return this;
  }

  /**
   * Get newAnimalAge
   * @return newAnimalAge
  **/
  @ApiModelProperty(example = "4", required = true, value = "")
  @NotNull

  public Integer getNewAnimalAge() {
    return newAnimalAge;
  }

  public void setNewAnimalAge(Integer newAnimalAge) {
    this.newAnimalAge = newAnimalAge;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnimalAgeChangeRequest animalAgeChangeRequest = (AnimalAgeChangeRequest) o;
    return Objects.equals(this.newAnimalAge, animalAgeChangeRequest.newAnimalAge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newAnimalAge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnimalAgeChangeRequest {\n");
    
    sb.append("    newAnimalAge: ").append(toIndentedString(newAnimalAge)).append("\n");
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
