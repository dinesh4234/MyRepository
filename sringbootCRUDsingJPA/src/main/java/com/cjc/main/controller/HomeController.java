package com.cjc.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.main.model.Student;
import com.cjc.main.service.HomeService;

@Controller
public class HomeController 
{
	@Autowired
	private HomeService hs;

	@RequestMapping("/")
	public String prelogin() 
	{
		return "index";

	}

	@RequestMapping("/register")
	public String preRegister() {
		return "register";

	}

	@RequestMapping("/reg")
	public String registerdata(@ModelAttribute Student s) {
		hs.saveData(s);

		return "index";

	}

	@RequestMapping("/login")
	public String logincheck(@RequestParam("uname") String un, @RequestParam("pass") String ps, ModelMap m) {

		Student s = hs.logincheck(un, ps);

		/*if (s != null) {
			
		}*/
		
		if(un.equals("admin")&&ps.equals("admin"))
		{
			List<Student> list = (List<Student>) hs.getAllData();

			System.out.println(list);

			m.addAttribute("data", list);
			return "success";

		}
		else
		{
			if(s!=null)
			{
			List<Student>slist=new ArrayList<Student>();
			slist.add(s);
			m.addAttribute("data", slist);
			
			return "success";
		    }
			System.out.println("wrong username and password");
			}
		
		return "index";
		
	}
			
	
	@RequestMapping("/delete")
	public String deletedata(@ModelAttribute Student s,ModelMap m)
	
	{
		hs.deletedata(s);
		Iterable<Student>list=hs.getAllData();
		m.addAttribute("data",list);
		return "success";
		
	}
    @RequestMapping("/edit")
	public String editdata(@RequestParam("id")int id,ModelMap m)
	{
		
		
		Student s=hs.editdata(id);
		
		m.addAttribute("data", s);
		
		return "edit";	
	}
    @RequestMapping("/update")
  public String updatedata(@ModelAttribute Student s,ModelMap m)
  {
    	
    	
	  hs.saveData(s);
	  
	  System.out.println("update data");
	  
	  Iterable<Student>list=hs.getAllData();
		m.addAttribute("data",list);
		return "success";
	
	  
  }@RequestMapping("/add")
    public  String adddata()
    {
		return "register";
    	
    }
}