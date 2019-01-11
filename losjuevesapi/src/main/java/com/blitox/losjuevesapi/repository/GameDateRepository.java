package com.blitox.losjuevesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import com.blitox.losjuevesapi.model.GameDate;

@Repository
public interface GameDateRepository extends JpaRepository<GameDate, Long>,GameDateRepositoryCustom{

}