package com.goodhealth.md;

public class MedicalRecordApi {
	
	/**
	 * Creates a medical record and adds it to the existing collection of medical records. 
	 * @param patient - the patient information
	 * @param doctor - the doctor assigned to that patient
	 * @return the medical record that was created and added to the collection
	 */
	public static MedicalRecord createMedicalRecord(Patient patient, String doctor) {

	}
	
	/**
	 * Retrieves a medical record from the existing collection of medical records
	 * @param healthCardID - the patient health card ID
	 * @return the medical record corresponding to the health card ID given as argument
	 * @throws PatientNotFoundException
	 */
	public static MedicalRecord getMedicalRecord(String healthCardID) throws PatientNotFoundException {
        
	}

}
