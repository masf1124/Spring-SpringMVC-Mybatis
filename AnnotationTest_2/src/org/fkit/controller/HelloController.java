package org.fkit.controller;



import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * HelloController 是一个基于注解的控制器，
 * 可以同时处理多个请求动作，不需要实现接口
 * org.springframework.stereotype.Controller;指示该类是一个控制器
 * 
 * @author masf
 *
 */

@Controller
public class HelloController {

	
	private static final Log logger = LogFactory.getLog(HelloController.class);
	
	/**
	 * import org.springframework.web.bind.annotation.RequestMapping;注解
	 * 用来映射请求的URL和请求的方法等，本例来映射“/hello”
	 * hello只是一个普通方法
	 * 该方法返回一个包含视图名和模型的ModelAndView对象
	 * @return
	 */
	@RequestMapping(value = "/hello")
	public ModelAndView hello() {
		logger.info("hello方法被调用！");
		
		//创建准备返回的ModelAndView对象，该对象通常包含了返回视图名，模型名称，及模型对象
		ModelAndView mView = new ModelAndView();
		
		//添加模型数据，可以是任意的POJO对象
		mView.addObject("message", "hello world!");
		//设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
		mView.setViewName("/WEB-INF/content/welcome.jsp");
		
		//返回ModelAndView对象
		return mView;
	}
}
