package com.hackathon.userservice.exceptoin;

@SuppressWarnings("serial")
public class UserException extends RuntimeException{
	
	public UserException(String err) {
		super(err);
//		System.err.println(err);
	}

}
