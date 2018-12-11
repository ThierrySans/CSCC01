package com.goodhealth.patient;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;

public class Patient {
	
	/**
	 * a patient is collection of arbitrary key/value pairs
	 */
    private Map<String, String> data;
    
	/**
	 * however some keys such as the first and last name 
	 * and the health card ID are required fields
	 */
    
	public static final String ID = "HealthCardID";
	public static final String FIRST = "FirstName";
	public static final String LAST = "LastName";

    private static String[] mandatoryFields = new String[]{ID, FIRST, LAST};

	public Patient(Map<String, String> formData) throws MissingFormDataException{
		/**
		 * so first we check whether these these 
		 * mandatory keys are provided 
		 */
		for (String field: mandatoryFields) {
			  if (!formData.containsKey(field)) 
				  throw new MissingFormDataException(field);
		}
		/**
		 * then we add them all to the patient's data
		 */
		for (Entry<String, String> entry : formData.entrySet()){
		    this.data.put(entry.getKey(), entry.getValue());
		}
	}
	
	public String getHealthCardID() {
		return data.get(ID);
	}
	
	@Override
	public String toString() {
		return Arrays.toString(this.data.entrySet().toArray());
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(this.data.get(ID));
	}

};
