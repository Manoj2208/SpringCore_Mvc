package com.manu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Calculate {
	@RequestMapping("calc")
	public ModelAndView getInfo(@RequestParam("d1") int a,@RequestParam("d2") int b){
		int c=a+b;
		ModelAndView mav=new ModelAndView();
		mav.setViewName("result.jsp");
		mav.addObject("res", c);
		return mav;
		
	}
	

}
