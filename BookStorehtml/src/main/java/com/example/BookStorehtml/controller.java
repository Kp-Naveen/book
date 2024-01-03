package com.example.BookStorehtml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



import java.util.*;
@Controller
public class controller {
		@Autowired
		repository repo;
		
		
		@GetMapping("/book")
		public String get() {
			return "bookAdd";
		}
		
		@PostMapping("/save")
		public String add(@ModelAttribute model a) {
			repo.save(a);
			return "redirect:/availableBook";
		}
		
		@GetMapping("/availableBook")
		public ModelAndView select() {
			List<model> list=repo.findAll();
			return new ModelAndView("avalaibleBook","naveen", list);
		}
		@RequestMapping("/deleteBook/{id}")
		public String delete(@PathVariable("id") int id) {
			repo.deleteById(id);
			return "redirect:/availableBook";
		}
		 @RequestMapping("/editBook/{id}")
			public String edit(@PathVariable("id") int id,Model model) {
				model b=repo.findById(id).get();
				model.addAttribute("book",b);
				return "bookedit";
			}
}
