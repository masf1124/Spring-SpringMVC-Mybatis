package org.fkit.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

//Controller注解用于指示该类是一个控制器，可以同时处理多个动作
@Controller
//将Model中属性名为user的属性放入HttpSession对象中
@SessionAttributes("user")
public class SessionAttributesController {

	//静态的日志类LogFactory
	private static final Log logger = LogFactory.getLog(SessionAttributesController.class);
	
	@RequestMapping(value="{formname}")
	public String loginForm(@PathVariable String formname) {
		//动态跳转页面
		return formname;
	}
	
	
	@RequestMapping(value="/login")
	public String login(
			@RequestParam("loginname") String loginname,
			@RequestParam("password") String password,Model model) {
		logger.info("user login");
		//创建User对象，装载用户信息
		User user = new User();
		user.setLoginname(loginname);
		user.setPassword(password);
		user.setUsername("admin");
		
		//将User对象添加到model中
		model.addAttribute("user", user);
		return "welcome";
	}
}
