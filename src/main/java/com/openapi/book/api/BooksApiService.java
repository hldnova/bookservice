package com.openapi.book.api;

import com.openapi.book.api.*;
import com.openapi.book.model.*;

import com.sun.jersey.multipart.FormDataParam;

import com.openapi.book.model.Book;
import com.openapi.book.model.BookList;
import com.openapi.book.model.BookUpdate;

import java.util.List;
import com.openapi.book.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-05-31T00:32:39.496Z[UTC]")
public abstract class BooksApiService {
      public abstract Response createBook(Book book,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response deleteBook(String book,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response getBook(String book,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response getBooks(SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response updateBook(String book,BookUpdate bookUpdate,SecurityContext securityContext)
      throws NotFoundException;
}
