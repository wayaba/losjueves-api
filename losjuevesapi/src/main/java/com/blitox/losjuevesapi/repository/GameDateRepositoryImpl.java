package com.blitox.losjuevesapi.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.blitox.losjuevesapi.model.Player;



public class GameDateRepositoryImpl implements GameDateRepositoryCustom{
	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public List<Player> getGameNumbers() {
		
	 Query query = entityManager.createNativeQuery("select * from player",Player.class);
		
		return query.getResultList();
	}

}