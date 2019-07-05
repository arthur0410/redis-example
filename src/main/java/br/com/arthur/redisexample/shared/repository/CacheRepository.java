package br.com.arthur.redisexample.shared.repository;

import br.com.arthur.redisexample.shared.domain.Cache;

public interface CacheRepository {

	void save(Cache cache);
	
	Cache findByHashCode(String hash);
}
