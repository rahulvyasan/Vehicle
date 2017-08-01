package com.rahul.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import com.rahul.domain.Car;

import com.rahul.service.CarServiceImpl;


@Controller
public class CarRegistrationController {
	@Autowired
	private CarServiceImpl carServiceImpl;

	
	@RequestMapping("/car")
	public String listOrganizations(Model model) {
		List<Car> cars = carServiceImpl.getAllCars();
		model.addAttribute("carList", cars);
		return "listCars";
	}
	 @RequestMapping(value = { "/"}, method = RequestMethod.GET)
	   public String welcomePage(Model model) {
	       model.addAttribute("title", "page");
	       model.addAttribute("message", "welcome");
	       return "welcome";
	   }
}
