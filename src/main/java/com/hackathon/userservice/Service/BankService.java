package com.hackathon.userservice.Service;

import org.springframework.http.ResponseEntity;

import com.hackathon.userservice.dto.TransactionEntity;
import com.hackathon.userservice.dto.WithdrawlDetailsDto;
import com.hackathon.userservice.exceptoin.AccountDoesNotExistsException;
import com.hackathon.userservice.exceptoin.ErrorModel;
import com.hackathon.userservice.exceptoin.GreaterThanCurrentBalanceException;
import com.hackathon.userservice.repsonse.TransactionResponse;

import jakarta.validation.Valid;

public interface BankService {
	public ResponseEntity<TransactionResponse<WithdrawlDetailsDto, ErrorModel>> 
	buy(@Valid TransactionEntity transaction)throws AccountDoesNotExistsException,GreaterThanCurrentBalanceException ;
}
