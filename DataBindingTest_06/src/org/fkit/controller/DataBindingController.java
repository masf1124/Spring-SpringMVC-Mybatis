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

	//��̬����־��LogFactory
	private static final Log logger = LogFactory.getLog(DataBindingController.class);
	
	//����@PathVariableע��
	@RequestMapping(value="/pathVariableTest/{userId}")
	public void pathVariableTest(@PathVariable Integer userId) {
		logger.info("ͨ��@PathVariable������ݣ� "+userId);
	}
	
	//����@RequestHeaderע��
	@RequestMapping(value="/requestHeaderTest")
	public void requestHeaderTest(
			@RequestHeader("User-Agent") String userAgent,
			@RequestHeader(value="Accept") String[] accpets) {
		
		logger.info("ͨ��@RequestHeader������ݣ�"+userAgent);
		
		for(String accept:accpets) {
			logger.info(accept);
		}
	}
	
	
	//����@CookieValueע��
	@RequestMapping(value="/cookieValueTest")
	public void cookieValueTest(
			@CookieValue(value="JSESSIONID" ,defaultValue="") String sessionId) {
		logger.info("ͨ��@CookieValue������ݣ�"+sessionId);
	}
}
