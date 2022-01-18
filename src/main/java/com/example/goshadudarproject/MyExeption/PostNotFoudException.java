package com.example.goshadudarproject.MyExeption;

public class PostNotFoudException extends RuntimeException {
    public PostNotFoudException(Long id) {
        super("Could not find post" + id);
    }
}
