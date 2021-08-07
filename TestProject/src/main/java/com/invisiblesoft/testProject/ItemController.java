package com.invisiblesoft.testProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invisiblesoft.testProject.model.Item;

@RestController
public class ItemController {
	
	//This is comment in getItemMethod
	//Second Commit
	
	@GetMapping("items")
	public Item getItem()
	{
		
		return new Item(1,"Ball",10,100);
	}

}
