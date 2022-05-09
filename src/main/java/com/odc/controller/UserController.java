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
import com.odc.model.UserModel;
import com.odc.serviceimpl.UserSerImpl;


/**
 * 
 * @author Anand
 * @version 09/05/2022
 *
 */

@RestController
public class UserController {
	@Autowired
	UserSerImpl userimpl;

	/**
	 * getDetails is used to get all users from the server
	 * @return List
	 */
	@GetMapping("/getUser")
	public List<UserModel> getDetails(){
		return userimpl.getAllUsers();
	}
	
	/**
	 * 
	 * @param a
	 * @return ID
	 */
	@PostMapping("/postUser")
	public Optional<UserModel> postDetails(@RequestParam ("id") int a) {
		return userimpl.getUserById(a);
	}
	
	/**
	 * 
	 * @RequestBody user
	 * @return User Object
	 */
	@PutMapping("/putUser")
	public String putDetails(@RequestBody  UserModel user) {
		return userimpl.putUsers(user);
	}
	
	/**
	 * 
	 * @param user_id
	 * @return
	 */
	@DeleteMapping("/delUser/{user_id}")
	public String delDetails(@PathVariable ("user_id")int user_id) {
		return userimpl.delUser(user_id);
	}

}
