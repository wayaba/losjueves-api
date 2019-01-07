package com.blitox.losjuevesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import com.blitox.losjuevesapi.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>{

}