package com.hackathon.userservice.Service;

import java.util.Date;

import com.hackathon.userservice.entity.Users;
import com.hackathon.userservice.repsonse.UserResponse;

public interface UserService {
	public String addNewUser(Users user);
	public UserResponse getByUsername(String username) ;
	public void getByDate(Date date);//implementation during integration
}
