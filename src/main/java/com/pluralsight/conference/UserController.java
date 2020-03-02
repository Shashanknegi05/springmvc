package com.pluralsight.conference;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pluralsight.conference.model.User;

@RestController
public class UserController {
	
	@GetMapping("/user")
	public User getUser(@RequestParam(value = "firstName", defaultValue = "Shashank") String firstName,
						@RequestParam(value = "lastName", defaultValue = "Negi") String lastName,
						@RequestParam(value = "age", defaultValue = "25") int age) {
		User user = new User();
		
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setAge(age);
		return user;	
	}
	

}
