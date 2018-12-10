package org.fkit.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.fkit.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller
@RequestMapping(value="/json")
public class BookController {

	private static final Log Logger = LogFactory.getLog(BookController.class);
	
	
	@RequestMapping(value="/testRequestBody")
	@ResponseBody
	public Object getJson() {
		
		List<Book> list = new ArrayList<Book>();
		list.add(new Book( 1,"SpringMVC 企业应用实战","小文及"));
		list.add(new Book( 2,"轻量级Java EE 企业应用实战","小文及"));
		Logger.info(list);
		return list;
	}
}
