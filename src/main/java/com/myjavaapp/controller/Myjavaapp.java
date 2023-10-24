package com.myjavaapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Myjavaapp {
	@GetMapping(path="/get")
	public String get()
	{
		return "This is Kowsalya";
	}

}
