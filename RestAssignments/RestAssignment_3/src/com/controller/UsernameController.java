package com.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Username")
public class UsernameController {
	@RequestMapping(value="/{firstname}/{lastname}", method=RequestMethod.GET)
	public String UserFullname(@PathVariable String firstname, @PathVariable String lastname) {
		return "Welcome " +firstname+" "+lastname;
	}
}