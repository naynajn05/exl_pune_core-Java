package com.tnsif.uncheckedexception;

public class InvalidAgeException extends Exception {
	
	InvalidAgeException()
	{
		super("Invalid age");
	}
	
	InvalidAgeException(String message)
	{
		super(message);
	}

}
