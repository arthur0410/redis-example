package br.com.arthur.redisexample.shared.repository;

import br.com.arthur.redisexample.shared.domain.Cache;

public interface CacheRepository {

	Cache get(String id);
	
	void set(String id, String value);
}
