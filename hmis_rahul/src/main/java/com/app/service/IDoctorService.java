package com.app.service;

import java.util.List;
import java.util.Map;

import com.app.model.Doctor;

public interface IDoctorService {
	public List<Doctor> allDoctors();
	public Doctor addDoctor(Doctor doctor);
	public Doctor updateDoctor(Doctor doctor,long did);
	public String deleteDoctor(long id);
	public List<Doctor> searchDoctorByName(String name);
	public Doctor searchDoctorById(long id);

}
