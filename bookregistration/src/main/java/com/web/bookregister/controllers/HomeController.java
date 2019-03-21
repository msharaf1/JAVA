package com.web.bookregister.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import javax.websocket.Session;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.web.bookregister.models.BookModel;

@Controller
public class HomeController {
	


	@GetMapping("/")
	public String mainPage() {
		
		return "redirect:/books";
	}

	@GetMapping("/registered")
	public String regBook(){
		return "registeredBooks";
	}


	@GetMapping("/books")
	public String getUsers(@ModelAttribute("book") BookModel books, HttpSession session) {
		
		return "registerBooks";
	}
	
	@PostMapping("/books")
	public String registerBooks(@Valid @ModelAttribute("book") BookModel books, BindingResult result, HttpSession session, 
			String bookAuthor, String bookName, String published) {
		
		if(result.hasErrors()) {
			return "redirect:/books";
		}else {
			books.setBookName(bookName);
			books.setBookAuthor(bookAuthor);
			books.setPublished(published);

			session.setAttribute("bookName", bookName);
			session.setAttribute("bookAuthor", bookAuthor);
			session.setAttribute("published", published);
		}

		return "redirect:/registered";
	}

}
