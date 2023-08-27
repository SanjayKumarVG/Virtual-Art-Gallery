package com.hackathon.userservice.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.hackathon.userservice.entity.Users;
import com.hackathon.userservice.repsonse.UserResponse;

import jakarta.transaction.Transactional;


public interface UserRepo extends JpaRepository<Users, Long>{
	
	@Query(value="select * from users where email=?1",nativeQuery = true)
	Users getByEmail(String username);
	
	

}
