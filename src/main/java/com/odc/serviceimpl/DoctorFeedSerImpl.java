package com.odc.serviceimpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.odc.model.DoctorFeed;
import com.odc.repositary.DoctorFeedRepo;
import com.odc.service.DoctorFeedSer;


/**
 * 
 * @author Anand
 * @version 09/05/2022
 *
 */

@Component
public class DoctorFeedSerImpl implements DoctorFeedSer{
	@Autowired
	DoctorFeedRepo doctorrepo;

	@Override
	public List<DoctorFeed> getAllDoctors() {
		return doctorrepo.findAll();
	}

	@Override
	public Optional<DoctorFeed> getDoctorsById(int doctor_id) {
		Optional<DoctorFeed> doctor = doctorrepo.findById(doctor_id);
		return doctor;
	}

	@Override
	public String putDoctor(DoctorFeed a) {
		doctorrepo.save(a);
		return "Data Putted Successfully";
	}

	@Override
	public String delDoctor(int doctor_id) {
		doctorrepo.deleteById(doctor_id);
		return "Deleted";
	}

}
