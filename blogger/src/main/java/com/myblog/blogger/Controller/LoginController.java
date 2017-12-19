package com.myblog.blogger.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myblog.blogger.model.Login;
import com.myblog.blogger.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired 
	private LoginService logService;
	
	@PostMapping("/register")
	public void registerUser(Login loginData)
	{
		this.logService.registerUserData(loginData);
	}
@GetMapping("/test")
public String testData()
{
	return "Working fine!!!";
}
}
