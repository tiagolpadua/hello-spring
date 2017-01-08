package hello.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloController {
	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
	public ModelAndView hello(
			@RequestParam(value = "name", required = false, defaultValue = "John Doe") String name) {

		ModelAndView modelAndView = new ModelAndView("greetings");
		modelAndView.addObject("message", "Hello " + name);

		return modelAndView;
	}

}