package com.goodhealth.md;

public class MedicalRecord {

	private Patient patient;
	private String doctor;
	
	public MedicalRecord(Patient patient, String doctor) {
		this.patient = patient;
		this.doctor = doctor;
	}
	
	public Patient getPatient() {
		return this.patient;
	}
	
	public String getDoctor() {
		return this.doctor;
	}
	
	public int hashCode() {
	    return Objects.hash(patient, doctor);
	}
	
}
