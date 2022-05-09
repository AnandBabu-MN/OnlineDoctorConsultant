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
@Table(name="Doctor_Feed")
public class DoctorFeed {
	@Id
	private int doctor_id;
	private String doctor_name;
	private String doctor_Specialist;
	private String doctor_exp;
	private String doctor_address;
	private String Gender;
	private String doctor_contact;
	private String doctor_mail_id;
	private String doctor_qualification;
	private String doctor_fees;
	private String doctor_location;
	private String doctor_language;
	private String doctor_prescription;
	private String doctor_timing;
	public int getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}
	public String getDoctor_name() {
		return doctor_name;
	}
	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}
	public String getDoctor_Specialist() {
		return doctor_Specialist;
	}
	public void setDoctor_Specialist(String doctor_Specialist) {
		this.doctor_Specialist = doctor_Specialist;
	}
	public String getDoctor_exp() {
		return doctor_exp;
	}
	public void setDoctor_exp(String doctor_exp) {
		this.doctor_exp = doctor_exp;
	}
	public String getDoctor_address() {
		return doctor_address;
	}
	public void setDoctor_address(String doctor_address) {
		this.doctor_address = doctor_address;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getDoctor_contact() {
		return doctor_contact;
	}
	public void setDoctor_contact(String doctor_contact) {
		this.doctor_contact = doctor_contact;
	}
	public String getDoctor_mail_id() {
		return doctor_mail_id;
	}
	public void setDoctor_mail_id(String doctor_mail_id) {
		this.doctor_mail_id = doctor_mail_id;
	}
	public String getDoctor_qualification() {
		return doctor_qualification;
	}
	public void setDoctor_qualification(String doctor_qualification) {
		this.doctor_qualification = doctor_qualification;
	}
	public String getDoctor_fees() {
		return doctor_fees;
	}
	public void setDoctor_fees(String doctor_fees) {
		this.doctor_fees = doctor_fees;
	}
	public String getDoctor_location() {
		return doctor_location;
	}
	public void setDoctor_location(String doctor_location) {
		this.doctor_location = doctor_location;
	}
	public String getDoctor_language() {
		return doctor_language;
	}
	public void setDoctor_language(String doctor_language) {
		this.doctor_language = doctor_language;
	}
	public String getDoctor_prescription() {
		return doctor_prescription;
	}
	public void setDoctor_prescription(String doctor_prescription) {
		this.doctor_prescription = doctor_prescription;
	}
	public String getDoctor_timing() {
		return doctor_timing;
	}
	public void setDoctor_timing(String doctor_timing) {
		this.doctor_timing = doctor_timing;
	}

}
