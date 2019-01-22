package com.blitox.losjuevesapi.repository;

import java.util.List;

import org.springframework.stereotype.Repository; 
import com.blitox.losjuevesapi.model.GameDateDetail;
import com.blitox.losjuevesapi.model.GameDate;

@Repository
public interface GameDateRepositoryCustom{

	//List<GameDateDetail> getGameDateDetail();
	GameDate getLastGameDate();
	List<GameDateDetail> getPlayersByWeek(int week);
}