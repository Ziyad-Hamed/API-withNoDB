package io.javaCourse.springBoot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//make a rest controller map url requests for the class itself
@RestController
public class HelloController {
// at request map at hello	
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}
}
