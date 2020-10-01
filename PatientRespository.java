package com.sw409.Patient.controllers.Respositories;


import org.springframework.data.repository.CrudRepository;

import com.sw409.Patient.Patient;


public interface PatientRespository extends CrudRepository<Patient, Integer>{

}

