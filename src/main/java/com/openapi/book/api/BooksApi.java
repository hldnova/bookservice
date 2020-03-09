package com.openapi.book.api;

import com.openapi.book.model.*;
import com.openapi.book.api.BooksApiService;
import com.openapi.book.api.factories.BooksApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.openapi.book.model.Book;
import com.openapi.book.model.BookList;
import com.openapi.book.model.BookUpdate;

import java.util.Map;
import java.util.List;
import com.openapi.book.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.ws.rs.POST;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/books")


@io.swagger.annotations.Api(description = "the books API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-05-31T00:32:39.496Z[UTC]")
public class BooksApi  {
   private final BooksApiService delegate = BooksApiServiceFactory.getBooksApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a book", notes = "", response = Book.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Details of the newly created book", response = Book.class) })
    public Response createBook(
        @ApiParam(value = "Book to be created" ,required=true) @Valid Book book,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createBook(book,securityContext);
    }
    @DELETE
    @Path("/{book}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete a book", notes = "", response = Void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Indicates that the book was successfully deleted", response = Void.class) })
    public Response deleteBook(
        @ApiParam(value = "Identfier of the book",required=true) @PathParam("book") String book,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteBook(book,securityContext);
    }
    @GET
    @Path("/{book}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Gets details of a specific book", notes = "", response = Book.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Book information for the given book identifier.", response = Book.class) })
    public Response getBook(
        @ApiParam(value = "Identfier of the book",required=true) @PathParam("book") String book,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getBook(book,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get list of books", notes = "", response = BookList.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of management user information", response = BookList.class) })
    public Response getBooks(
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getBooks(securityContext);
    }
    @PUT
    @Path("/{book}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "null", notes = "", response = Book.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Indicates that local user information updated", response = Book.class) })
    public Response updateBook(
        @ApiParam(value = "Identifier of the book to be updated.",required=true) @PathParam("book") String book,
        @ApiParam(value = "Management user to" ,required=true) @Valid BookUpdate bookUpdate,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateBook(book,bookUpdate,securityContext);
    }
}
