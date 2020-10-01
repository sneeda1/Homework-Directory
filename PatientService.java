package com.sw409.Patient.services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw409.Patient.Patient;
import com.sw409.Patient.controllers.Respositories.PatientRespository;
@Service

public class PatientService {
List<Patient> patientList = new ArrayList<>();
@Autowired
PatientRespository patientRepository;
//create

public Patient createPatient(Patient patient) {
	patientList.add(patient);
	return patient;
}

//read
public List<Patient>findAllPatients(){
	return (List<Patient>) (patientRepository.findAll());
}

//update
public void updatePatient(Integer id, Patient p){
	for(int i = 0; i <patientList.size(); i++) {
		if(patientList.get(i).getId().equals(id)){
			patientList.set(i, p);
		}
	}
}

//Delete
public void deleteStudent(Integer id, Patient patient) {


}

}


