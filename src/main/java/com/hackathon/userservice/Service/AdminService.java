package com.hackathon.userservice.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.hackathon.userservice.dto.Event;
import com.hackathon.userservice.repsonse.ListResponse;

public interface AdminService {
	public ResponseEntity<ListResponse<List<Event>>> getAllEvents() ;
}
