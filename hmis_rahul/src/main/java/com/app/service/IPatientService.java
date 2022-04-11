package com.app.service;

import java.util.List;
import java.util.Map;

import com.app.model.Patient;

public interface IPatientService {

	public List<Patient> allPatients();
	
	public Patient addPatient(Patient patient);
	
	public Patient updatePatient(Patient patient,long pid);
	
	public String deletepatient(long id);
	
	public List<Patient> searchPatientByName(String name);
	
	public Patient searchPatientById(long id);
	
	
	
	
}
