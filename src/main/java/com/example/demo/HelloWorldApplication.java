package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class HelloWorldApplication {
	
	@GetMapping("/")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="Techtonic") String name, Model model) {
		model.addAttribute("name", name);
        return "greeting";
    }
	
	@GetMapping("/status")
	public String status() {
		return "I am working!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
