package br.com.arthur.redisexample.insert;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InsertController {
	
	private final InsertService service;
	
	public InsertController(InsertService service) {
		this.service = service;
	}

	@PostMapping
	private ResponseEntity<?> insertCache(CacheForm form) {
		service.insert(form);
		return ResponseEntity.ok(null);
	}

}
