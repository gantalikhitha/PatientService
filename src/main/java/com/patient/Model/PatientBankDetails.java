package com.patient.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="bank")
public class PatientBankDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	private String bname;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JsonBackReference
	private Patient patient;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public PatientBankDetails(int bid, String bname, Patient patient) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.patient = patient;
	}

	public PatientBankDetails() {
		super();
		
	}

	@Override
	public String toString() {
		return "PatientBankDetails [bid=" + bid + ", bname=" + bname + ", patient=" + patient + "]";
	}
	

}
