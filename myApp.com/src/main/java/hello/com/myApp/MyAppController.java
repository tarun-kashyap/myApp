/**
 * 
 */
package main.java.hello.com.myApp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * @author dev
 *
 */
public class MyAppController extends AbstractController {

	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse res) throws Exception 
	{
		ModelAndView model = new ModelAndView("home");
		model.addObject("message", "Hello! We are coming to rock you");
 
		return model;
	}
}
