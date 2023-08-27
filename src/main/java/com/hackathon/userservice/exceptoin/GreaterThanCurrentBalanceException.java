package com.hackathon.userservice.exceptoin;
public class GreaterThanCurrentBalanceException extends Exception {
	private static final long serialVersionUID = 1L;
	public GreaterThanCurrentBalanceException(String message) {
		super(message);
	}
}
