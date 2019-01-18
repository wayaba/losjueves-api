package com.blitox.losjuevesapi.controller;

import java.util.ArrayList;
import java.util.HashMap; 
import java.util.List; 
import java.util.Map; 
import javax.validation.Valid;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
import com.blitox.losjuevesapi.model.Side; 
import com.blitox.losjuevesapi.repository.SideRepository; 

@RestController @RequestMapping("/losjueves/api")
public class SideController {

	@Autowired
	private SideRepository sideRepository;
	
	@GetMapping("/sides")
	public List<Side> getAllSide(){
		return sideRepository.findAll();
	}
	
	@GetMapping("/sides/{id}")
	public ResponseEntity<Side> getSideById(@PathVariable(value = "id") Long id) throws ResourceNotFoundException{
		Side side = sideRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Side not found for this id :: " + id)); 
		return ResponseEntity.ok().body(side); 
	}
	
	@PostMapping("/sides") 
	public Side createSide(@Valid @RequestBody Side side) { 
		return sideRepository.save(side); 
	}
	
	@PutMapping("/sides/{id}") 
	public ResponseEntity<Side> updateSide(@PathVariable(value = "id") Long id, @Valid @RequestBody Side sideDetails) throws ResourceNotFoundException { 
		Side side = sideRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Side not found for this id :: " + id)); 
		side.setDescription(sideDetails.getDescription()); 
		final Side updatedSide = sideRepository.save(side); 
		return ResponseEntity.ok(updatedSide); 
	}
	
	 @DeleteMapping("/sides/{id}") 
	 public Map<String, Boolean> deleteSide(@PathVariable(value = "id") Long id) throws ResourceNotFoundException { Side side = sideRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Side not found for this id :: " + id)); 
	 sideRepository.delete(side); 
	 Map<String, Boolean> response = new HashMap<>(); 
	 response.put("deleted", Boolean.TRUE); return response; }
}




 