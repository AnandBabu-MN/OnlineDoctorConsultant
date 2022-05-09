package com.odc.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odc.model.AdminModel;


/**
 * 
 * @author Anand
 * @version 09/05/2022
 *
 */

public interface AdminRepo extends JpaRepository<AdminModel, Integer> {

}
