package com.hackathon.userservice.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Event {
		private String eventId;
		private String exhibitionTitle; 
		private String exhibitionDescription; 
		private String exhibitionAddress;
		private LocalDate startDate;
		private LocalDate endDate;
}

