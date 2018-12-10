package org.fkit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelAttribute4Controller {

	//��ʱlogin4�����ķ���ֵ������һ����ͼ���ƣ�����model���Ե�ֵ
	//��ͼ������@RequestMapping(value="/login4")��value��ֵ
	@RequestMapping(value="/login4")
	@ModelAttribute(value = "username")
	public String login4() {
		return "admin";
	}
}
