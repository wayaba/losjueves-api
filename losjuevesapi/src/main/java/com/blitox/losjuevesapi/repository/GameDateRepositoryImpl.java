package com.blitox.losjuevesapi.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.blitox.losjuevesapi.model.GameDateDetail;
import com.blitox.losjuevesapi.model.Player;
import com.blitox.losjuevesapi.model.GameDate;
import com.blitox.losjuevesapi.model.TableView;



public class GameDateRepositoryImpl implements GameDateRepositoryCustom{
	@PersistenceContext
	EntityManager entityManager;
	/*
	@Override
	public List<GameDateDetail> getGameDateDetail() {
		
		Query query = entityManager.createNativeQuery(""
				+ "SELECT g.id\n" + 
				", gd.description\n" + 
				", gd.number\n" + 
				", gd.date\n" + 
				", p.nick_name\n" + 
				", r.description result\n" + 
				", t.description team\n" + 
				"FROM game g\n" + 
				"inner join player p on (g.id_player = p.id)\n" + 
				"inner join team t on (g.id_team = t.id)\n" + 
				"inner join result r on (g.id_result = r.id)\n" + 
				"inner join (select id, description, number, date\n" + 
			"		from game_date where id = (SELECT max(id_game_date) as maxi  FROM game)) gd\n" + 
			"	    on (gd.id = g.id_game_date)",GameDateDetail.class);
		 		
			
			return query.getResultList();
	}
*/
	@Override
	public GameDate getLastGameDate() {
		Query query = entityManager.createNativeQuery(""
				+ "select *\n" + 
			"		from game_date where id = \n" +
			"(SELECT max(id_game_date) as maxi  FROM game) \n",GameDate.class);
		 		
			
			return (GameDate)query.getSingleResult();
	}

	@Override
	public List<GameDateDetail> getPlayersByWeek(int week) {

		Query query = entityManager.createNativeQuery(""
				+ "SELECT g.id\n" + 
				", p.nick_name\n" + 
				", p.id as id_player\n" +
				", r.description result\n" + 
				", t.description team\n" + 
				"FROM game g\n" + 
				"inner join player p on (g.id_player = p.id)\n" + 
				"inner join result r on (g.id_result = r.id)\n" + 
				"inner join game_date gd on (g.id_game_date = gd.id)\n" +
				"inner join team t on (g.id_team = t.id)\n" +
				"where gd.number = " + week + "\n",GameDateDetail.class);
		
			return query.getResultList();
	}

}