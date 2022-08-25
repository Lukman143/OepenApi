package com.sk.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.sk.model.CategoryDto;
import com.sk.model.CommentDto;
import com.sk.model.UserDto;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-24T17:04:57.793635741+05:30[Asia/Kolkata]")
public class PostDto implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("postId")
  private Integer postId;

  @JsonProperty("title")
  private String title;

  @JsonProperty("content")
  private String content;

  @JsonProperty("imageName")
  private String imageName;

  @JsonProperty("addedDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date addedDate;

  @JsonProperty("category")
  private CategoryDto category;

  @JsonProperty("user")
  private UserDto user;

  @JsonProperty("comments")
  @Valid
  private Set<CommentDto> comments = null;

  public PostDto postId(Integer postId) {
    this.postId = postId;
    return this;
  }

  /**
   * Get postId
   * @return postId
  */
  
  @Schema(name = "postId", required = false)
  public Integer getPostId() {
    return postId;
  }

  public void setPostId(Integer postId) {
    this.postId = postId;
  }

  public PostDto title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  
  @Schema(name = "title", required = false)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PostDto content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  */
  
  @Schema(name = "content", required = false)
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public PostDto imageName(String imageName) {
    this.imageName = imageName;
    return this;
  }

  /**
   * Get imageName
   * @return imageName
  */
  
  @Schema(name = "imageName", required = false)
  public String getImageName() {
    return imageName;
  }

  public void setImageName(String imageName) {
    this.imageName = imageName;
  }

  public PostDto addedDate(Date addedDate) {
    this.addedDate = addedDate;
    return this;
  }

  /**
   * Get addedDate
   * @return addedDate
  */
  @Valid 
  @Schema(name = "addedDate", required = false)
  public Date getAddedDate() {
    return addedDate;
  }

  public void setAddedDate(Date addedDate) {
    this.addedDate = addedDate;
  }

  public PostDto category(CategoryDto category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @Valid 
  @Schema(name = "category", required = false)
  public CategoryDto getCategory() {
    return category;
  }

  public void setCategory(CategoryDto category) {
    this.category = category;
  }

  public PostDto user(UserDto user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  */
  @Valid 
  @Schema(name = "user", required = false)
  public UserDto getUser() {
    return user;
  }

  public void setUser(UserDto user) {
    this.user = user;
  }

  public PostDto comments(Set<CommentDto> comments) {
    this.comments = comments;
    return this;
  }

  public PostDto addCommentsItem(CommentDto commentsItem) {
    if (this.comments == null) {
      this.comments = new LinkedHashSet<>();
    }
    this.comments.add(commentsItem);
    return this;
  }

  /**
   * Get comments
   * @return comments
  */
  @Valid 
  @Schema(name = "comments", required = false)
  public Set<CommentDto> getComments() {
    return comments;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setComments(Set<CommentDto> comments) {
    this.comments = comments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostDto postDto = (PostDto) o;
    return Objects.equals(this.postId, postDto.postId) &&
        Objects.equals(this.title, postDto.title) &&
        Objects.equals(this.content, postDto.content) &&
        Objects.equals(this.imageName, postDto.imageName) &&
        Objects.equals(this.addedDate, postDto.addedDate) &&
        Objects.equals(this.category, postDto.category) &&
        Objects.equals(this.user, postDto.user) &&
        Objects.equals(this.comments, postDto.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postId, title, content, imageName, addedDate, category, user, comments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostDto {\n");
    sb.append("    postId: ").append(toIndentedString(postId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
    sb.append("    addedDate: ").append(toIndentedString(addedDate)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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

