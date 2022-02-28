package com.katwdojo.omikujiform.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondControllers {
	@RequestMapping("/")
	public String index() {
		return "Welcome to Omikuji";
	}
}
