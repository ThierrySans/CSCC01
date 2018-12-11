package com.goodhealth.md;

import java.util.ArrayList;
import java.util.List;

import com.goodhealth.patient.Patient;

public class MedicalRecordApi {

	private static List<MedicalRecord> mds = new ArrayList<MedicalRecord>();
		
	public static void reset() {
		mds = new ArrayList<MedicalRecord>();
	}
	
	/**
	 * Creates a medical record and adds it to the existing collection of medical records. 
	 * @param patient - the patient information
	 * @param doctor - the doctor assigned to that patient
	 * @return the medical record that was created and added to the collection
	 */
	public static MedicalRecord createMedicalRecord(Patient patient, String doctor) {
		MedicalRecord md = new MedicalRecord(patient, doctor);
		mds.add(md);
		return md;
	}
	
	/**
	 * Retrieves a medical record from the existing collection of medical records
	 * @param healthCardID - the patient health card ID
	 * @return the medical record corresponding to the health card ID given as argument
	 * @throws PatientNotFoundException
	 */
	public static MedicalRecord getMedicalRecord(String healthCardID) throws PatientNotFoundException {
		for (MedicalRecord md: mds) {
			  if (md.getPatient().getHealthCardID() == healthCardID) return md;
		}
		throw new PatientNotFoundException(healthCardID);
	}

}
