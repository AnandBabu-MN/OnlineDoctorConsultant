package com.odc.serviceimpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.odc.model.AdminModel;
import com.odc.repositary.AdminRepo;
import com.odc.service.AdminSer;


/**
 * 
 * @author Anand
 * @version 09/05/2022
 *
 */

@Component
public class AdminSerImpl implements AdminSer{
	@Autowired
	AdminRepo adminrepo;
	@Override
	public List<AdminModel> getAllDetails() {
		List<AdminModel> getList = adminrepo.findAll();
		return getList;
	}
	@Override
	public Optional<AdminModel> getDetailsById(int a) {
		Optional<AdminModel> admin = adminrepo.findById(a);
		return admin;
	}
	@Override
	public String putData(AdminModel a) {
		adminrepo.save(a);
		return "Data Putted Successfully";
	}
	@Override
	public String delData(int admin_id) {
		adminrepo.deleteById(admin_id);
		return "Deleted";
	}

}
