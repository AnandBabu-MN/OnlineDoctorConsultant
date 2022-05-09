package com.odc.service;

import java.util.List;
import java.util.Optional;
import com.odc.model.HistoryModel;


/**
 * 
 * @author Anand
 * @version 09/05/2022
 *
 */

public interface HistorySer {
	
	/**
	 *getDetails is used to get all History from server 
	 * @return List
	 */
	public List<HistoryModel> getAllHistory();
	
	/**
	 * 
	 * @param a
	 * @return History Object
	 */
	public Optional<HistoryModel> postHistory(int a);
	
	/**
	 * 
	 * @param a
	 * @return History Object
	 */
	public String putHistory(HistoryModel a);
	
	/**
	 * 
	 * @param patient_id
	 * @return Patient_ID
	 */
	public String delHistory(int patient_id);
}
