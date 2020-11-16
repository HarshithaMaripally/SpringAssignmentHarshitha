package com.controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/validate")
public class ValidateController {
	@RequestMapping(value="/{id}/{name}", method=RequestMethod.GET)
	public String validateUser(@PathVariable int id, @PathVariable String name) {
		if(id == 99 && name.equals("Harshitha")) {
			return "Welcome " +name;
		}
		return "Sorry, You are not a registered user";
	}
}