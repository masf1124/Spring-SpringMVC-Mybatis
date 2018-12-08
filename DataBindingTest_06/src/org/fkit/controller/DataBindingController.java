package org.fkit.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DataBindingController {

	//静态的日志类LogFactory
	private static final Log logger = LogFactory.getLog(DataBindingController.class);
	
	//测试@PathVariable注解
	@RequestMapping(value="/pathVariableTest/{userId}")
	public void pathVariableTest(@PathVariable Integer userId) {
		logger.info("通过@PathVariable获得数据： "+userId);
	}
	
	//测试@RequestHeader注解
	@RequestMapping(value="/requestHeaderTest")
	public void requestHeaderTest(
			@RequestHeader("User-Agent") String userAgent,
			@RequestHeader(value="Accept") String[] accpets) {
		
		logger.info("通过@RequestHeader获得数据："+userAgent);
		
		for(String accept:accpets) {
			logger.info(accept);
		}
	}
	
	
	//测试@CookieValue注解
	@RequestMapping(value="/cookieValueTest")
	public void cookieValueTest(
			@CookieValue(value="JSESSIONID" ,defaultValue="") String sessionId) {
		logger.info("通过@CookieValue获得数据："+sessionId);
	}
}
