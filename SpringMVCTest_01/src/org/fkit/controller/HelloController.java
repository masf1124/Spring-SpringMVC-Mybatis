package org.fkit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


/**
 * HelloController是一个实现Controller接口的控制器
 * 可以处理一个单一的请求动作
 * @author masf
 *
 */

public class HelloController implements Controller{

	private static final Log logger = LogFactory.getLog(HelloController.class);
	
	/**
	 * handleRequest 是Controller接口必须实现的方法
	 * 该方法的参数是对应的HttpServletRequest 和HttpServletResponse
	 * 该方法必须返回一个包含视图名或视图名和模型的ModelAndView对象
	 */
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	
		logger.info("handleRequset 被调用");
		//创建准备返回的ModelAndView对象，该对象通常包含返回的视图名、模型的名称、模型对象
		ModelAndView mView = new ModelAndView();
		
		//添加模型数据，可以是任意POJO对象
		mView.addObject("message", "Hello World!");
		mView.addObject("hahhh", "sldfhdskjnfuiseunskjeu");
		//设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
		mView.setViewName("/WEB-INF/content/welcome.jsp");

		//返回ModelAndView对象
		return mView;
	}

}
