package org.fkit.controller;

import java.util.ArrayList;
import java.util.List;

import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ModelAttribute3Controller {

	//��̬List<User>���ϣ��˴������������ݿⱣ��ע����Ϣ
	private static List<User> userList;
	
	public ModelAttribute3Controller() {
		super();
		userList = new ArrayList<User>();
		
		User user1 = new User("test","123456","�����û�");
		User user2 = new User("admin","123456","����Ա");
		
		//�洢User�û�������ģ�����ݿ�����
		userList.add(user1);
		userList.add(user2);
	}
	
	//���ݵ�¼���������ѯ�û����û����ڷ��ذ����û���Ϣ��User���󣬲����ڷ���null
	public  User find(String loginname,String password) {
		
		for(User user:userList) {
			if(user.getLoginname().equals(loginname)&&user.getPassword().equals(password)) {
				return user;
			}
		}
		
		return null;
	}
	
	//model���Ե�����û��ָ�������ɷ�������������ʾ���������������User���ͣ�
	//��ômodel���Ե�������user
	@ModelAttribute
	public User userModel3(
			@RequestParam("loginname") String loginname,
			@RequestParam("password") String password) {
		return find(loginname, password);
	}
	
	@RequestMapping(value="/login3")
	public String login3() {
		return "result3";
	}
	
}
