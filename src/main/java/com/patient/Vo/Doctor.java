package com.patient.Vo;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

public class Doctor {
	
	private int doctorId;
	private String doctorname;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JsonManagedReference
	private DoctorShifts shift;

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorname() {
		return doctorname;
	}

	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}

	
	public DoctorShifts getShift() {
		return shift;
	}

	public void setShift(DoctorShifts shift) {
		this.shift = shift;
	}
	
	
	
	
}
