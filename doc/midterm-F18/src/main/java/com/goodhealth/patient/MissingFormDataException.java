package com.goodhealth.patient;

@SuppressWarnings("serial")
public class MissingFormDataException extends Exception {

	public MissingFormDataException(String field) {
		super("Missing form field " + field);
	}
	
}
