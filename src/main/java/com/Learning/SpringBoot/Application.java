package com.Learning.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/message")
	public void message(){
		System.out.println("The Spring Application has started!");
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		Application obj = new Application();
		obj.message();
	}

}
