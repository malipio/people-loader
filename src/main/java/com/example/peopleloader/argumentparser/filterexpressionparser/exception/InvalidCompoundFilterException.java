package com.example.peopleloader.argumentparser.filterexpressionparser.exception;

public class InvalidCompoundFilterException extends InvalidFilterException {

	private static final long serialVersionUID = 1L;

	public InvalidCompoundFilterException(Exception e) {
		super(e);
	}

	public InvalidCompoundFilterException(String msg) {
		super(msg);
	}

}
