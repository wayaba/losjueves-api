package com.blitox.losjuevesapi.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.blitox.losjuevesapi.model.CurrentTable;


public class GameRepositoryImpl implements GameRepositoryCustom{

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public List<CurrentTable> getCurrentTable() {
		/*
		Query query = entityManager.createNativeQuery(""
		 		+ "SELECT 'pepe' as nick_name, 3 points\n" + 
		 		", 4 win\n" + 
		 		", 5 draw \n" + 
		 		", 6 lose\n" + 
		 		", 7 pj\n" + 
		 		"FROM dual",CurrentTable.class);
		 		*/
		
	 Query query = entityManager.createNativeQuery(""
	 		+ "SELECT p.nick_name, sum(r.points) points\n" + 
	 		", count(rwin.id) win\n" + 
	 		", count(rdraw.id) draw \n" + 
	 		", count(rlose.id) lose\n" + 
	 		", count(g.id) pj\n" + 
	 		"FROM game g \n" + 
	 		"inner join player p on (g.id_player = p.id)\n" + 
	 		"inner join result r on (g.id_result = r.id)\n" + 
	 		"left join result rwin on (g.id_result = rwin.id and rwin.id = 1)\n" + 
	 		"left join result rdraw on (g.id_result = rdraw.id and rdraw.id = 2)\n" + 
	 		"left join result rlose on (g.id_result = rlose.id and rlose.id = 3)\n" + 
	 		"group by p.nick_name\n" + 
	 		"order by points desc",CurrentTable.class);
		
		return query.getResultList();
	}
}