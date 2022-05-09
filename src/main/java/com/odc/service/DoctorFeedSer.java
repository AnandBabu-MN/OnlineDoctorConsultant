package com.odc.service;

import java.util.List;
import java.util.Optional;
import com.odc.model.DoctorFeed;


/**
 * 
 * @author Anand
 * @version 09/05/2022
 *
 */

public interface DoctorFeedSer {
	
	/**
	 * getDetails is used to get All doctor details from Server
	 * @return List
	 */
	public List<DoctorFeed> getAllDoctors();
	
	/**
	 * 
	 * @param doctor_id
	 * @return doctor_id
	 */
	public Optional<DoctorFeed> getDoctorsById(int doctor_id);
	
	/**
	 * 
	 * @param a
	 * @return Doctor Object
	 */
	public String putDoctor(DoctorFeed a);
	
	/**
	 * 
	 * @param doctor_id
	 * @return Doctor_id
	 */
	public String delDoctor(int doctor_id);
}
