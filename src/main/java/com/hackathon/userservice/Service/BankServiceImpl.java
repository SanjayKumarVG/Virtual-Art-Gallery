package com.hackathon.userservice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hackathon.userservice.dto.TransactionEntity;
import com.hackathon.userservice.dto.WithdrawlDetailsDto;
import com.hackathon.userservice.exceptoin.AccountDoesNotExistsException;
import com.hackathon.userservice.exceptoin.ErrorModel;
import com.hackathon.userservice.exceptoin.GreaterThanCurrentBalanceException;
import com.hackathon.userservice.exceptoin.UserException;
import com.hackathon.userservice.feignClinet.BankFeignClinet;
import com.hackathon.userservice.repsonse.TransactionResponse;

import jakarta.validation.Valid;

@Service
public class BankServiceImpl implements BankService{
	
	
	@Autowired
	private BankFeignClinet bankFeignClient;

	public ResponseEntity<TransactionResponse<WithdrawlDetailsDto, ErrorModel>> 
	buy(@Valid TransactionEntity transaction)throws AccountDoesNotExistsException,GreaterThanCurrentBalanceException {
		

		return bankFeignClient.withdrawlAmount(transaction);
	}
	
}
