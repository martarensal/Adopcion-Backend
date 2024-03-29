package AdopcionAnimales.api.animals;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * AnimalResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
public class AnimalResponse   {
  @JsonProperty("id")
  private Long id = null;
  public AnimalResponse id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   *
   * @return id
   **/
  @ApiModelProperty(example = "1", required = true, value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @JsonProperty("name")
  private String name = null;

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

  @JsonProperty("age")
  private Integer age = null;

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

  public AnimalResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Maya", value = "")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AnimalResponse size(SizeEnum size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(example = "pequeño", value = "")

  public SizeEnum getSize() {
    return size;
  }

  public void setSize(SizeEnum size) {
    this.size = size;
  }

  public AnimalResponse age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
  **/
  @ApiModelProperty(example = "5", value = "")

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public AnimalResponse colour(ColourEnum colour) {
    this.colour = colour;
    return this;
  }

  /**
   * Get colour
   * @return colour
  **/
  @ApiModelProperty(example = "marron", value = "")

  public ColourEnum getColour() {
    return colour;
  }

  public void setColour(ColourEnum colour) {
    this.colour = colour;
  }

  public AnimalResponse sex(SexEnum sex) {
    this.sex = sex;
    return this;
  }

  /**
   * Get sex
   * @return sex
  **/
  @ApiModelProperty(example = "macho", value = "")

  public SexEnum getSex() {
    return sex;
  }

  public void setSex(SexEnum sex) {
    this.sex = sex;
  }

  public AnimalResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "adoptado", value = "")

  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public AnimalResponse image(String image) {
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

  @JsonProperty("type")
  private String type = null;

  /**
   * Get type
   * @return type
   **/
  @ApiModelProperty(example = "Perro", value = "")

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @JsonProperty("city")
  private String city = null;

  /**
   * Get city
   * @return city
   **/
  @ApiModelProperty(example = "Puerto real", value = "")

  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  @JsonProperty("user")
  private Long user = null;

  public AnimalResponse user(Long user) {
    this.user = user;
    return this;
  }
  /**
   * Get user
   * @return user
   **/
  @ApiModelProperty(example = "1", value = "")

  public Long getUser() {
    return user;
  }

  public void setUser(Long user) {
    this.user = user;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnimalResponse animalResponse = (AnimalResponse) o;
    return Objects.equals(this.name, animalResponse.name) &&
        Objects.equals(this.size, animalResponse.size) &&
        Objects.equals(this.age, animalResponse.age) &&
        Objects.equals(this.colour, animalResponse.colour) &&
        Objects.equals(this.sex, animalResponse.sex) &&
        Objects.equals(this.status, animalResponse.status) &&
        Objects.equals(this.image, animalResponse.image) &&
        Objects.equals(this.type, animalResponse.type) &&
            Objects.equals(this.city, animalResponse.city)&&
            Objects.equals(this.user, animalResponse.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, size, age, colour, sex, status, image, type, city, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnimalResponse {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    colour: ").append(toIndentedString(colour)).append("\n");
    sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");

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
