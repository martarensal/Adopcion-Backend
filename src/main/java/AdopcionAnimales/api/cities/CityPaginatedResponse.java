package AdopcionAnimales.api.cities;

import AdopcionAnimales.api.utils.PaginationInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;

/**
 * CityPaginatedResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
public class CityPaginatedResponse  {
    @JsonProperty("pages")
    @Valid
    private List<CityResponse> pages = new ArrayList<CityResponse>();

    @JsonProperty("paginationInfo")
    private PaginationInfo paginationInfo = null;

    public AdopcionAnimales.api.cities.CityPaginatedResponse pages(List<CityResponse> pages) {
        this.pages = pages;
        return this;
    }

    public AdopcionAnimales.api.cities.CityPaginatedResponse addPagesItem(CityResponse pagesItem) {
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
    public List<CityResponse> getPages() {
        return pages;
    }

    public void setPages(List<CityResponse> pages) {
        this.pages = pages;
    }

    public AdopcionAnimales.api.cities.CityPaginatedResponse paginationInfo(PaginationInfo paginationInfo) {
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
        AdopcionAnimales.api.cities.CityPaginatedResponse cityPaginatedResponse = (AdopcionAnimales.api.cities.CityPaginatedResponse) o;
        return Objects.equals(this.pages, cityPaginatedResponse.pages) &&
                Objects.equals(this.paginationInfo, cityPaginatedResponse.paginationInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pages, paginationInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CityPaginatedResponse {\n");

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
