package com.blitox.losjuevesapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import com.blitox.losjuevesapi.model.GameDate;
import com.blitox.losjuevesapi.model.Player;

@Repository
public interface GameDateRepositoryCustom{

	List<Player> getGameNumbers();
}