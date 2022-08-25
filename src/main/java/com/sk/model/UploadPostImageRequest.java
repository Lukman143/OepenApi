package com.sk.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UploadPostImageRequest
 */

@JsonTypeName("uploadPostImage_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-24T17:04:57.793635741+05:30[Asia/Kolkata]")
public class UploadPostImageRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("image")
  private org.springframework.core.io.Resource image;

  public UploadPostImageRequest image(org.springframework.core.io.Resource image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
  */
  @NotNull @Valid 
  @Schema(name = "image", required = true)
  public org.springframework.core.io.Resource getImage() {
    return image;
  }

  public void setImage(org.springframework.core.io.Resource image) {
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
    UploadPostImageRequest uploadPostImageRequest = (UploadPostImageRequest) o;
    return Objects.equals(this.image, uploadPostImageRequest.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadPostImageRequest {\n");
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

