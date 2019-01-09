package com.blitox.losjuevesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import com.blitox.losjuevesapi.model.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{

}