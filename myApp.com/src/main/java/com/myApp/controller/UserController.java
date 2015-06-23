/**
 * 
 */
package com.myApp.controller;

import javax.validation.Valid;

import com.myApp.form.UserRegisterForm;
import user.UserManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

/**
 * @author dev
 *
 */
@Controller
public class UserController {
	
	@Autowired
	UserManager manager;

	public String create(Model model, @Valid UserRegisterForm form, BindingResult result)
	{
		String returnPage = "";
		//User user = new User();
		String name = form.getFullName();
		if(name!= null)
		{
			//user.setFirstName(name.split(" ")[0]);	
		}
		
		//manager.createUser(user);
		return returnPage;
	}
}
