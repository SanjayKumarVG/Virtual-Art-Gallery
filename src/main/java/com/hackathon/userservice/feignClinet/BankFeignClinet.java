package com.hackathon.userservice.feignClinet;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.hackathon.userservice.dto.TransactionEntity;
import com.hackathon.userservice.dto.WithdrawlDetailsDto;
import com.hackathon.userservice.exceptoin.AccountDoesNotExistsException;
import com.hackathon.userservice.exceptoin.ErrorModel;
import com.hackathon.userservice.exceptoin.GreaterThanCurrentBalanceException;
import com.hackathon.userservice.repsonse.TransactionResponse;

import jakarta.validation.Valid;

@FeignClient(name="bank-service",path="/bank/transaction")
public interface BankFeignClinet {

	@PostMapping(value="/withdrawl")
	public ResponseEntity<TransactionResponse<WithdrawlDetailsDto, ErrorModel>>
	withdrawlAmount(@Valid @RequestBody TransactionEntity transaction) 
			throws AccountDoesNotExistsException, GreaterThanCurrentBalanceException;
			
}
