package com.blitox.losjuevesapi.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.blitox.losjuevesapi.model.PlayerDetail;


public class PlayerRepositoryImpl implements PlayerRepositoryCustom{

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public List<PlayerDetail> getPlayerDetail(long id) {
		
	 Query query = entityManager.createNativeQuery(""
	 		+ "SELECT t.description\n" + 
	 		
	 		", sum(r.points) points\n" + 
	 		", count(rwin.id) win\n" + 
	 		", count(rdraw.id) draw\n" + 
	 		", count(rlose.id) lose\n" +
	 		", count(g.id) pj\n" +
	 		", count(mvp.id) mvp\n" +
	 		"FROM game g \n" + 
	 		"inner join player p on (g.id_player = p.id)\n" + 
	 		"inner join team t on (g.id_team = t.id)\n" +
	 		"inner join result r on (g.id_result = r.id)\n" + 
	 		"left join result rwin on (g.id_result = rwin.id and rwin.id = 1)\n" + 
	 		"left join result rdraw on (g.id_result = rdraw.id and rdraw.id = 2)\n" + 
	 		"left join result rlose on (g.id_result = rlose.id and rlose.id = 3)\n" +
	 		"left join game_date mvp on (g.id_game_date = mvp.id and g.id_player = mvp.id_player)\n" +
	 		"where g.id_player = " + id +"\n" +
	 		"group by t.description\n" + 
	 		"order by points desc",PlayerDetail.class);
		
		return query.getResultList();
	}

	@Override
	public List<PlayerDetail> getPlayerDetailByGameDate(long id, int number) {
		 Query query = entityManager.createNativeQuery(""
			 		+ "SELECT t.description\n" + 
			 		
			 		", sum(r.points) points\n" + 
			 		", count(rwin.id) win\n" + 
			 		", count(rdraw.id) draw\n" + 
			 		", count(rlose.id) lose\n" +
			 		", count(g.id) pj\n" +
			 		", count(mvp.id) mvp\n" +
			 		"FROM game g \n" + 
			 		"inner join player p on (g.id_player = p.id)\n" + 
			 		"inner join result r on (g.id_result = r.id)\n" + 
			 		"left join result rwin on (g.id_result = rwin.id and rwin.id = 1)\n" + 
			 		"left join result rdraw on (g.id_result = rdraw.id and rdraw.id = 2)\n" + 
			 		"left join result rlose on (g.id_result = rlose.id and rlose.id = 3)\n" +
			 		"left join game_date mvp on (g.id_game_date = mvp.id and g.id_player = mvp.id_player)\n" +
			 		"where g.id_player = " + id +"\n" +
			 		"group by t.description\n" + 
			 		"order by points desc",PlayerDetail.class);
				
				return query.getResultList();
	}
	
	
}