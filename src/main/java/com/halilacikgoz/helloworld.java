package com.halilacikgoz;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class helloworld {

	
	@RequestMapping("/h")
	public ModelAndView helloWorld() {
		ModelAndView mv =  new ModelAndView("hello");
		return mv;
	}
	@RequestMapping(value="/he", method = RequestMethod.GET)
	public String hello(HttpServletRequest request, Model model) {
		
		model.addAttribute("message","AAAAA");
		return "hello";
	}
}
