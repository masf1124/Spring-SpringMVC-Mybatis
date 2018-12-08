package org.fkit.controller;

import org.apache.commons.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.apache.commons.logging.LogFactory;
import org.fkit.domain.User;


/**
 * Model的使用
 * @author masf
 *
 */
@Controller
public class User2Controller {

	private static final Log logger = LogFactory.getLog(User2Controller.class);
	
	
	@ModelAttribute
	public void userModel(String loginname,String password,ModelMap modelMap) {
		logger.info("userModel");
		//创建User对象存储jsp页面传入的参数
		User user = new User();
		user.setLoginname(loginname);
		user.setPassword(password);
		
		//将User对象添加到ModelMap中
		modelMap.addAttribute("user", user);
	}
	
	
	@RequestMapping(value="/login2")
	public String login(ModelMap modelMap) {
		logger.info("login2");
		
		//从ModelMap中取出之前存入的名为user的对象
		User user = (User)modelMap.get("user");
		System.out.println(user);
		
		user.setUsername("测试");
		
		return "result2";
	}
}
