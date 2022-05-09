package com.odc.service;

import java.util.List;
import java.util.Optional;
import com.odc.model.TimeModel;


/**
 * 
 * @author Anand
 * @version 09/05/2022
 *
 */

public interface TimeSer {
	
	/**
	 * getAllTimes is used to get Time avaliability from the server
	 * @return List
	 */
	public abstract List<TimeModel> getAllTimes();
	
	/**
	 * 
	 * @param a
	 * @return ID
	 */
	public Optional<TimeModel> getTimeById(int a);
	
	/**
	 * 
	 * @param a
	 * @return Time Object
	 */
	public String putTime(TimeModel a);
	
	/**
	 * 
	 * @param time_id
	 * @return Time_ID
	 */
	public String delTime(int time_id);
}
