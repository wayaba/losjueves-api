package com.blitox.losjuevesapi.repository;

import java.util.List;

import org.springframework.stereotype.Repository; 
import com.blitox.losjuevesapi.model.GameDateDetail;

@Repository
public interface GameDateRepositoryCustom{

	List<GameDateDetail> getGameDateDetail();
}