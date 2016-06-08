package uk.co.frameworktraining.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Success! The Framework Training Book microservice is up and running";
	}
}
