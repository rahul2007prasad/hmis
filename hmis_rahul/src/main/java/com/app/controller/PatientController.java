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

import com.app.model.Patient;
import com.app.service.IPatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	IPatientService patientService;
	
	@PostMapping("/add")
	public ResponseEntity<?> registerPatient(@RequestBody  Patient patient){
		System.out.println("In register new Ptient");
		
		return new ResponseEntity<>(patientService.addPatient(patient),HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{pid}")
	public ResponseEntity<?> updatePatientDetails(@RequestBody Patient patient, @PathVariable long pid){
		System.out.println("In update patient details");
		return new ResponseEntity<>(patientService.updatePatient(patient,pid),HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/details/{pid}")
	public ResponseEntity<?> getpatientDetails(@PathVariable  long pid){
		System.out.println("In patient details by Id");
		return new ResponseEntity<>(patientService.searchPatientById(pid),HttpStatus.OK);
	}
	
	@GetMapping("/detailsByName/{pname}")
	public ResponseEntity<?> getPatientDetailsByName(@PathVariable String pname){
		System.out.println("In patient details by name");
		return new ResponseEntity<>(patientService.searchPatientByName(pname),HttpStatus.OK);
	}
	
	@GetMapping("/allpatient")
	public ResponseEntity<?> getAllPatientList(){
		System.out.println("In get all patient list");
		return new ResponseEntity<>(patientService.allPatients(),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{pid}")
	public ResponseEntity<?> deletePatientById(@PathVariable long pid){
		System.out.println("In delete patient by Id");
		return new ResponseEntity<>(patientService.deletepatient(pid),HttpStatus.OK);
		
	}
	
}
