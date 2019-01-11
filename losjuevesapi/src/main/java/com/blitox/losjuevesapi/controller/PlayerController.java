package com.blitox.losjuevesapi.controller;

import java.util.HashMap; 
import java.util.List; 
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
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
import com.blitox.losjuevesapi.model.Player; 
import com.blitox.losjuevesapi.repository.PlayerRepository; 

@RestController @RequestMapping("/losjueves/api")
public class PlayerController {

	@Autowired
	private PlayerRepository playerRepository;
	
	@GetMapping("/players")
	public List<Player> getAllPlayer(){
		return playerRepository.findAll();
	}
	
	@GetMapping("/players/{id}")
	public ResponseEntity<Player> getPlayerById(@PathVariable(value = "id") Long id) throws ResourceNotFoundException{
		Player player = playerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Player not found for this id :: " + id)); 
		return ResponseEntity.ok().body(player); 
	}
	
	@PostMapping("/players") 
	public Player createPlayer(@Valid @RequestBody Player player) { 
		return playerRepository.save(player); 
	}
	
	@PutMapping("/players/{id}") 
	public ResponseEntity<Player> updatePlayer(@PathVariable(value = "id") Long id, @Valid @RequestBody Player playerDetails) throws ResourceNotFoundException { 
		Player player = playerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Player not found for this id :: " + id)); 
		player.setFirstName(playerDetails.getFirstName()); 
		player.setLastName(playerDetails.getLastName()); 
		player.setNickName(playerDetails.getNickName());
		player.setBirth(playerDetails.getBirth());
		final Player updatedPlayer = playerRepository.save(player); 
		return ResponseEntity.ok(updatedPlayer); 
	}
	
	 @DeleteMapping("/players/{id}") 
	 public Map<String, Boolean> deletePlayer(@PathVariable(value = "id") Long id) throws ResourceNotFoundException { Player player = playerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Player not found for this id :: " + id)); 
	 playerRepository.delete(player); 
	 Map<String, Boolean> response = new HashMap<>(); 
	 response.put("deleted", Boolean.TRUE); return response; }
}




 