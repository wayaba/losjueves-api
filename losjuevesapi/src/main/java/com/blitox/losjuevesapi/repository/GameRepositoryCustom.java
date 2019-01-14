package com.blitox.losjuevesapi.repository;

import java.util.List;
 
import org.springframework.stereotype.Repository;

import com.blitox.losjuevesapi.model.TableView;

@Repository
public interface GameRepositoryCustom{

	List<TableView> getGameTable();
	List<TableView> getGameTableByNumber(int number);
}