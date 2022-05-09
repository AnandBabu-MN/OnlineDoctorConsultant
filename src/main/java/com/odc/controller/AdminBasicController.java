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
import com.odc.model.AdminModel;
import com.odc.serviceimpl.AdminSerImpl;


/**
 * 
 * @author Anand
 * @version 09/05/2022
 *
 */

@RestController
public class AdminBasicController {
	@Autowired
	AdminSerImpl adminimpl;
	
	/**
	 * getAllDetails is used to get all Admins from server
	 * @return List
	 */
	@GetMapping("/getData")
	public List<AdminModel> getDetails(){
		return adminimpl.getAllDetails();
	}
	
	/**
	 * 
	 * @param admin_id
	 * @return Admin_id
	 */
	@PostMapping("/postData")
	public Optional<AdminModel> postDetails(@RequestParam  ("id") int a) {
		return adminimpl.getDetailsById(a);
	}
	
	/**
	 * 
	 * @param a
	 * @return Admin Object
	 */
	@PutMapping("/putData")
	public String putDetails(@RequestBody  AdminModel admin) {
		return adminimpl.putData(admin);
	}
	
	/**
	 * 
	 * @param admin_id
	 * @return Admin id
	 */
	@DeleteMapping("/delData/{admin_id}")
	public String delDetails(@PathVariable ("admin_id")int admin_id) {
		return adminimpl.delData(admin_id);
	}

}


