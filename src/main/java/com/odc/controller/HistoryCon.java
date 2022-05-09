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
import com.odc.model.HistoryModel;
import com.odc.serviceimpl.HistorySerImpl;


/**
 * 
 * @author Anand
 * @version 09/05/2022
 *
 */

@RestController
public class HistoryCon {
	@Autowired
	HistorySerImpl hisimpl;

	/**
	 * getDetails is used to get all History from server
	 * @return
	 */
	@GetMapping("/getHistory")
	public List<HistoryModel> getDetails(){
		return hisimpl.getAllHistory();
	}
	
	/**
	 * 
	 * @param a
	 * @return ID
	 */
	@PostMapping("/postHistory")
	public Optional<HistoryModel> postDetails(@RequestParam ("id") int a) {
		return hisimpl.postHistory(a);
	}
	
	/**
	 * 
	 * @param doctor
	 * @return Doctor object
	 */
	@PutMapping("/putHistory")
	public String putDetails(@RequestBody  HistoryModel doctor) {
		return hisimpl.putHistory(doctor);
	}
	
	/**
	 * 
	 * @param patient_id
	 * @return patient_id
	 */
	@DeleteMapping("/delHistory/{patient_id}")
	public String delDetails(@PathVariable ("patient_id")int patient_id) {
		return hisimpl.delHistory(patient_id);
	}
}
