package com.hackathon.userservice.repsonse;
import java.util.Map;
import lombok.Data;
@Data
public class Response<T> {
	private String status;
	private T data;
	private Map<String,String> errors;
}
