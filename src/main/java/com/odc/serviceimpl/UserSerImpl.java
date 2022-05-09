package com.odc.serviceimpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.odc.model.UserModel;
import com.odc.repositary.UserRepo;
import com.odc.service.UserSer;


/**
 * 
 * @author Anand
 * @version 09/05/2022
 *
 */

@Component
public class UserSerImpl implements UserSer{
	@Autowired
	UserRepo user;
	@Override
	public List<UserModel> getAllUsers() {
		List<UserModel> getList = user.findAll();
		return getList;
	}

	@Override
	public Optional<UserModel> getUserById(int a) {
		Optional<UserModel> users = user.findById(a);
		return users;
	}

	@Override
	public String putUsers(UserModel a) {
		user.save(a);
		return "Data Putted Successfully";
	}

	@Override
	public String delUser(int admin_id) {
		user.deleteById(admin_id);
		return "Deleted";
	}

}
