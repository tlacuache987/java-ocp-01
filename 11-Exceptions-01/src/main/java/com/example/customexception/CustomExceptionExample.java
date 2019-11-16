package com.example.customexception;

public class CustomExceptionExample {

	public static void main(String[] args) {

		// ?? Surround with try catch
		try {

			CustomExceptionExample.checkPassWord("pass");

		} catch (InvalidPasswordException e) {

			e.printStackTrace();
		}

		// ?? Surround with try catch
		try {

			CustomExceptionExample.checkPassWord(null);

		} catch (InvalidPasswordException e) {

			e.printStackTrace();
		}

	}

	public static void checkPassWord(String pass) throws InvalidPasswordException {

		int minPassLength = 5;

		if (pass == null)
			throw new InvalidPasswordException("No password provided");

		assert pass != null; // class invariant

		if (pass.length() < minPassLength) {
			throw new InvalidPasswordException("The password provided is too short");
		}

	}
}

class InvalidPasswordException extends Exception { // change to Exception

	InvalidPasswordException() {
	}

	InvalidPasswordException(String message) {

		super(message);
	}

	InvalidPasswordException(String message, Throwable cause) {

		super(message, cause);
	}
}
