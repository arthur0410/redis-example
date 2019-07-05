package br.com.arthur.redisexample.insert;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

import br.com.arthur.redisexample.shared.domain.Cache;
import br.com.arthur.redisexample.shared.repository.CacheRepository;

@Service
public class InsertService {
	
	private final CacheRepository repository;
	private final Converter<CacheForm, Cache> converter;

	public InsertService(CacheRepository repository, Converter<CacheForm, Cache> converter) {
		this.repository = repository;
		this.converter = converter;
	}

	public void insert(CacheForm form) {
		Cache cache = converter.convert(form);
		repository.save(cache);
	}

}
