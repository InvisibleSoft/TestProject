package com.invisiblesoft.testProject;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import jdk.net.SocketFlow.Status;

@RunWith(SpringRunner.class)
@WebMvcTest(ItemController.class)
public class HelloWorldControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	
	@Test
	public void getItem() throws Exception {
		RequestBuilder request = MockMvcRequestBuilders.get("/items")
				.accept(MediaType.APPLICATION_JSON);
		 //MvcResult result = mockMvc.perform(request).andReturn();
		 
		 MvcResult result = mockMvc.perform(request)
				 .andExpect(status().isOk())
				 //.andExpect(content().string("Hello World"))
	.andExpect(content().json("\r\n" + 
			"{\"id\":1,\"name\":\"Ball\",\"price\":10,\"quantity\":100}"))
				 .andReturn();
		 
		 //assertEquals("Hello World", result.getResponse().getContentAsString());
		 
	}

}
