package com.tnsif.uncheckedexception;

public class AgeValidator {
	static void validateAge(int age) throws InvalidAgeException{
		
		if(age<18)
		{
			throw new InvalidAgeException();
		}
		
	}

}
