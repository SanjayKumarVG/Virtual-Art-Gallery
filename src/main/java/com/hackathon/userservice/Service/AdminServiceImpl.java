package com.hackathon.userservice.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hackathon.userservice.dto.Event;
import com.hackathon.userservice.feignClinet.AdminFeignClient;
import com.hackathon.userservice.repsonse.ListResponse;


@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminFeignClient adminFeignClient;
	
	public ResponseEntity<ListResponse<List<Event>>> getAllEvents() {
//		 ResponseEntity<ListResponse<List<com.hackathon.userservice.dto.Event>>> responseEntity = adminFeignClient.getAllByEventsDate();
//	        return ResponseEntity.status(responseEntity.getStatusCodeValue()).body(responseEntity.getBody());
		return adminFeignClient.getAllByEventsDate();
		
	}

}
