package com.masai.service.loginService;

import com.masai.exceptions.LoginException;
import com.masai.model.LoginDTO;

public interface LoginService {
	
	public String logIntoAccount(LoginDTO dto)throws LoginException;

	public String logOutFromAccount(String key)throws LoginException;

}
