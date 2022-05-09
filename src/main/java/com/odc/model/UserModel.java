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
@Table(name="Userinfo")
public class UserModel {
	@Id
	private int user_id;
	private String  user_name;
	private String user_address;
	private String user_mail_id;
	private String user_contact;
	private String user_gender;
	private String user_problem;
	private String user_location;
	private String user_medical_histroy;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public String getUser_mail_id() {
		return user_mail_id;
	}
	public void setUser_mail_id(String user_mail_id) {
		this.user_mail_id = user_mail_id;
	}
	public String getUser_contact() {
		return user_contact;
	}
	public void setUser_contact(String user_contact) {
		this.user_contact = user_contact;
	}
	public String getUser_gender() {
		return user_gender;
	}
	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}
	public String getUser_problem() {
		return user_problem;
	}
	public void setUser_problem(String user_problem) {
		this.user_problem = user_problem;
	}
	public String getUser_location() {
		return user_location;
	}
	public void setUser_location(String user_location) {
		this.user_location = user_location;
	}
	public String getUser_medical_histroy() {
		return user_medical_histroy;
	}
	public void setUser_medical_histroy(String user_medical_histroy) {
		this.user_medical_histroy = user_medical_histroy;
	}
	public String getUser_feedback() {
		return user_feedback;
	}
	public void setUser_feedback(String user_feedback) {
		this.user_feedback = user_feedback;
	}
	private String user_feedback;
}
