package com.app.service;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.PatientDao;
import com.app.model.Patient;

@Service
@Transactional
public class PatientImplService implements IPatientService {

	@Autowired
	PatientDao patientDao;
	
	@Override
	public List<Patient> allPatients() {
		return patientDao.findAll();
		
	}

	@Override
	public Patient addPatient(Patient patient) {
		return patientDao.save(patient);
		
	}

	@Override
	public Patient updatePatient(Patient patient,long pid) {
		//patient.setName(patientDao.findByName(null));
		patient.setId(pid);
		return patientDao.save(patient);
		
	}

	@Override
	public String deletepatient(long id) {
		patientDao.deleteById(id);
		return "deleted patient with ID " + id +" successfully";
		
	}

	@Override
	public List<Patient> searchPatientByName(String name) {
		return patientDao.findByName(name);
		
	}

	@Override
	public Patient searchPatientById(long id) {
		
		return patientDao.findById(id).get();
	}

	
}
