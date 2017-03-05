package com.reddot.base.controller;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class BaseController {


	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String welcome(ModelMap map)
	{
		// Basic Home page for the red dot site. 
		return "index";
	}
	

	
}
