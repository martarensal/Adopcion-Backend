package com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.users;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * AnimalColourChangeRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
public class AnimalColourChangeRequest   {
  /**
   * Gets or Sets newAnimalColour
   */
  public enum NewAnimalColourEnum {
    WHITE("white"),
    
    BLACK("black"),
    
    BROWN("brown"),
    
    LIGHTBROWN("lightbrown"),
    
    GREEN("green"),
    
    RED("red"),
    
    YELLOW("yellow"),
    
    BLUE("blue"),
    
    ORANGE("orange");

    private String value;

    NewAnimalColourEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NewAnimalColourEnum fromValue(String text) {
      for (NewAnimalColourEnum b : NewAnimalColourEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("newAnimalColour")
  private NewAnimalColourEnum newAnimalColour = null;

  public AnimalColourChangeRequest newAnimalColour(NewAnimalColourEnum newAnimalColour) {
    this.newAnimalColour = newAnimalColour;
    return this;
  }

  /**
   * Get newAnimalColour
   * @return newAnimalColour
  **/
  @ApiModelProperty(example = "brown", required = true, value = "")
  @NotNull

  public NewAnimalColourEnum getNewAnimalColour() {
    return newAnimalColour;
  }

  public void setNewAnimalColour(NewAnimalColourEnum newAnimalColour) {
    this.newAnimalColour = newAnimalColour;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnimalColourChangeRequest animalColourChangeRequest = (AnimalColourChangeRequest) o;
    return Objects.equals(this.newAnimalColour, animalColourChangeRequest.newAnimalColour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newAnimalColour);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnimalColourChangeRequest {\n");
    
    sb.append("    newAnimalColour: ").append(toIndentedString(newAnimalColour)).append("\n");
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
