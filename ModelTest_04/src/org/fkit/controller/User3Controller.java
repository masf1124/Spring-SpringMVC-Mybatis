package org.fkit.controller;

import org.apache.commons.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.apache.commons.logging.LogFactory;
import org.fkit.domain.User;


/**
 * Model的使用
 * @author masf
 *
 */
@Controller
public class User3Controller {

	private static final Log logger = LogFactory.getLog(User3Controller.class);
	
	
	@ModelAttribute
	public void userModel(String loginname,String password,ModelAndView model) {
		logger.info("userModel");
		//创建User对象存储jsp页面传入的参数
		User user = new User();
		user.setLoginname(loginname);
		user.setPassword(password);
		
		//将User对象添加到ModelAndView中
		model.addObject("user", user);
	}
	
	
	@RequestMapping(value="/login3")
	public String login(ModelAndView model) {
		logger.info("login3");
		
		//从ModelAndView中取出之前存入的名为user的对象
		User user = (User)model.getModel().get("user");
		System.out.println(user);
		
		user.setUsername("测试");
		
		return "result3";
	}
}
