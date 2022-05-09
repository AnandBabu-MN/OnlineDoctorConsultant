package com.odc.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import com.odc.model.UserModel;


/**
 * 
 * @author Anand
 * @version 09/05/2022
 *
 */

public interface UserRepo extends JpaRepository<UserModel, Integer> {

}
