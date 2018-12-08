package org.fkit.controller;

import org.apache.commons.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
public class User1Controller {

	private static final Log logger = LogFactory.getLog(User1Controller.class);
	
	
	@ModelAttribute
	public void userModel(String loginname,String password,Model model) {
		logger.info("userModel");
		//创建User对象存储jsp页面传入的参数
		User user = new User();
		user.setLoginname(loginname);
		user.setPassword(password);
		
		//将User对象添加到Model中
		model.addAttribute("user", user);
	}
	
	
	@RequestMapping(value="/login1")
	public String login(Model model) {
		logger.info("login1");
		
		//从Model中取出之前存入的名为user的对象
		User user = (User)model.asMap().get("user");
		System.out.println(user);
		
		user.setUsername("测试");
		
		return "result1";
	}
}
