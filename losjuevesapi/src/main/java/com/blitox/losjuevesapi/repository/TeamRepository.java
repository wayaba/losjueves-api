package com.blitox.losjuevesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import com.blitox.losjuevesapi.model.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long>{

}