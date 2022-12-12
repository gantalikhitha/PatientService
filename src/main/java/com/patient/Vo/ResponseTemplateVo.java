package com.patient.Vo;

import com.patient.Model.Patient;

public class ResponseTemplateVo {
	
	
	private Patient patient;
	private Doctor doctor;
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public ResponseTemplateVo(Doctor doctor, Patient patient) {
		super();
		this.doctor = doctor;
		this.patient = patient;
	}
	public ResponseTemplateVo() {
		
	}
	

}
