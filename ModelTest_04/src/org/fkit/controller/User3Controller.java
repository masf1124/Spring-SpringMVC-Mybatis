package org.fkit.controller;

import org.apache.commons.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.apache.commons.logging.LogFactory;
import org.fkit.domain.User;


/**
 * Model��ʹ��
 * @author masf
 *
 */
@Controller
public class User3Controller {

	private static final Log logger = LogFactory.getLog(User3Controller.class);
	
	
	@ModelAttribute
	public void userModel(String loginname,String password,ModelAndView model) {
		logger.info("userModel");
		//����User����洢jspҳ�洫��Ĳ���
		User user = new User();
		user.setLoginname(loginname);
		user.setPassword(password);
		
		//��User������ӵ�ModelAndView��
		model.addObject("user", user);
	}
	
	
	@RequestMapping(value="/login3")
	public String login(ModelAndView model) {
		logger.info("login3");
		
		//��ModelAndView��ȡ��֮ǰ�������Ϊuser�Ķ���
		User user = (User)model.getModel().get("user");
		System.out.println(user);
		
		user.setUsername("����");
		
		return "result3";
	}
}
