package com.college.recipes_collection.exceptions;

public class RecipeAlreadyExistsException extends RuntimeException{
    public RecipeAlreadyExistsException(String message) {
        super(message);
    }
}
