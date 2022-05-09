package com.odc.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.odc.model.DoctorFeed;
import com.odc.serviceimpl.DoctorFeedSerImpl;


/**
 * 
 * @author Anand
 * @version 09/05/2022
 *
 */

@RestController
public class DoctorFeedController {
	@Autowired
	DoctorFeedSerImpl doctorimpl;

	/**
	 * getDetails is used to get All doctor details from Server
	 * @return List
	 */
	@GetMapping("/getDoctors")
	public List<DoctorFeed> getDetails(){
		return doctorimpl.getAllDoctors();
	}
	
	/**
	 * 
	 * @param doctor_id
	 * @return
	 */
	@PostMapping("/postDoctors")
	public Optional<DoctorFeed> postDetails(@RequestParam("id") int doctor_id) {
		return doctorimpl.getDoctorsById(doctor_id);
	}
	
	/**
	 * 
	 * @param doctor
	 * @return Doctor Object
	 */
	@PutMapping("/putDoctors")
	public String putDetails(@RequestBody  DoctorFeed doctor) {
		return doctorimpl.putDoctor(doctor);
	}
	
	/**
	 * 
	 * @param doctor_id
	 * @return Doctor_id
	 */
	@DeleteMapping("/delDoctors/{doctor_id}")
	public String delDetails(@PathVariable ("doctor_id")int doctor_id) {
		return doctorimpl.delDoctor(doctor_id);
	}
}
