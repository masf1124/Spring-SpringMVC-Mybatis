package org.fkit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelAttribute4Controller {

	//此时login4方法的返回值并不是一个视图名称，而是model属性的值
	//视图名称是@RequestMapping(value="/login4")中value的值
	@RequestMapping(value="/login4")
	@ModelAttribute(value = "username")
	public String login4() {
		return "admin";
	}
}
