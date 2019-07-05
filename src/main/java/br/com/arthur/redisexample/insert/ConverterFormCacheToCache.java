package br.com.arthur.redisexample.insert;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.com.arthur.redisexample.shared.domain.Cache;

@Component
public class ConverterFormCacheToCache implements Converter<CacheForm, Cache> {

	@Override
	public Cache convert(CacheForm form) {
		return new Cache(form.getId(), form.getData());
	}

}
