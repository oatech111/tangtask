package com.tagalong.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tagalong.entity.User;
import com.tagalong.errorhandling.CustomException;
import com.tagalong.service.IUserService;

@RestController
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@GetMapping("/getData/{email}/{password}")
	public Map<String,String> getData(@PathVariable("email")String email,
			@PathVariable("password") String password) throws CustomException{
		 Map<String,String> getData  =userService.getData();
		
	    return getData;
	}
	@PostMapping("/postData")
	public Map<String,String> createData(@RequestBody User user) throws CustomException {

		Map<String,String> postData  =userService.postData();
	
       return postData;
}
}
