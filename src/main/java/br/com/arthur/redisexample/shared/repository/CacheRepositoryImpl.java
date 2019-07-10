package br.com.arthur.redisexample.shared.repository;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import br.com.arthur.redisexample.shared.domain.Cache;

@Repository
public class CacheRepositoryImpl implements CacheRepository {
	
	private final RedisTemplate<String, String> redisTemplate;

	public CacheRepositoryImpl(RedisTemplate<String, String> cache) {
		this.redisTemplate = cache;
	}

	@Override
	public Cache get(String id) {
		String value = redisTemplate.opsForValue().get(id);
		return new Cache(id, value);
	}

	@Override
	public void set(String id, String value) {
		redisTemplate.opsForValue().set(id, value);
	}

}
