package org.hcltraining.librarymanagement.controller;

import org.hcltraining.librarymanagement.dto.Book;
import org.hcltraining.librarymanagement.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LibraryController {
	@Autowired
	LibraryService libraryService;
	
	@RequestMapping("/addBook")
	public ModelAndView addBook(@ModelAttribute Book book) {
	Book book2=libraryService.addBook(book);
	ModelAndView modelAndView=new ModelAndView("common.jsp");
	if(book2!=null) {
	modelAndView.addObject("msg","BOOK SAVED SUCCESSFULLY");

	}else {
	modelAndView.addObject("msg","FAILED TO SAVE THE BOOK");
	}
	return modelAndView;
	}

	@RequestMapping("/returnBook")
	public ModelAndView returnBook(@RequestParam("userId") int userid,@RequestParam("bookId") int bookid ) {
		ModelAndView andView=new ModelAndView("returnsuccess.jsp");
		libraryService.returnBorrowBook(bookid, userid);
		
	    	andView .addObject("msg","sucessfully returned");
	     return andView;
	}

}
