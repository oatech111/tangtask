package com.tagalong.service;

import java.util.Map;

import com.tagalong.errorhandling.CustomException;



public interface IUserService {
	
	public Map<String,String> getData() throws CustomException;
	
	public Map<String,String> postData() throws CustomException;

}
