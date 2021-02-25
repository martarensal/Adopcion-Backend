package com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.animals;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.model.PaginationInfo;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AnimalPaginatedResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
public class AnimalPaginatedResponse   {
  @JsonProperty("pages")
  @Valid
  private List<AnimalResponse> pages = new ArrayList<AnimalResponse>();

  @JsonProperty("paginationInfo")
  private PaginationInfo paginationInfo = null;

  public AnimalPaginatedResponse pages(List<AnimalResponse> pages) {
    this.pages = pages;
    return this;
  }

  public AnimalPaginatedResponse addPagesItem(AnimalResponse pagesItem) {
    this.pages.add(pagesItem);
    return this;
  }

  /**
   * Get pages
   * @return pages
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public List<AnimalResponse> getPages() {
    return pages;
  }

  public void setPages(List<AnimalResponse> pages) {
    this.pages = pages;
  }

  public AnimalPaginatedResponse paginationInfo(PaginationInfo paginationInfo) {
    this.paginationInfo = paginationInfo;
    return this;
  }

  /**
   * Get paginationInfo
   * @return paginationInfo
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public PaginationInfo getPaginationInfo() {
    return paginationInfo;
  }

  public void setPaginationInfo(PaginationInfo paginationInfo) {
    this.paginationInfo = paginationInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnimalPaginatedResponse animalPaginatedResponse = (AnimalPaginatedResponse) o;
    return Objects.equals(this.pages, animalPaginatedResponse.pages) &&
        Objects.equals(this.paginationInfo, animalPaginatedResponse.paginationInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pages, paginationInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnimalPaginatedResponse {\n");
    
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    paginationInfo: ").append(toIndentedString(paginationInfo)).append("\n");
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
