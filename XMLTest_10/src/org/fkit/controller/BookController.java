package org.fkit.controller;

import java.io.InputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.fkit.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**   
 * @Description: 
 * <br>��վ��<a href="http://www.fkit.org">���Java</a> 
 * @author Ф�ļ�	36750064@qq.com   
 * @version V1.0   
 */
@Controller
public class BookController {
	
	private static final Log logger = LogFactory.getLog(BookController.class);
	 
	// @RequestBody Book book�Ὣ���ݵ�xml�����Զ��󶨵�Book����
	 @RequestMapping(value="/sendxml", method=RequestMethod.POST)  
	 public void sendxml(@RequestBody Book book) {  
		 logger.info(book);
		 logger.info("����XML���ݳɹ�");
	 }  
	 
	// @ResponseBody �ὫBook�Զ�ת��XML���ݷ���
	 @RequestMapping(value="/readxml", method=RequestMethod.POST)  
	 public @ResponseBody Book readXml()throws Exception { 
		 // ͨ��JAXBContext��newInstance����������һ��class�Ϳ��Ի��һ��������
		 JAXBContext context = JAXBContext.newInstance(Book.class);  
		 // ����һ��Unmarshall����
		 Unmarshaller unmar = context.createUnmarshaller();  
		 InputStream is = this.getClass().getResourceAsStream("/book.xml");
		 // Unmarshall�����unmarshal�������Խ���xml��Java�����ת��
		 Book book = (Book) unmar.unmarshal(is);  
		 logger.info(book); 
    	 return book;
	 }  

}