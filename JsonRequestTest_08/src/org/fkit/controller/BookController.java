package org.fkit.controller;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.map.ObjectMapper;
import org.fkit.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/json")
public class BookController {

	private static final Log logger = LogFactory.getLog(BookController.class);
	
	//
	@RequestMapping(value = "/testRequestBody")
	public void setJson(@RequestBody Book book,
			HttpServletResponse response) throws Exception{
		ObjectMapper mapper = new ObjectMapper();
		
		logger.info(mapper.writeValueAsString(book));
		book.setAuthor("小文及");
		logger.info(mapper.writeValueAsString(book));
		response.setContentType("text/html;charset=UTF-8");
		
		//将book对象转换成json写出到客户端
		response.getWriter().println(mapper.writeValueAsString(book));
	}
	
}
