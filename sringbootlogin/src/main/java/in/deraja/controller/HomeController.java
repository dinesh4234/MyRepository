package in.deraja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController
{
   @RequestMapping("/")
	public String firstpage()
	{
		return"index";
	}
	@RequestMapping("/log")
   public String logincheck(@RequestParam("uname")String un,@RequestParam("pass")String ps)
   {
	return "success";
	   
   }
   
}
