package org.fkit.controller;



import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * HelloController ��һ������ע��Ŀ�������
 * ����ͬʱ������������������Ҫʵ�ֽӿ�
 * org.springframework.stereotype.Controller;ָʾ������һ��������
 * 
 * @author masf
 *
 */

@Controller
public class HelloController {

	
	private static final Log logger = LogFactory.getLog(HelloController.class);
	
	/**
	 * import org.springframework.web.bind.annotation.RequestMapping;ע��
	 * ����ӳ�������URL������ķ����ȣ�������ӳ�䡰/hello��
	 * helloֻ��һ����ͨ����
	 * �÷�������һ��������ͼ����ģ�͵�ModelAndView����
	 * @return
	 */
	@RequestMapping(value = "/hello")
	public ModelAndView hello() {
		logger.info("hello���������ã�");
		
		//����׼�����ص�ModelAndView���󣬸ö���ͨ�������˷�����ͼ����ģ�����ƣ���ģ�Ͷ���
		ModelAndView mView = new ModelAndView();
		
		//���ģ�����ݣ������������POJO����
		mView.addObject("message", "hello world!");
		//�����߼���ͼ������ͼ����������ݸ����ֽ������������ͼҳ��
		mView.setViewName("/WEB-INF/content/welcome.jsp");
		
		//����ModelAndView����
		return mView;
	}
}
