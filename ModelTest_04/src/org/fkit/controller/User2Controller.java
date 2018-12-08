package org.fkit.controller;

import org.apache.commons.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.apache.commons.logging.LogFactory;
import org.fkit.domain.User;


/**
 * Model��ʹ��
 * @author masf
 *
 */
@Controller
public class User2Controller {

	private static final Log logger = LogFactory.getLog(User2Controller.class);
	
	
	@ModelAttribute
	public void userModel(String loginname,String password,ModelMap modelMap) {
		logger.info("userModel");
		//����User����洢jspҳ�洫��Ĳ���
		User user = new User();
		user.setLoginname(loginname);
		user.setPassword(password);
		
		//��User������ӵ�ModelMap��
		modelMap.addAttribute("user", user);
	}
	
	
	@RequestMapping(value="/login2")
	public String login(ModelMap modelMap) {
		logger.info("login2");
		
		//��ModelMap��ȡ��֮ǰ�������Ϊuser�Ķ���
		User user = (User)modelMap.get("user");
		System.out.println(user);
		
		user.setUsername("����");
		
		return "result2";
	}
}
