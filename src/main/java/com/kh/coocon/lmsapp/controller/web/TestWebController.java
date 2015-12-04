package com.kh.coocon.lmsapp.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/adminpage")
public class TestWebController {

	
	@RequestMapping(value="/" , method=RequestMethod.GET)
	public String test(ModelMap m){
		m.addAttribute("message","ADMIN PAGE");
		return "user";
	}
	
}
