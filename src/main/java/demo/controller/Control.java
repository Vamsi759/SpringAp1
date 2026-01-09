package demo.controller;
import demo.service.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Control {
	@Autowired
	Services s;
	
	
	
	@RequestMapping("/home")
	public String home() {
		//s.Save();
		return "home";
	}

}
