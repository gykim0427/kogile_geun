package org.bbong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/kogile/*")
@Log4j
public class MainController {
	
	@GetMapping("/login")
	public void login() {
		
	};
	
	@RequestMapping("/startPage")
	public void start() {
		
	}
	
	@GetMapping("/main")
	public void main() {
		log.info("main............");
	}
	
}
