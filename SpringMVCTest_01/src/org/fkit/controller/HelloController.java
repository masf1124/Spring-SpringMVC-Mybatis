package org.fkit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


/**
 * HelloController��һ��ʵ��Controller�ӿڵĿ�����
 * ���Դ���һ����һ��������
 * @author masf
 *
 */

public class HelloController implements Controller{

	private static final Log logger = LogFactory.getLog(HelloController.class);
	
	/**
	 * handleRequest ��Controller�ӿڱ���ʵ�ֵķ���
	 * �÷����Ĳ����Ƕ�Ӧ��HttpServletRequest ��HttpServletResponse
	 * �÷������뷵��һ��������ͼ������ͼ����ģ�͵�ModelAndView����
	 */
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	
		logger.info("handleRequset ������");
		//����׼�����ص�ModelAndView���󣬸ö���ͨ���������ص���ͼ����ģ�͵����ơ�ģ�Ͷ���
		ModelAndView mView = new ModelAndView();
		
		//���ģ�����ݣ�����������POJO����
		mView.addObject("message", "Hello World!");
		mView.addObject("hahhh", "sldfhdskjnfuiseunskjeu");
		//�����߼���ͼ������ͼ����������ݸ����ֽ������������ͼҳ��
		mView.setViewName("/WEB-INF/content/welcome.jsp");

		//����ModelAndView����
		return mView;
	}

}
