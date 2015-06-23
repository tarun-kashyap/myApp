/**
 * 
 */
package com.myApp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author dev
 *
 */
@Controller
public class MyAppController{

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String displayHome(Model model) throws Exception 
	{
		 
		return "home";
	}
	
	
}
