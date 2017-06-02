package com.example.peopleloader.exception;

public class InvalidProgramArgumentsException extends RuntimeException {

	public InvalidProgramArgumentsException(Exception e) {
		super(e);
	}

	public InvalidProgramArgumentsException(String msg) {
		super(msg);
	}

	private static final long serialVersionUID = 1L;

}
