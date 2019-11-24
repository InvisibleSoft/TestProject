package com.invisiblesoft.testProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("shopping")
public class ShoppingController {
	
	@GetMapping("members")
	public String welcome()
	{
		return "Welcome to all Members";
	}

}
