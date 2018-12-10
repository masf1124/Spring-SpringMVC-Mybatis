package org.fkit.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class ModelAttribute5Controller {

	private static final Log Logger = LogFactory.getLog(ModelAttribute5Controller.class);
	@ModelAttribute("user")
	public User userModel5(
			@RequestParam("loginname") String loginname,
			@RequestParam("password") String password) {
		Logger.info("userModel5");
		User user = new User();
		user.setLoginname(loginname);
		user.setPassword(password);
		
		return user;
	}
	
	//@ModelAttribute("user") User user �У� ����user���Ǿ���userModel5�����е�model����
	@RequestMapping(value="/login5")
	public String login5(@ModelAttribute("user") User user) {
		Logger.info("login5");
		user.setUsername("����Ա");
		return "result5";
	}
}
