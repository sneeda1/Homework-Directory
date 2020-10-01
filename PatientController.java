package com.sw409.Patient.controllers;
import org.springframework.web.bind.annotation.RestController;

import com.sw409.Patient.Patient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import com.sw409.Patient.services.PatientService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
@RestController
public class PatientController {
 @Autowired
PatientService ptaService;
//create
@PostMapping("api/v1/patients")
public Patient createPatient(@RequestBody Patient patient) {
	return ptaService.createPatient(patient);
}
//Read
@GetMapping("api/v1/patients")
public List<Patient> findAllPatients()
{
	return ptaService.findAllPatients();
	
}
//Update
@PutMapping("api/v1/patient/{patientid}")
public void updatePatient(@PathVariable("patientid")Integer id, @RequestBody Patient patient)
{
	ptaService.updatePatient(id, patient);
}
//Delete
@DeleteMapping("api/v1/patients/{patientid}")
public void deletePatient(@PathVariable("patientid")Integer id, @RequestBody Patient patient)
{
	ptaService.deleteStudent(id,patient);
}
}