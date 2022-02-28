package com.katwdojo.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@RequestMapping("/omikuji")
	public String welcome(){
		return "welcome.jsp";
	}
	@RequestMapping(value="/submit", method="post")
	public String submit(@RequestParam("number")int number,@RequestParam("city") String city, @RequestParam("name") String name, @RequestParam("hobby") String hobby, @RequestParam("thing") String thing, @RequestParam("comment") String comment, HttpSession user) {
		String omikuji = String.format("In %s years you will live in %s with %s as your roommate, %s. The next time you see a %s, you will have good luck. Also, %s", number, city, name, hobby, thing, comment);
		user.setAttribute("omikuji", omikuji);
	}
	@RequestMapping("/omikuji/show")
	public String show(HttpSession user, Model model) {
		String result = (String) user.getAttribute("omikuji");
		return "submit.jsp";
	}
}
