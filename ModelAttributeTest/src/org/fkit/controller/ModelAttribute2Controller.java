package org.fkit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ModelAttribute2Controller {

	//model属性名称和值有model.addAttribute("loginname", loginname);实现，前提
	//是要在方法中加入一个Model类型的参数
	@ModelAttribute
	public void userModel2(
			@RequestParam("loginname") String loginname,
			@RequestParam("password") String password,Model model) {
		model.addAttribute("loginname", loginname);
		model.addAttribute("password", password);
		
	}
	
	
	@RequestMapping(value="/login2")
	public String login2() {
		return "result2";
	}
}
