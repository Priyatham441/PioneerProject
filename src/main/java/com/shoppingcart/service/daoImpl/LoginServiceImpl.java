package com.shoppingcart.service.daoImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingcart.dao.LoginDao;
import com.shoppingcart.service.dao.LoginService;

@Service("loginService")
@Transactional
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDao loginDao;
	
	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}
	
	@Override
	public boolean getLoginDetails(String name, String password) {
		return loginDao.getLoginDetails(name, password);
		
	}

	

}
