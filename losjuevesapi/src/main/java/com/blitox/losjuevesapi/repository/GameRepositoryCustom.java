package com.blitox.losjuevesapi.repository;

import java.util.List;
 
import org.springframework.stereotype.Repository;

import com.blitox.losjuevesapi.model.CurrentTable;

@Repository
public interface GameRepositoryCustom{

	List<CurrentTable> getCurrentTable();
}