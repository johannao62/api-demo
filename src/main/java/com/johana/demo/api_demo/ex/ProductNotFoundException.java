package com.johana.demo.api_demo.ex;

public class ProductNotFoundException
        extends RuntimeException {

    public ProductNotFoundException(String message){
        super(message);
    }

}
