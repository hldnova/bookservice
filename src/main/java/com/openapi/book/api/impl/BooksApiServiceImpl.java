package com.openapi.book.api.impl;

import com.openapi.book.api.*;
import com.openapi.book.model.*;

import com.sun.jersey.multipart.FormDataParam;

import com.openapi.book.model.Book;
import com.openapi.book.model.BookList;
import com.openapi.book.model.BookUpdate;

import java.util.ArrayList;
import java.util.List;
import com.openapi.book.api.NotFoundException;

import java.io.InputStream;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-05-31T00:32:39.496Z[UTC]")
public class BooksApiServiceImpl extends BooksApiService {


    private final Map<String, Book> catalog = new ConcurrentHashMap<>();

    @Override
    public Response createBook(Book book, SecurityContext securityContext) throws NotFoundException {
        catalog.put(book.getIsbn(), book);
        return Response.ok().entity(book).build();
    }

    @Override
    public Response deleteBook(String book, SecurityContext securityContext) throws NotFoundException {
        catalog.remove(book);
        return Response.ok().status(Response.Status.NO_CONTENT).build();
    }

    @Override
    public Response getBook(String book, SecurityContext securityContext) throws NotFoundException {
        return Response.ok().entity(catalog.get(book)).build();
    }

    @Override
    public Response getBooks(SecurityContext securityContext) throws NotFoundException {
        System.out.println("list books");
        BookList bookList = new BookList();
        bookList.setData(new ArrayList<>(catalog.values()));
        return Response.ok().entity(bookList).build();
    }

    @Override
    public Response updateBook(String book, BookUpdate bookUpdate, SecurityContext securityContext)
    throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
