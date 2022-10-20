package com.api.cadunion;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@RestController
public class CadUnionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadUnionApplication.class, args);

	}

	

	@GetMapping("/")
	public ModelAndView index(){

		var view = new ModelAndView("home/index");
		return view;
	}

}
