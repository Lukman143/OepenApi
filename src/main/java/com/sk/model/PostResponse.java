package com.sk.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.sk.model.PostDto;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-24T17:04:57.793635741+05:30[Asia/Kolkata]")
public class PostResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("content")
  @Valid
  private List<PostDto> content = null;

  @JsonProperty("pageNumber")
  private Integer pageNumber;

  @JsonProperty("pageSize")
  private Integer pageSize;

  @JsonProperty("totalElements")
  private Long totalElements;

  @JsonProperty("totalPages")
  private Integer totalPages;

  @JsonProperty("lastPage")
  private Boolean lastPage;

  public PostResponse content(List<PostDto> content) {
    this.content = content;
    return this;
  }

  public PostResponse addContentItem(PostDto contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * Get content
   * @return content
  */
  @Valid 
  @Schema(name = "content", required = false)
  public List<PostDto> getContent() {
    return content;
  }

  public void setContent(List<PostDto> content) {
    this.content = content;
  }

  public PostResponse pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * Get pageNumber
   * @return pageNumber
  */
  
  @Schema(name = "pageNumber", required = false)
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public PostResponse pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   * @return pageSize
  */
  
  @Schema(name = "pageSize", required = false)
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public PostResponse totalElements(Long totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Get totalElements
   * @return totalElements
  */
  
  @Schema(name = "totalElements", required = false)
  public Long getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }

  public PostResponse totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Get totalPages
   * @return totalPages
  */
  
  @Schema(name = "totalPages", required = false)
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public PostResponse lastPage(Boolean lastPage) {
    this.lastPage = lastPage;
    return this;
  }

  /**
   * Get lastPage
   * @return lastPage
  */
  
  @Schema(name = "lastPage", required = false)
  public Boolean getLastPage() {
    return lastPage;
  }

  public void setLastPage(Boolean lastPage) {
    this.lastPage = lastPage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostResponse postResponse = (PostResponse) o;
    return Objects.equals(this.content, postResponse.content) &&
        Objects.equals(this.pageNumber, postResponse.pageNumber) &&
        Objects.equals(this.pageSize, postResponse.pageSize) &&
        Objects.equals(this.totalElements, postResponse.totalElements) &&
        Objects.equals(this.totalPages, postResponse.totalPages) &&
        Objects.equals(this.lastPage, postResponse.lastPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, pageNumber, pageSize, totalElements, totalPages, lastPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostResponse {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    lastPage: ").append(toIndentedString(lastPage)).append("\n");
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

