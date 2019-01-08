package com.blitox.losjuevesapi.controller;

import java.util.HashMap; 
import java.util.List; 
import java.util.Map; 
import javax.validation.Valid; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.http.ResponseEntity; 
import org.springframework.web.bind.annotation.DeleteMapping; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.PutMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController; 
import com.blitox.losjuevesapi.exception.ResourceNotFoundException; 
import com.blitox.losjuevesapi.model.GameDate; 
import com.blitox.losjuevesapi.repository.GameDateRepository;
import com.blitox.losjuevesapi.repository.PlayerRepository; 

@RestController @RequestMapping("/losjueves/api")
public class GameDateController {

	@Autowired
	private GameDateRepository gameDateRepository;
	
	//@Autowired
	//private PlayerRepository playerRepository;
	
	@GetMapping("/gamedates")
	public List<GameDate> getAllGameDate(){
		return gameDateRepository.findAll();
	}
	
	@GetMapping("/gamedates/{id}")
	public ResponseEntity<GameDate> getGameDateById(@PathVariable(value = "id") Long id) throws ResourceNotFoundException{
		GameDate gameDate = gameDateRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("GameDate not found for this id :: " + id)); 
		return ResponseEntity.ok().body(gameDate); 
	}
	
	@PostMapping("/gamedates") 
	public GameDate createGameDate(@Valid @RequestBody GameDate gameDate) { 
		return gameDateRepository.save(gameDate); 
	}
	
	@PutMapping("/gamedates/{id}") 
	public ResponseEntity<GameDate> updateGameDate(@PathVariable(value = "id") Long id, @Valid @RequestBody GameDate gameDateDetails) throws ResourceNotFoundException { 
		GameDate gameDate = gameDateRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("GameDate not found for this id :: " + id)); 
		gameDate.setDescription(gameDateDetails.getDescription()); 
		gameDate.setMvp(gameDateDetails.getMvp());
		gameDate.setDate(gameDateDetails.getDate());
		final GameDate updatedGameDate = gameDateRepository.save(gameDate); 
		return ResponseEntity.ok(updatedGameDate); 
	}
	
	 @DeleteMapping("/gamedates/{id}") 
	 public Map<String, Boolean> deleteGameDate(@PathVariable(value = "id") Long id) throws ResourceNotFoundException { GameDate gameDate = gameDateRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("GameDate not found for this id :: " + id)); 
	 gameDateRepository.delete(gameDate); 
	 Map<String, Boolean> response = new HashMap<>(); 
	 response.put("deleted", Boolean.TRUE); return response; }
}