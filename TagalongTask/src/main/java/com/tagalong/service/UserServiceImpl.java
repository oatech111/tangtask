package com.tagalong.service;

import java.util.HashMap;
import java.util.Map;

import com.tagalong.errorhandling.CustomException;

public class UserServiceImpl implements IUserService{

	@Override
	public Map<String, String> getData() throws CustomException{
		
          try{
			
			Map<String,String> emailpass=new HashMap<>();
			
			return emailpass;	
		}catch (Exception e) {
			e.getMessage();
		}
		return new HashMap<String, String>();
	}

	@Override
	public Map<String, String> postData() throws CustomException{
            try{
			
			Map<String,String> user=new HashMap<>();
			
			return user;	
		}catch (Exception e) {
			e.getMessage();
		}
		
		return new HashMap<String, String>();
	
	}

}
