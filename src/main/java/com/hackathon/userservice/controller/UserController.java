package com.hackathon.userservice.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.userservice.Service.AdminServiceImpl;
import com.hackathon.userservice.Service.ArtistServiceImpl;
import com.hackathon.userservice.Service.BankServiceImpl;
import com.hackathon.userservice.Service.UserServiceImpl;
import com.hackathon.userservice.dto.Event;
import com.hackathon.userservice.dto.GalleryLikeDislike;
import com.hackathon.userservice.dto.TransactionEntity;
import com.hackathon.userservice.dto.WithdrawlDetailsDto;
import com.hackathon.userservice.entity.Users;
import com.hackathon.userservice.exceptoin.AccountDoesNotExistsException;
import com.hackathon.userservice.exceptoin.ErrorModel;
import com.hackathon.userservice.exceptoin.GreaterThanCurrentBalanceException;
import com.hackathon.userservice.repsonse.ListResponse;
import com.hackathon.userservice.repsonse.TransactionResponse;
import com.hackathon.userservice.repsonse.UserResponse;



@RestController
public class UserController {
	
	
	@Autowired
	private UserServiceImpl userService;
	
	@Autowired
	private AdminServiceImpl adminService;
	
	@Autowired
	private BankServiceImpl bankService;
	
	@Autowired
	private ArtistServiceImpl artistService;

	//register new user
	@PostMapping(value="/addUser")
	public ResponseEntity<String> addUser(@RequestBody Users user) {
		return new ResponseEntity<String>(userService.addNewUser(user),HttpStatus.OK);
	}
	
	//get user by username
	@PostMapping(value="/getByUsername")
	public ResponseEntity<UserResponse> getUserByUsername(@RequestParam String username) {
		return new ResponseEntity<UserResponse>(userService.getByUsername(username),HttpStatus.OK); 
	}
	
	//call to admin for viewing all the events 
	@PostMapping(value="/getEvent")
	public ResponseEntity<ListResponse<List<Event>>> getAllByEventsDate() {
		return adminService.getAllEvents();
	}
	
	//get picture from curator 
	@PostMapping(value="/getpicture")
	public void getPicture() {
		
	}
	
	//call curator virtual tour(theme)
	@PostMapping(value="/virtualtour")   
	public void virtualtour() {
			
	}
	
	//add comments to the art post
	@PostMapping(value="comments")
	public void comments() {
		
	}
	
	//add like to the art post
	@PostMapping(value="/like")
	public void like(@RequestBody GalleryLikeDislike galleryLikeDislike) {
			artistService.like(galleryLikeDislike);
	}
	
	//buy art
	@PostMapping(value="/buyart")
	public void buyArt(@RequestBody TransactionEntity transaction)throws AccountDoesNotExistsException,GreaterThanCurrentBalanceException {
		bankService.buy(transaction);
	}
}
