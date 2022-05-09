package com.odc.service;

import java.util.List;
import java.util.Optional;
import com.odc.model.AdminModel;


/**
 * 
 * @author Anand
 * @version 09/05/2022
 *
 */

public interface AdminSer {
	
	/**
	 * getAllDetails is used to get all Admins from server
	 * @return List
	 */
	public abstract List<AdminModel> getAllDetails();
	
	/**
	 * 
	 * @param admin_id
	 * @return Admin_id
	 */
	public Optional<AdminModel> getDetailsById(int admin_id);
	
	/**
	 * 
	 * @param a
	 * @return Admin Object
	 */
	public String putData(AdminModel a);
	
	/**
	 * 
	 * @param admin_id
	 * @return Admin id
	 */
	public String delData(int admin_id);
}
