package com.earth.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewBasicBootController {

	@RequestMapping("/basic-web")
	public String showBasicBootPage() {
		
		
		return "web-basic-boot";
	}
}
