package AdopcionAnimales.api.animals;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * AnimalCreationRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
public class AnimalCreationRequest   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("age")
  private Integer age = null;


  @JsonProperty("type_id")
  private Long type_id = 0l;

  @JsonProperty("city_id")
  private Long city_id = 0l;

  /**
   * Gets or Sets size
   */
  public enum SizeEnum {
    PEQUEÑO("pequeño"),
    
    MEDIANO("mediano"),
    
    GRANDE("grande");

    private String value;

    SizeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SizeEnum fromValue(String text) {
      for (SizeEnum b : SizeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("size")
  private SizeEnum size = null;

  /**
   * Gets or Sets colour
   */
  public enum ColourEnum {
    BLANCO("blanco"),

    NEGRO("negro"),

    MARRON("marron"),

    CANELA("canela"),

    VERDE("verde"),

    ROJO("rojo"),

    AMARILLO("amarillo"),

    AZUL("azul"),

    NARANJA("naranja");

    private String value;

    ColourEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ColourEnum fromValue(String text) {
      for (ColourEnum b : ColourEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("colour")
  private ColourEnum colour = null;

  /**
   * Gets or Sets sex
   */
  public enum SexEnum {
    MACHO("macho"),
    
    HEMBRA("hembra");

    private String value;

    SexEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SexEnum fromValue(String text) {
      for (SexEnum b : SexEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("sex")
  private SexEnum sex = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    ADOPTADO("adoptado"),

    SIN_HOGAR("sin hogar"),

    ACOGIDO("acogido");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("image")
  private String image = null;

  public AnimalCreationRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Maya", required = true, value = "")
  @NotNull

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AnimalCreationRequest age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
  **/
  @ApiModelProperty(example = "5", required = true, value = "")
  @NotNull

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public AnimalCreationRequest size(SizeEnum size) {
    this.size = size;
    return this;
  }

  public AnimalCreationRequest type_id(Long type_id) {
    this.type_id = type_id;
    return this;
  }

  /**
   * Get type_id
   * @return type_id
   **/
  @ApiModelProperty(example = "1", required = true, value = "")
  @NotNull

  public Long getType_id() {
    return type_id;
  }

  public void setType_id(Long type_id) {
    this.type_id = type_id;
  }

  public AnimalCreationRequest city_id(Long city_id) {
    this.city_id = city_id;
    return this;
  }

  /**
   * Get city_id
   * @return city_id
   **/
  @ApiModelProperty(example = "1", required = true, value = "")
  @NotNull

  public Long getCity_id() {
    return city_id;
  }

  public void setCity_id(Long city_id) {
    this.city_id = city_id;
  }

  /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(example = "pequeño", required = true, value = "")
  @NotNull

  public SizeEnum getSize() {
    return size;
  }

  public void setSize(SizeEnum size) {
    this.size = size;
  }

  public AnimalCreationRequest colour(ColourEnum colour) {
    this.colour = colour;
    return this;
  }

  /**
   * Get colour
   * @return colour
  **/
  @ApiModelProperty(example = "marron", required = true, value = "")
  @NotNull

  public ColourEnum getColour() {
    return colour;
  }

  public void setColour(ColourEnum colour) {
    this.colour = colour;
  }

  public AnimalCreationRequest sex(SexEnum sex) {
    this.sex = sex;
    return this;
  }

  /**
   * Get sex
   * @return sex
  **/
  @ApiModelProperty(example = "hembra", required = true, value = "")
  @NotNull

  public SexEnum getSex() {
    return sex;
  }

  public void setSex(SexEnum sex) {
    this.sex = sex;
  }

  public AnimalCreationRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "sin hogar", required = true, value = "")
  @NotNull

  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public AnimalCreationRequest image(String image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(example = "animal.png", value = "")

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnimalCreationRequest animalCreationRequest = (AnimalCreationRequest) o;
    return Objects.equals(this.name, animalCreationRequest.name) &&
        Objects.equals(this.age, animalCreationRequest.age) &&
        Objects.equals(this.size, animalCreationRequest.size) &&
        Objects.equals(this.colour, animalCreationRequest.colour) &&
        Objects.equals(this.sex, animalCreationRequest.sex) &&
        Objects.equals(this.status, animalCreationRequest.status) &&
        Objects.equals(this.image, animalCreationRequest.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age, size, colour, sex, status, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnimalCreationRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    colour: ").append(toIndentedString(colour)).append("\n");
    sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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
