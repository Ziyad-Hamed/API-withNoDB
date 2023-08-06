package io.javaCourse.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
// make a spring boot application parameters are the class for main method & parameter of it
// it's static method for spring take class with annotation		
		SpringApplication.run(CourseApiApp.class, args);
	}

}
