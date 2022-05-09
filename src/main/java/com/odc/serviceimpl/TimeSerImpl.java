package com.odc.serviceimpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.odc.model.TimeModel;
import com.odc.repositary.TimeRepo;
import com.odc.service.TimeSer;


/**
 * 
 * @author Anand
 * @version 09/05/2022
 *
 */

@Component
public class TimeSerImpl implements TimeSer{
	@Autowired
	TimeRepo time;
	@Override
	public List<TimeModel> getAllTimes() {
		List<TimeModel> getList = time.findAll();
		return getList;
	}

	@Override
	public Optional<TimeModel> getTimeById(int a) {
		Optional<TimeModel> times = time.findById(a);
		return times;
	}
	@Override
	public String putTime(TimeModel a) {
		time.save(a);
		return "Data Putted Successfully";
	}

	@Override
	public String delTime(int time_id) {
		time.deleteById(time_id);
		return "Deleted";
	}

}
