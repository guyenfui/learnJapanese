package net.javaguides.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/listKanji")
	public String listKanji() {
		return "listKanji";
	}
	
	@RequestMapping("/listGramar")
	public String listGramar() {
		return "listGramar";
	}
	
	@RequestMapping("/listKotoba")
	public String listKotoba() {
		return "listKotoba";
	}
	@RequestMapping("/shadowing")
	public String shadowing() {
		return "shadowing";
	}
	@RequestMapping("/menu")
	public String menu() {
		return "menu";
	}
	@RequestMapping("/contactUs")
	public String contactUs() {
		return "contactUs";
	}
}
