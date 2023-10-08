package com.example.Rest;

import java.util.NoSuchElementException;

public class ResourceNotFoundException extends NoSuchElementException {
    Integer code=404;
    public ResourceNotFoundException(String notFound){
        this.getCode();
        System.out.println(notFound);
    }

    private void getCode() {
        System.out.println("Error:".concat(String.valueOf(code)));
    }
}
