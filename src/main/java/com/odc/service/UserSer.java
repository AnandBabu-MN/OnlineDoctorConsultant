package com.odc.service;

import java.util.List;
import java.util.Optional;
import com.odc.model.UserModel;


/**
 * 
 * @author Anand
 * @version 09/05/2022
 *
 */

public interface UserSer {
	
	/**
	 * getAllUsers is used to get all details of the user from the server
	 * @return
	 */
	public abstract List<UserModel> getAllUsers();
	
	/**
	 * 
	 * @param a
	 * @return
	 */
	public Optional<UserModel> getUserById(int a);
	
	/**
	 * 
	 * @param a
	 * @return UserModel Object
	 */
	public String putUsers(UserModel a);
	
	/**
	 * 
	 * @param admin_id
	 * @return Admin_ID
	 */
	public String delUser(int admin_id);
}
