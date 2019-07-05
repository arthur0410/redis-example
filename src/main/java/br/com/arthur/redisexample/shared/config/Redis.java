package br.com.arthur.redisexample.shared.config;

import org.springframework.stereotype.Component;

import redis.clients.jedis.Jedis;

public class Redis {

	private final Jedis jedis;

	public Redis(String host, Integer port) {
		this.jedis = new Jedis(host, port);
	}

	public void set(String key, String value) {
		try {
			jedis.connect();
			jedis.set(key, value);
		} finally {
			jedis.disconnect();
			jedis.close();
		}
	}

	public String get(String key) {
		try {
			jedis.connect();
			return jedis.get(key);
		} finally {
			jedis.disconnect();
			jedis.close();
		}
	}
}
