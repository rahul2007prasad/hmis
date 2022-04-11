package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.DoctorDao;
import com.app.model.Doctor;

@Service
@Transactional
public class DoctorImplService implements IDoctorService {

	@Autowired
	DoctorDao doctorDao;
	@Override
	public List<Doctor> allDoctors() {
		return doctorDao.findAll();
	}

	@Override
	public Doctor addDoctor(Doctor doctor) {
		return doctorDao.save(doctor);
	}

	@Override
	public Doctor updateDoctor(Doctor doctor,long did) {
		doctor.setId(did);
		return doctorDao.save(doctor);
	}

	@Override
	public String deleteDoctor(long did) {
		doctorDao.deleteById(did);
		return "Doctor is deleted with id "+ did + "succesfully";
	}

	@Override
	public List<Doctor> searchDoctorByName(String name) {
		return doctorDao.findByName(name);
	}

	@Override
	public Doctor searchDoctorById(long did) {
		return doctorDao.findById(did).get();
	}

}
