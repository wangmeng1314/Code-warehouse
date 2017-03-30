package com.afu.cache.test;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * Created by god on 16/5/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:META-INF/spring/ApplicationContext-*.xml" })
public abstract class BaseTester extends Assert {

	public static String toPrettyJson(Object obj) {
		return JSON.toJSONStringWithDateFormat(obj, DateFormatUtils.ISO_DATETIME_FORMAT.getPattern(),
				SerializerFeature.PrettyFormat);
	}

	public static String appendStr(Object... strs) {
		StringBuilder builder = new StringBuilder();
		for (Object s : strs) {
			builder.append(s.getClass().isArray() ? appendStr(s) : s);
		}
		return builder.toString();
	}

	public static void println(Object... strs) {
		System.out.println(appendStr(strs));
	}

	public static void printlnPrettyJson(Object obj) {
		System.out.println(toPrettyJson(obj));
	}

}
