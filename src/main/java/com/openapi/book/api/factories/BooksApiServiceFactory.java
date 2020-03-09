package com.openapi.book.api.factories;

import com.openapi.book.api.BooksApiService;
import com.openapi.book.api.impl.BooksApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-05-31T00:32:39.496Z[UTC]")
public class BooksApiServiceFactory {
    private final static BooksApiService service = new BooksApiServiceImpl();

    public static BooksApiService getBooksApi() {
        return service;
    }
}
