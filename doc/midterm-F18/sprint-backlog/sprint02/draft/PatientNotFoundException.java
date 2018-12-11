package com.goodhealth.md;

@SuppressWarnings("serial")
public class PatientNotFoundException extends Exception {
	
	public PatientNotFoundException(String healthCardID) {
		super("Patient with health card id " + healthCardID + " not found");
	}
}
