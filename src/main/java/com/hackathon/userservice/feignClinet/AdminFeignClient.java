package com.hackathon.userservice.feignClinet;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.hackathon.userservice.dto.Event;
import com.hackathon.userservice.repsonse.ListResponse;

@FeignClient(name= "admin-service",path="/adminservice/admin")
public interface AdminFeignClient {
	
	@GetMapping(value="/getAllEvents")
	public ResponseEntity<ListResponse<List<Event>>> getAllByEventsDate();

}

