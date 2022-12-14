/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.0.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.sk.controller;

import com.sk.model.CategoryDto;
import com.sk.model.CommentDto;
import com.sk.model.ModelApiResponse;
import com.sk.model.PostDto;
import com.sk.model.PostResponse;
import com.sk.model.UploadPostImageRequest;
import com.sk.model.UserDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-24T17:04:57.793635741+05:30[Asia/Kolkata]")
@Validated
@Tag(name = "api", description = "the api API")
public interface ApiApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /api/categories/
     *
     * @param categoryDto  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "createCategory",
        tags = { "category-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = CategoryDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/categories/",
        produces = { "*/*" },
        consumes = { "application/json" }
    )
    default ResponseEntity<CategoryDto> createCategory(
        @Parameter(name = "CategoryDto", description = "", required = true) @Valid @RequestBody CategoryDto categoryDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"categoryTitle\" : \"categoryTitle\", \"categoryId\" : 6, \"categoryDescription\" : \"categoryDescription\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /api/post/{postId}/comments
     *
     * @param postId  (required)
     * @param commentDto  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "createComment",
        tags = { "comment-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = CommentDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/post/{postId}/comments",
        produces = { "*/*" },
        consumes = { "application/json" }
    )
    default ResponseEntity<CommentDto> createComment(
        @Parameter(name = "postId", description = "", required = true) @PathVariable("postId") Integer postId,
        @Parameter(name = "CommentDto", description = "", required = true) @Valid @RequestBody CommentDto commentDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"id\" : 1, \"content\" : \"content\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /api/user/{userId}/category/{categoryId}/posts
     *
     * @param userId  (required)
     * @param categoryId  (required)
     * @param postDto  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "createPost",
        tags = { "post-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = PostDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/user/{userId}/category/{categoryId}/posts",
        produces = { "*/*" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PostDto> createPost(
        @Parameter(name = "userId", description = "", required = true) @PathVariable("userId") Integer userId,
        @Parameter(name = "categoryId", description = "", required = true) @PathVariable("categoryId") Integer categoryId,
        @Parameter(name = "PostDto", description = "", required = true) @Valid @RequestBody PostDto postDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"imageName\" : \"imageName\", \"addedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"comments\" : [ { \"id\" : 1, \"content\" : \"content\" }, { \"id\" : 1, \"content\" : \"content\" } ], \"postId\" : 0, \"title\" : \"title\", \"category\" : { \"categoryTitle\" : \"categoryTitle\", \"categoryId\" : 6, \"categoryDescription\" : \"categoryDescription\" }, \"user\" : { \"password\" : \"password\", \"name\" : \"name\", \"about\" : \"about\", \"id\" : 0, \"email\" : \"email\" }, \"content\" : \"content\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /api/users/
     *
     * @param userDto  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "createUser",
        tags = { "user-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = UserDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/users/",
        produces = { "*/*" },
        consumes = { "application/json" }
    )
    default ResponseEntity<UserDto> createUser(
        @Parameter(name = "UserDto", description = "", required = true) @Valid @RequestBody UserDto userDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"password\" : \"password\", \"name\" : \"name\", \"about\" : \"about\", \"id\" : 0, \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /api/categories/{catId}
     *
     * @param catId  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "deleteCategory",
        tags = { "category-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = ModelApiResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/categories/{catId}",
        produces = { "*/*" }
    )
    default ResponseEntity<ModelApiResponse> deleteCategory(
        @Parameter(name = "catId", description = "", required = true) @PathVariable("catId") Integer catId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"success\" : true, \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /api/comments/{commentId}
     *
     * @param commentId  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "deleteComment",
        tags = { "comment-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = ModelApiResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/comments/{commentId}",
        produces = { "*/*" }
    )
    default ResponseEntity<ModelApiResponse> deleteComment(
        @Parameter(name = "commentId", description = "", required = true) @PathVariable("commentId") Integer commentId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"success\" : true, \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /api/posts/{postId}
     *
     * @param postId  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "deletePost",
        tags = { "post-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = ModelApiResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/posts/{postId}",
        produces = { "*/*" }
    )
    default ResponseEntity<ModelApiResponse> deletePost(
        @Parameter(name = "postId", description = "", required = true) @PathVariable("postId") Integer postId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"success\" : true, \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /api/users/{userId}
     *
     * @param userId  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "deleteUser",
        tags = { "user-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = ModelApiResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/users/{userId}",
        produces = { "*/*" }
    )
    default ResponseEntity<ModelApiResponse> deleteUser(
        @Parameter(name = "userId", description = "", required = true) @PathVariable("userId") Integer userId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"success\" : true, \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/post/image/{imageName}
     *
     * @param imageName  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "downloadImage",
        tags = { "post-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/post/image/{imageName}"
    )
    default ResponseEntity<Void> downloadImage(
        @Parameter(name = "imageName", description = "", required = true) @PathVariable("imageName") String imageName
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/posts
     *
     * @param pageNumber  (optional, default to 0)
     * @param pageSize  (optional, default to 5)
     * @param sortBy  (optional, default to postId)
     * @param sortDir  (optional, default to asc)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getAllPost",
        tags = { "post-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = PostResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/posts",
        produces = { "*/*" }
    )
    default ResponseEntity<PostResponse> getAllPost(
        @Parameter(name = "pageNumber", description = "") @Valid @RequestParam(value = "pageNumber", required = false, defaultValue = "0") Integer pageNumber,
        @Parameter(name = "pageSize", description = "") @Valid @RequestParam(value = "pageSize", required = false, defaultValue = "5") Integer pageSize,
        @Parameter(name = "sortBy", description = "") @Valid @RequestParam(value = "sortBy", required = false, defaultValue = "postId") String sortBy,
        @Parameter(name = "sortDir", description = "") @Valid @RequestParam(value = "sortDir", required = false, defaultValue = "asc") String sortDir
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"pageNumber\" : 0, \"lastPage\" : true, \"totalPages\" : 5, \"pageSize\" : 6, \"content\" : [ { \"imageName\" : \"imageName\", \"addedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"comments\" : [ { \"id\" : 1, \"content\" : \"content\" }, { \"id\" : 1, \"content\" : \"content\" } ], \"postId\" : 0, \"title\" : \"title\", \"category\" : { \"categoryTitle\" : \"categoryTitle\", \"categoryId\" : 6, \"categoryDescription\" : \"categoryDescription\" }, \"user\" : { \"password\" : \"password\", \"name\" : \"name\", \"about\" : \"about\", \"id\" : 0, \"email\" : \"email\" }, \"content\" : \"content\" }, { \"imageName\" : \"imageName\", \"addedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"comments\" : [ { \"id\" : 1, \"content\" : \"content\" }, { \"id\" : 1, \"content\" : \"content\" } ], \"postId\" : 0, \"title\" : \"title\", \"category\" : { \"categoryTitle\" : \"categoryTitle\", \"categoryId\" : 6, \"categoryDescription\" : \"categoryDescription\" }, \"user\" : { \"password\" : \"password\", \"name\" : \"name\", \"about\" : \"about\", \"id\" : 0, \"email\" : \"email\" }, \"content\" : \"content\" } ], \"totalElements\" : 1 }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/users/
     *
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getAllUsers",
        tags = { "user-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = UserDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/users/",
        produces = { "*/*" }
    )
    default ResponseEntity<List<UserDto>> getAllUsers(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"password\" : \"password\", \"name\" : \"name\", \"about\" : \"about\", \"id\" : 0, \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/
     *
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getAllUsers1",
        tags = { "post-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = PostDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/",
        produces = { "*/*" }
    )
    default ResponseEntity<List<PostDto>> getAllUsers1(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"imageName\" : \"imageName\", \"addedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"comments\" : [ { \"id\" : 1, \"content\" : \"content\" }, { \"id\" : 1, \"content\" : \"content\" } ], \"postId\" : 0, \"title\" : \"title\", \"category\" : { \"categoryTitle\" : \"categoryTitle\", \"categoryId\" : 6, \"categoryDescription\" : \"categoryDescription\" }, \"user\" : { \"password\" : \"password\", \"name\" : \"name\", \"about\" : \"about\", \"id\" : 0, \"email\" : \"email\" }, \"content\" : \"content\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/categories/
     *
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getCategories",
        tags = { "category-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = CategoryDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/categories/",
        produces = { "*/*" }
    )
    default ResponseEntity<List<CategoryDto>> getCategories(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"categoryTitle\" : \"categoryTitle\", \"categoryId\" : 6, \"categoryDescription\" : \"categoryDescription\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/categories/{catId}
     *
     * @param catId  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getCategory",
        tags = { "category-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = CategoryDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/categories/{catId}",
        produces = { "*/*" }
    )
    default ResponseEntity<CategoryDto> getCategory(
        @Parameter(name = "catId", description = "", required = true) @PathVariable("catId") Integer catId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"categoryTitle\" : \"categoryTitle\", \"categoryId\" : 6, \"categoryDescription\" : \"categoryDescription\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/posts/{postId}
     *
     * @param postId  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getPostById",
        tags = { "post-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = PostDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/posts/{postId}",
        produces = { "*/*" }
    )
    default ResponseEntity<PostDto> getPostById(
        @Parameter(name = "postId", description = "", required = true) @PathVariable("postId") Integer postId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"imageName\" : \"imageName\", \"addedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"comments\" : [ { \"id\" : 1, \"content\" : \"content\" }, { \"id\" : 1, \"content\" : \"content\" } ], \"postId\" : 0, \"title\" : \"title\", \"category\" : { \"categoryTitle\" : \"categoryTitle\", \"categoryId\" : 6, \"categoryDescription\" : \"categoryDescription\" }, \"user\" : { \"password\" : \"password\", \"name\" : \"name\", \"about\" : \"about\", \"id\" : 0, \"email\" : \"email\" }, \"content\" : \"content\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/category/{categoryId}/posts
     *
     * @param categoryId  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getPostsByCategory",
        tags = { "post-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = PostDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/category/{categoryId}/posts",
        produces = { "*/*" }
    )
    default ResponseEntity<List<PostDto>> getPostsByCategory(
        @Parameter(name = "categoryId", description = "", required = true) @PathVariable("categoryId") Integer categoryId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"imageName\" : \"imageName\", \"addedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"comments\" : [ { \"id\" : 1, \"content\" : \"content\" }, { \"id\" : 1, \"content\" : \"content\" } ], \"postId\" : 0, \"title\" : \"title\", \"category\" : { \"categoryTitle\" : \"categoryTitle\", \"categoryId\" : 6, \"categoryDescription\" : \"categoryDescription\" }, \"user\" : { \"password\" : \"password\", \"name\" : \"name\", \"about\" : \"about\", \"id\" : 0, \"email\" : \"email\" }, \"content\" : \"content\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/user/{userId}/posts
     *
     * @param userId  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getPostsByUser",
        tags = { "post-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = PostDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/user/{userId}/posts",
        produces = { "*/*" }
    )
    default ResponseEntity<List<PostDto>> getPostsByUser(
        @Parameter(name = "userId", description = "", required = true) @PathVariable("userId") Integer userId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"imageName\" : \"imageName\", \"addedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"comments\" : [ { \"id\" : 1, \"content\" : \"content\" }, { \"id\" : 1, \"content\" : \"content\" } ], \"postId\" : 0, \"title\" : \"title\", \"category\" : { \"categoryTitle\" : \"categoryTitle\", \"categoryId\" : 6, \"categoryDescription\" : \"categoryDescription\" }, \"user\" : { \"password\" : \"password\", \"name\" : \"name\", \"about\" : \"about\", \"id\" : 0, \"email\" : \"email\" }, \"content\" : \"content\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/users/{userId}
     *
     * @param userId  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getSingleUser",
        tags = { "user-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = UserDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/users/{userId}",
        produces = { "*/*" }
    )
    default ResponseEntity<UserDto> getSingleUser(
        @Parameter(name = "userId", description = "", required = true) @PathVariable("userId") Integer userId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"password\" : \"password\", \"name\" : \"name\", \"about\" : \"about\", \"id\" : 0, \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/posts/search/{keywords}
     *
     * @param keywords  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "searchPostByTitle",
        tags = { "post-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = PostDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/posts/search/{keywords}",
        produces = { "*/*" }
    )
    default ResponseEntity<List<PostDto>> searchPostByTitle(
        @Parameter(name = "keywords", description = "", required = true) @PathVariable("keywords") String keywords
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"imageName\" : \"imageName\", \"addedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"comments\" : [ { \"id\" : 1, \"content\" : \"content\" }, { \"id\" : 1, \"content\" : \"content\" } ], \"postId\" : 0, \"title\" : \"title\", \"category\" : { \"categoryTitle\" : \"categoryTitle\", \"categoryId\" : 6, \"categoryDescription\" : \"categoryDescription\" }, \"user\" : { \"password\" : \"password\", \"name\" : \"name\", \"about\" : \"about\", \"id\" : 0, \"email\" : \"email\" }, \"content\" : \"content\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /api/categories/{catId}
     *
     * @param catId  (required)
     * @param categoryDto  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "updateCategory",
        tags = { "category-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = CategoryDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/api/categories/{catId}",
        produces = { "*/*" },
        consumes = { "application/json" }
    )
    default ResponseEntity<CategoryDto> updateCategory(
        @Parameter(name = "catId", description = "", required = true) @PathVariable("catId") Integer catId,
        @Parameter(name = "CategoryDto", description = "", required = true) @Valid @RequestBody CategoryDto categoryDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"categoryTitle\" : \"categoryTitle\", \"categoryId\" : 6, \"categoryDescription\" : \"categoryDescription\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /api/posts/{postId}
     *
     * @param postId  (required)
     * @param postDto  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "updatePost",
        tags = { "post-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = PostDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/api/posts/{postId}",
        produces = { "*/*" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PostDto> updatePost(
        @Parameter(name = "postId", description = "", required = true) @PathVariable("postId") Integer postId,
        @Parameter(name = "PostDto", description = "", required = true) @Valid @RequestBody PostDto postDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"imageName\" : \"imageName\", \"addedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"comments\" : [ { \"id\" : 1, \"content\" : \"content\" }, { \"id\" : 1, \"content\" : \"content\" } ], \"postId\" : 0, \"title\" : \"title\", \"category\" : { \"categoryTitle\" : \"categoryTitle\", \"categoryId\" : 6, \"categoryDescription\" : \"categoryDescription\" }, \"user\" : { \"password\" : \"password\", \"name\" : \"name\", \"about\" : \"about\", \"id\" : 0, \"email\" : \"email\" }, \"content\" : \"content\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /api/users/{userId}
     *
     * @param userId  (required)
     * @param userDto  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "updateUser",
        tags = { "user-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = UserDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/api/users/{userId}",
        produces = { "*/*" },
        consumes = { "application/json" }
    )
    default ResponseEntity<UserDto> updateUser(
        @Parameter(name = "userId", description = "", required = true) @PathVariable("userId") Integer userId,
        @Parameter(name = "UserDto", description = "", required = true) @Valid @RequestBody UserDto userDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"password\" : \"password\", \"name\" : \"name\", \"about\" : \"about\", \"id\" : 0, \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /api/post/image/upload/{postId}
     *
     * @param postId  (required)
     * @param uploadPostImageRequest  (optional)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "uploadPostImage",
        tags = { "post-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = PostDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/post/image/upload/{postId}",
        produces = { "*/*" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PostDto> uploadPostImage(
        @Parameter(name = "postId", description = "", required = true) @PathVariable("postId") Integer postId,
        @Parameter(name = "UploadPostImageRequest", description = "") @Valid @RequestBody(required = false) UploadPostImageRequest uploadPostImageRequest
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"imageName\" : \"imageName\", \"addedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"comments\" : [ { \"id\" : 1, \"content\" : \"content\" }, { \"id\" : 1, \"content\" : \"content\" } ], \"postId\" : 0, \"title\" : \"title\", \"category\" : { \"categoryTitle\" : \"categoryTitle\", \"categoryId\" : 6, \"categoryDescription\" : \"categoryDescription\" }, \"user\" : { \"password\" : \"password\", \"name\" : \"name\", \"about\" : \"about\", \"id\" : 0, \"email\" : \"email\" }, \"content\" : \"content\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
