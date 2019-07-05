package br.com.arthur.redisexample.search;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.com.arthur.redisexample.shared.domain.Cache;

@Component
public class ConverterCacheToCacheView implements Converter<Cache, CacheView> {

	@Override
	public CacheView convert(Cache arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
