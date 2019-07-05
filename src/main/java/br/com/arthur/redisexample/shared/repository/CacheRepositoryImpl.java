package br.com.arthur.redisexample.shared.repository;

import org.springframework.stereotype.Repository;

import br.com.arthur.redisexample.shared.domain.Cache;

@Repository
public class CacheRepositoryImpl implements CacheRepository {

	@Override
	public void save(Cache cache) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cache findByHashCode(String hash) {
		// TODO Auto-generated method stub
		return null;
	}

}
