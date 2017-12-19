package com.myblog.blogger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myblog.blogger.model.Login;
import com.myblog.blogger.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	private LoginRepository loginRepo;
	
	
	public void registerUserData(Login loginData)
	{
		this.loginRepo.save(loginData);
	}
}
