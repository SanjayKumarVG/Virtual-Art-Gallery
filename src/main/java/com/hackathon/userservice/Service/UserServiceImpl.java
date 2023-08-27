package com.hackathon.userservice.Service;

import java.util.Date;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.userservice.entity.Users;
import com.hackathon.userservice.exceptoin.UserException;
import com.hackathon.userservice.repository.UserRepo;
import com.hackathon.userservice.repsonse.UserResponse;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;

	public String addNewUser(Users user) {
		
		try {
		userRepo.save(user);
		return "success";
		}
		catch(Exception e)
		{
			throw new UserException("Unable to add new user");
		}
		
	}

	public UserResponse getByUsername(String username) {
		
		try {
		Users user=userRepo.getByEmail(username);
		UserResponse userResponse = new UserResponse();
		userResponse.setAddress(user.getAddress());
		userResponse.setEmail(user.getEmail());
		userResponse.setLastName(user.getLastName());
		userResponse.setFirstName(user.getFirstName());
		userResponse.setMobileNumber(user.getMobileNumber());
		return userResponse;
		}
		catch(NullPointerException e) {
			throw new UserException("User doesn't exist,enter correct username");
		}
		catch(Exception e) {
			throw new UserException("Unable to find account");
		}
	}

	public void getByDate(Date date) {
		
//		userRepo.getByDate(date);
		
	}

}
