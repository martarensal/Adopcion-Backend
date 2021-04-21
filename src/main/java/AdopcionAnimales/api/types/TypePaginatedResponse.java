package AdopcionAnimales.api.types;

import AdopcionAnimales.api.PaginationInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;

/**
 * TypePaginatedResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
public class TypePaginatedResponse   {
    @JsonProperty("pages")
    @Valid
    private List<TypeResponse> pages = new ArrayList<TypeResponse>();

    @JsonProperty("paginationInfo")
    private PaginationInfo paginationInfo = null;

    public AdopcionAnimales.api.types.TypePaginatedResponse pages(List<TypeResponse> pages) {
        this.pages = pages;
        return this;
    }

    public AdopcionAnimales.api.types.TypePaginatedResponse addPagesItem(TypeResponse pagesItem) {
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
    public List<TypeResponse> getPages() {
        return pages;
    }

    public void setPages(List<TypeResponse> pages) {
        this.pages = pages;
    }

    public AdopcionAnimales.api.types.TypePaginatedResponse paginationInfo(PaginationInfo paginationInfo) {
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
        AdopcionAnimales.api.types.TypePaginatedResponse TypePaginatedResponse = (AdopcionAnimales.api.types.TypePaginatedResponse) o;
        return Objects.equals(this.pages, TypePaginatedResponse.pages) &&
                Objects.equals(this.paginationInfo, TypePaginatedResponse.paginationInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pages, paginationInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TypePaginatedResponse {\n");

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
