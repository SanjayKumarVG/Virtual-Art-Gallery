package com.hackathon.userservice.repsonse;

import com.hackathon.userservice.exceptoin.ErrorModel;
import lombok.Data;

@Data
public class ListResponse<T> {
	private String status;
	private T data;
	private ErrorModel error;
}
