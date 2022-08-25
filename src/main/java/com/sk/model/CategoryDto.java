package com.sk.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CategoryDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-24T17:04:57.793635741+05:30[Asia/Kolkata]")
public class CategoryDto implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("categoryId")
  private Integer categoryId;

  @JsonProperty("categoryTitle")
  private String categoryTitle;

  @JsonProperty("categoryDescription")
  private String categoryDescription;

  public CategoryDto categoryId(Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * Get categoryId
   * @return categoryId
  */
  
  @Schema(name = "categoryId", required = false)
  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public CategoryDto categoryTitle(String categoryTitle) {
    this.categoryTitle = categoryTitle;
    return this;
  }

  /**
   * Get categoryTitle
   * @return categoryTitle
  */
  @NotNull @Size(min = 4, max = 2147483647) 
  @Schema(name = "categoryTitle", required = true)
  public String getCategoryTitle() {
    return categoryTitle;
  }

  public void setCategoryTitle(String categoryTitle) {
    this.categoryTitle = categoryTitle;
  }

  public CategoryDto categoryDescription(String categoryDescription) {
    this.categoryDescription = categoryDescription;
    return this;
  }

  /**
   * Get categoryDescription
   * @return categoryDescription
  */
  @NotNull @Size(min = 10, max = 2147483647) 
  @Schema(name = "categoryDescription", required = true)
  public String getCategoryDescription() {
    return categoryDescription;
  }

  public void setCategoryDescription(String categoryDescription) {
    this.categoryDescription = categoryDescription;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryDto categoryDto = (CategoryDto) o;
    return Objects.equals(this.categoryId, categoryDto.categoryId) &&
        Objects.equals(this.categoryTitle, categoryDto.categoryTitle) &&
        Objects.equals(this.categoryDescription, categoryDto.categoryDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, categoryTitle, categoryDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryDto {\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    categoryTitle: ").append(toIndentedString(categoryTitle)).append("\n");
    sb.append("    categoryDescription: ").append(toIndentedString(categoryDescription)).append("\n");
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

