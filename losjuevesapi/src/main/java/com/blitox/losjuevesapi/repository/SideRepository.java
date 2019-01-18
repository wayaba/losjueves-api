package com.blitox.losjuevesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import com.blitox.losjuevesapi.model.Side;

@Repository
public interface SideRepository extends JpaRepository<Side, Long>{

}