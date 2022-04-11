package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Doctor;
import com.app.service.IDoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

	
	@Autowired
	IDoctorService doctorService;
	
	@PostMapping("/add")
	public ResponseEntity<?> registerDoctor(@RequestBody  Doctor doctor){
		System.out.println("In register new Doctor");
		
		return new ResponseEntity<>(doctorService.addDoctor(doctor),HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{did}")
	public ResponseEntity<?> updateDoctorDetails(@RequestBody Doctor doctor, @PathVariable long did){
		System.out.println("In update doctor details");
		return new ResponseEntity<>(doctorService.updateDoctor(doctor,did),HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/details/{did}")
	public ResponseEntity<?> getpatientDetails(@PathVariable  long did){
		System.out.println("In doctor details by Id");
		return new ResponseEntity<>(doctorService.searchDoctorById(did),HttpStatus.OK);
	}
	
	@GetMapping("/detailsByName/{dname}")
	public ResponseEntity<?> getPatientDetailsByName(@PathVariable String dname){
		System.out.println("In patient details by name");
		return new ResponseEntity<>(doctorService.searchDoctorByName(dname),HttpStatus.OK);
	}
	
	@GetMapping("/alldoctors")
	public ResponseEntity<?> getAllPatientList(){
		System.out.println("In get all doctor list");
		return new ResponseEntity<>(doctorService.allDoctors(),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{did}")
	public ResponseEntity<?> deletePatientById(@PathVariable long did){
		System.out.println("In delete doctor by Id");
		return new ResponseEntity<>(doctorService.deleteDoctor(did),HttpStatus.OK);
		
	}

	
}
