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
import com.blitox.losjuevesapi.model.Result; 
import com.blitox.losjuevesapi.repository.ResultRepository; 

@RestController @RequestMapping("/losjueves/api")
public class ResultController {

	@Autowired
	private ResultRepository resultRepository;
	
	@GetMapping("/results")
	public List<Result> getAllResult(){
		return resultRepository.findAll();
	}
	
	@GetMapping("/results/{id}")
	public ResponseEntity<Result> getResultById(@PathVariable(value = "id") Long id) throws ResourceNotFoundException{
		Result result = resultRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Result not found for this id :: " + id)); 
		return ResponseEntity.ok().body(result); 
	}
	
	@PostMapping("/results") 
	public Result createResult(@Valid @RequestBody Result result) { 
		return resultRepository.save(result); 
	}
	
	@PutMapping("/results/{id}") 
	public ResponseEntity<Result> updateResult(@PathVariable(value = "id") Long id, @Valid @RequestBody Result resultDetails) throws ResourceNotFoundException { 
		Result result = resultRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Result not found for this id :: " + id)); 
		result.setDescription(resultDetails.getDescription()); 
		result.setPoints(resultDetails.getPoints()); 
		final Result updatedResult = resultRepository.save(result); 
		return ResponseEntity.ok(updatedResult); 
	}
	
	 @DeleteMapping("/results/{id}") 
	 public Map<String, Boolean> deleteResult(@PathVariable(value = "id") Long id) throws ResourceNotFoundException { Result result = resultRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Result not found for this id :: " + id)); 
	 resultRepository.delete(result); 
	 Map<String, Boolean> response = new HashMap<>(); 
	 response.put("deleted", Boolean.TRUE); return response; }
}




 