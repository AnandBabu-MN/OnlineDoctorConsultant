package com.odc.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.odc.model.DoctorFeed;


/**
 * 
 * @author Anand
 * @version 09/05/2022
 *
 */

@Repository
public interface DoctorFeedRepo extends JpaRepository<DoctorFeed, Integer> {

}
