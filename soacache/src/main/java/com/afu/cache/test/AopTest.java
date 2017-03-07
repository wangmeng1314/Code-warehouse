package com.afu.cache.test;

import org.springframework.stereotype.Service;

import com.afu.cache.cache.CacheableAop;

@Service
public class AopTest {
	@CacheableAop(key = "'getName()'+#id")
	public void getName(String id) {

	}
}
