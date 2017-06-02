package com.example.peopleloader.argumentparser.filterexpressionparser.exception;

public class InvalidSimpleFilterException extends InvalidFilterException {

	private static final long serialVersionUID = 1L;

	public InvalidSimpleFilterException(Exception e) {
		super(e);
	}

	public InvalidSimpleFilterException(String msg) {
		super(msg);
	}

}
