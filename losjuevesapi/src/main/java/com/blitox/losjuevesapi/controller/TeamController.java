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
import com.blitox.losjuevesapi.model.Team; 
import com.blitox.losjuevesapi.repository.TeamRepository; 

@RestController @RequestMapping("/losjueves/api")
public class TeamController {

	@Autowired
	private TeamRepository teamRepository;
	
	@GetMapping("/teams")
	public List<Team> getAllTeam(){
		return teamRepository.findAll();
	}
	
	@GetMapping("/teams/{id}")
	public ResponseEntity<Team> getTeamById(@PathVariable(value = "id") Long id) throws ResourceNotFoundException{
		Team team = teamRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Team not found for this id :: " + id)); 
		return ResponseEntity.ok().body(team); 
	}
	
	@PostMapping("/teams") 
	public Team createTeam(@Valid @RequestBody Team team) { 
		return teamRepository.save(team); 
	}
	
	@PutMapping("/teams/{id}") 
	public ResponseEntity<Team> updateTeam(@PathVariable(value = "id") Long id, @Valid @RequestBody Team teamDetails) throws ResourceNotFoundException { 
		Team team = teamRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Team not found for this id :: " + id)); 
		team.setDescription(teamDetails.getDescription()); 
		final Team updatedTeam = teamRepository.save(team); 
		return ResponseEntity.ok(updatedTeam); 
	}
	
	 @DeleteMapping("/teams/{id}") 
	 public Map<String, Boolean> deleteTeam(@PathVariable(value = "id") Long id) throws ResourceNotFoundException { Team team = teamRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Team not found for this id :: " + id)); 
	 teamRepository.delete(team); 
	 Map<String, Boolean> response = new HashMap<>(); 
	 response.put("deleted", Boolean.TRUE); return response; }
}




 