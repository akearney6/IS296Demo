package com.example.controller;

import org.springframework.stereotype.Controller;

import com.example.vo.Datasource;

@Controller 
public class Is296DemoController {
	
	private Datasource ds;
	
	public Is296DemoController(Datasource ds) {
		System.out.println("Controller instantiated");
		this.ds = ds;
	}
}
