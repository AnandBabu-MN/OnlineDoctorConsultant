package com.odc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 
 * @author Anand
 * @version 09/05/2022
 *
 */

@Entity
@Table(name="Admin_Information")
public class AdminModel {
	@Id
	@GeneratedValue
	private int admin_id;
	private String admin_name; 
	private String admin_password;
	private String mail_id;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "admin_fk" )
	public String getAdmin_password() {
		return admin_password;
	}
	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getMail_id() {
		return mail_id;
	}
	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}

	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
}
