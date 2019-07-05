package br.com.arthur.redisexample.search;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class SearchController {
	
	private final SearchCacheController service;

	public SearchController(SearchCacheController service) {
		this.service = service;
	}

	@GetMapping("/cache/{hash}")
	CacheView findCache(@PathVariable String hash) {
		return service.findCacheByHash(hash);
	}
}
