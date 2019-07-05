package br.com.arthur.redisexample.search;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

import br.com.arthur.redisexample.shared.domain.Cache;
import br.com.arthur.redisexample.shared.repository.CacheRepository;

@Service
public class SearchCacheController {

	private final CacheRepository repository;
	private final Converter<Cache, CacheView> converter;
	
	public SearchCacheController(CacheRepository repository, Converter<Cache, CacheView> converter) {
		this.repository = repository;
		this.converter = converter;
	}
	
	CacheView findCacheByHash(String hash) {
		Cache cache = repository.findByHashCode(hash);
		return converter.convert(cache);
	}
}
