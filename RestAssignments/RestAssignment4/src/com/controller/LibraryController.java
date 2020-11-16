package com.controller;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Library;

@RestController
@RequestMapping("/book")
public class LibraryController {
	
	Map<Integer, Library> lb = new HashMap<Integer,Library>();
	public LibraryController(){
		lb.put(1,new Library(1,"C",1975));
		lb.put(2,new Library(2,"C++",1986));
		lb.put(3,new Library(3,"Node JS",2014));
		lb.put(4,new Library(4,"Angular",2015));
		lb.put(5,new Library(5,"Spring",2005));
	}
	
	@RequestMapping("")
	public String getBookDetails() {
		String book = "";
		for (Map.Entry<Integer, Library> e : lb.entrySet()) 
            book+=e.getValue().toString()+"\n";
		return book;
	}
	
	@RequestMapping("/{id}")
	public String getBookDetails(@PathVariable int id) {
		Library lib = lb.get(id);
		return lib.toString();
	}
	
}
