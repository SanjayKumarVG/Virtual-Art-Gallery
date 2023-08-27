package com.hackathon.userservice.repsonse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
		

	private String email;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String address;

}
