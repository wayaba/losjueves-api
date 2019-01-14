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
import com.blitox.losjuevesapi.model.TableView;
import com.blitox.losjuevesapi.model.Game; 
import com.blitox.losjuevesapi.repository.GameRepository; 

@RestController @RequestMapping("/losjueves/api")
public class GameController {

	@Autowired
	private GameRepository gameRepository;
	
	@GetMapping("/games")
	public List<Game> getAllGame(){
		return gameRepository.findAll();
	}
	
	@GetMapping("/games/{id}")
	public ResponseEntity<Game> getGameById(@PathVariable(value = "id") Long id) throws ResourceNotFoundException{
		Game game = gameRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Game not found for this id :: " + id)); 
		return ResponseEntity.ok().body(game); 
	}
	
	@GetMapping("/games/table")
	public List<TableView> getGameTable(){
		return gameRepository.getGameTable();
	}
	
	@GetMapping("/games/table/{number}")
	public List<TableView> getGameTableByNumber(@PathVariable(value = "number") int number){
		return gameRepository.getGameTableByNumber(number); 
		 
	}
	
	@PostMapping("/games") 
	public Game createGame(@Valid @RequestBody Game game) { 
		return gameRepository.save(game); 
	}
	
	@PutMapping("/games/{id}") 
	public ResponseEntity<Game> updateGame(@PathVariable(value = "id") Long id, @Valid @RequestBody Game gameDetails) throws ResourceNotFoundException { 
		Game game = gameRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Game not found for this id :: " + id));  
		final Game updatedGame = gameRepository.save(game); 
		return ResponseEntity.ok(updatedGame); 
	}
	
	 @DeleteMapping("/games/{id}") 
	 public Map<String, Boolean> deleteGame(@PathVariable(value = "id") Long id) throws ResourceNotFoundException { Game game = gameRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Game not found for this id :: " + id)); 
	 gameRepository.delete(game); 
	 Map<String, Boolean> response = new HashMap<>(); 
	 response.put("deleted", Boolean.TRUE); return response; }
}




 