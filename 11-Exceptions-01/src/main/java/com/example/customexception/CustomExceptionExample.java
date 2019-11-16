package com.example.customexception;

public class CustomExceptionExample {

	public static void main(String[] args) {

		// ?? Surround with try catch
		CustomExceptionExample.checkPassWord("pass");

		// ?? Surround with try catch
		CustomExceptionExample.checkPassWord(null);

	}

	public static void checkPassWord(String pass) throws InvalidPasswordException {

		int minPassLength = 5;

		try {

			if (pass.length() < minPassLength) {
				throw new InvalidPasswordException("The password provided is too short");
			}

		} catch (NullPointerException e) {

			throw new InvalidPasswordException("No password provided", e);

		}
	}
}

class InvalidPasswordException extends RuntimeException { // change to Exception

	InvalidPasswordException() {
	}

	InvalidPasswordException(String message) {

		super(message);
	}

	InvalidPasswordException(String message, Throwable cause) {

		super(message, cause);
	}
}
