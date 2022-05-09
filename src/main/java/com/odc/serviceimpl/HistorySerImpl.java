package com.odc.serviceimpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.odc.model.HistoryModel;
import com.odc.repositary.HistoryRepo;
import com.odc.service.HistorySer;


/**
 * 
 * @author Anand
 * @version 09/05/2022
 *
 */

@Component
public class HistorySerImpl implements HistorySer {
	@Autowired
	HistoryRepo hisrepo;
	@Override
	public List<HistoryModel> getAllHistory() {
		return hisrepo.findAll();
	}

	@Override
	public Optional<HistoryModel> postHistory(int a) {
		Optional<HistoryModel> history = hisrepo.findById(a);
		return history;
	}
	@Override
	public String putHistory(HistoryModel a) {
		hisrepo.save(a);
		return "Data Putted Successfully";
	}

	@Override
	public String delHistory(int patient_id) {
		hisrepo.deleteById(patient_id);
		return "Deleted";
	}


}
