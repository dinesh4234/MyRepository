package in.deraja.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {
	/*
	 * 
	 * //@RequestMapping public String prelogin() { return "welcome"; }
	 */
	
	@Value(value="${cjc.msg}")
	private String messege;
	
	@RequestMapping("/")
	public String prelogin()
	{
		return messege;
		
	}

}
