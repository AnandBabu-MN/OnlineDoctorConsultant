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
import com.odc.model.TimeModel; 
import com.odc.serviceimpl.TimeSerImpl;


/**
 * 
 * @author Anand
 * @version 09/05/2022
 *
 */

@RestController
public class TimeController {
	@Autowired
	TimeSerImpl  timeimpl;

	/**
	 * getDetails is used to get all Time from the server
	 * @return
	 */
	@GetMapping("/getTime")
	public List<TimeModel> getDetails(){
		return timeimpl.getAllTimes();
	}
	
	/**
	 * 
	 * @param a
	 * @return ID
	 */
	@PostMapping("/postTime")
	public Optional<TimeModel> postDetails(@RequestParam ("id") int a) {
		return timeimpl.getTimeById(a);
	}
	
	/**
	 * 
	 * @param time
	 * @return Time Object
	 */
	@PutMapping("/putTime")
	public String putDetails(@RequestBody  TimeModel time) {
		return timeimpl.putTime(time);
	}
	
	/**
	 * 
	 * @param time_id
	 * @return Time_ID
	 */
	@DeleteMapping("/delTime/{time_id}")
	public String delDetails(@PathVariable ("time_id")int time_id) {
		return timeimpl.delTime(time_id);
	}

}
