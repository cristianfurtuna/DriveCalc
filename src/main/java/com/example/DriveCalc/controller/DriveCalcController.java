package com.example.DriveCalc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class DriveCalcController {

	@GetMapping ("/")
	public String startingPoint(){
		return "index";
	}
	
}
