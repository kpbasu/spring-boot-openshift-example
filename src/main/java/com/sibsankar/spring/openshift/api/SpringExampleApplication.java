package com.sibsankar.spring.openshift.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringExampleApplication {

	@GetMapping("/")
	public String welcome() {
		return "++++++++++++++++++++++++++++ Welcome to Experimental Squard ++++++++++++++++++++++++++++ ";
	}

	@GetMapping("/{input}")
	public String congrats(@PathVariable String input) {
		return "Hello " + input + ", Your application deployed successfully. Cheers...!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringExampleApplication.class, args);
	}
}
