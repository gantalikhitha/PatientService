package com.patient.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.patient.Model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer>{

	Patient findBypatientId(int patientId);

	
	

	

	

	

}
