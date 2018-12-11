package com.goodhealth.patient;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.HashMap;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.goodhealth.patient.MissingFormDataException;
import com.goodhealth.patient.Patient;

public class PatientTest{
    
	@SuppressWarnings("serial")
	public static final HashMap<String, String> alice = new HashMap<String, String>(){{
	     put(Patient.ID, "7644");
	     put(Patient.FIRST, "Alice");
	}};
	
	@SuppressWarnings("serial")
	public static final HashMap<String, String> bob = new HashMap<String, String>(){{
	     put(Patient.ID, "4521");
	     put(Patient.FIRST, "Bob");
	     put(Patient.LAST, "Bobson");
	     put("Age", "28");
	     put("Address", "Toronto");
	}};
	
	@Test
	@DisplayName("incomplete patient form")
	void testIncompletePatientForm() {
		assertThrows(MissingFormDataException.class, ()->{
			new Patient(alice);
		});
	}
	
	@Test
	@DisplayName("complete patient form")
	void testCompletePatientForm() throws MissingFormDataException {
		HashMap<String, String> aliceClone = new HashMap<String, String>(alice);
		aliceClone.put(Patient.LAST, "Alicson");
		Patient p = new Patient(aliceClone);
		assertEquals(p.getHealthCardID(), aliceClone.get(Patient.ID));
	}
	
	@Test
	@DisplayName("extra patient form")
	void testExtraPatientForm() throws MissingFormDataException {
		Patient p = new Patient(bob);
		assertEquals(p.getHealthCardID(), bob.get(Patient.ID));
	}
	
}
