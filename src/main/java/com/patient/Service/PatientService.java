package com.patient.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.patient.Model.Patient;
import com.patient.Repository.PatientRepository;
import com.patient.Vo.Doctor;
import com.patient.Vo.ResponseTemplateVo;

@Service
public class PatientService {

	@Autowired
	private PatientRepository patientRepository;

	@Autowired
	private RestTemplate restTemplate;

	public Patient save(Patient patient) {

		return patientRepository.save(patient);
	}

	public ResponseTemplateVo getPatientWithDoctor(int patientId) {
		ResponseTemplateVo vo = new ResponseTemplateVo();
		Patient patient = patientRepository.findById(patientId).get();
		Doctor doctor = restTemplate.getForObject("http://doctor-service/doctors/" + patient.getDoctorId(),
				Doctor.class);
		vo.setDoctor(doctor);
		vo.setPatient(patient);
		return vo;

	}

	public List<Patient> getAllPatients() {

		return patientRepository.findAll();
	}

}
