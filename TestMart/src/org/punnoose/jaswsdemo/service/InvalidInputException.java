package org.punnoose.jaswsdemo.service;

public class InvalidInputException extends Exception {

	private static final long serialVersionUID = 621024032351107358L;
	
	private String errorDetails;

	public InvalidInputException(String reason, String errorDetails) {
		super(reason, new Exception(reason));
		this.errorDetails = errorDetails;
	}
	
	public String getFaultInfo(){
		return errorDetails;
	}
}