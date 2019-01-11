package com.blitox.losjuevesapi.repository;

import java.util.List;
 
import org.springframework.stereotype.Repository;

import com.blitox.losjuevesapi.model.Table;

@Repository
public interface GameRepositoryCustom{

	List<Table> getGameTable();
	List<Table> getGameTableByNumber(int number);
}