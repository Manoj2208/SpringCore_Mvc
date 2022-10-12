package com.av;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home 
{
	@RequestMapping("/getdata")
	public ModelAndView getData()
	{
		ModelAndView modelAndView= new ModelAndView("mysweet.jsp");
		modelAndView.addObject("name","Hi manoj");
		return modelAndView;
	}
		
	
	@RequestMapping("/info")
	public ModelAndView post(){
		ModelAndView mav=new ModelAndView("mysweet.jsp");
		mav.addObject("manu", "hi darling");
		return mav;
	}
}

