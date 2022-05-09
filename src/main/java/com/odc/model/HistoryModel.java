package com.odc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 
 * @author Anand
 * @version 09/05/2022
 *
 */

@Entity
@Table(name="History")
public class HistoryModel {
	@Id
	private int history_id;
	private int patient_id;
	private int doctor_id; 
	private String patient_name;
	private String doctor_name;
	private String patient_problem;
	private String doctor_specialist;
	private String medical_history;
	private String patient_address;
	private String Gender;
	public int getHistory_id() {
		return history_id;
	}
	public void setHistory_id(int history_id) {
		this.history_id = history_id;
	}
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public int getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public String getDoctor_name() {
		return doctor_name;
	}
	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}
	public String getPatient_problem() {
		return patient_problem;
	}
	public void setPatient_problem(String patient_problem) {
		this.patient_problem = patient_problem;
	}
	public String getDoctor_specialist() {
		return doctor_specialist;
	}
	public void setDoctor_specialist(String doctor_specialist) {
		this.doctor_specialist = doctor_specialist;
	}
	public String getMedical_history() {
		return medical_history;
	}
	public void setMedical_history(String medical_history) {
		this.medical_history = medical_history;
	}
	public String getPatient_address() {
		return patient_address;
	}
	public void setPatient_address(String patient_address) {
		this.patient_address = patient_address;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
}
