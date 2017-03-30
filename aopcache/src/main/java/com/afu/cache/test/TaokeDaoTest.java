package com.afu.cache.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TaokeDaoTest extends BaseTester {
	@Autowired
	private AopTest aopTest;

	@Test
	public void test() {
		aopTest.getName("123");
	}
}
