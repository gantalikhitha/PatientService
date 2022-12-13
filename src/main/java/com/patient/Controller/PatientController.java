package com.patient.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patient.Model.Patient;
import com.patient.Service.PatientService;
import com.patient.Vo.ResponseTemplateVo;

@RestController
@RequestMapping("/patient")
public class PatientController {
	@Autowired
	private PatientService patientService;
	
	
	private Logger log = LoggerFactory.getLogger(Patient.class);
	
	@PostMapping("/")
	public Patient savePatient(@RequestBody Patient patient) {
		System.out.println("save the patient details");
		return patientService.save(patient);
	}
	
	@GetMapping("/{patientId}")
	public ResponseTemplateVo getPatientWithDoctor(@PathVariable int patientId) {
		return patientService.getPatientWithDoctor(patientId);
		
	}
	
	@GetMapping("/getallpatients")
	public List<Patient>getAllPatients(){
	    log.info("get log from doctor");
		log.info("done ");
	   return patientService.getAllPatients();
	    
	}
		
}
