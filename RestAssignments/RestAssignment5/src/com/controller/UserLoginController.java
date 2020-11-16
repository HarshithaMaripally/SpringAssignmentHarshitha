package com.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.UserLogin;

@RestController
@RequestMapping("/user")
public class UserLoginController {
	
	List<UserLogin> lst = new ArrayList<UserLogin>();

	UserLoginController(){
		lst.add(new UserLogin("Harshitha","h"));
		lst.add(new UserLogin("Ashwitha","j"));
		lst.add(new UserLogin("Keerthi","l"));
	}
	
	@RequestMapping(value="/validate",method=RequestMethod.POST)
	public ResponseEntity<String> validateData(@RequestBody String name, String passwd){
		boolean b = false;
		for(UserLogin t : lst) {

			if(t.getName().equals(name) && t.getPassword().equals(passwd)) {
				b=true;
				break;
			}
		}
		System.out.println(b ? "Valid User" : "Invalid User");
		return new ResponseEntity(HttpStatus.CREATED);
	}

}
