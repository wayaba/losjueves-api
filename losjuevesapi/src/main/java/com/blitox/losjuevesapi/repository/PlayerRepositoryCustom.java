package com.blitox.losjuevesapi.repository;

import java.util.List;
 
import org.springframework.stereotype.Repository;

import com.blitox.losjuevesapi.model.PlayerDetail;

@Repository
public interface PlayerRepositoryCustom{

	List<PlayerDetail> getPlayerDetail(long id);
	List<PlayerDetail> getPlayerDetailByGameDate(long id, int number);
}