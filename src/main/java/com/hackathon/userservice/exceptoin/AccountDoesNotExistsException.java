package com.hackathon.userservice.exceptoin;

public class AccountDoesNotExistsException extends Exception {
	private static final long serialVersionUID = 1L;
	public AccountDoesNotExistsException(String message) {
		super(message);
	}
}
