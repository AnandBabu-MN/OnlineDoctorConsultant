package com.odc.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import com.odc.model.HistoryModel;


/**
 * 
 * @author Anand
 * @version 09/05/2022
 *
 */

public interface HistoryRepo extends JpaRepository<HistoryModel, Integer>{

}
