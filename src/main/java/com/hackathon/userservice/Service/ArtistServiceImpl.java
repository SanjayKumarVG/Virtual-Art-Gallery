package com.hackathon.userservice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.userservice.dto.GalleryLikeDislike;
import com.hackathon.userservice.feignClinet.ArtistFeignClient;

@Service
public class ArtistServiceImpl {
	
	@Autowired
	private ArtistFeignClient artistFeignClient;

	public void like(GalleryLikeDislike galleryLikeDislike) {
		
		artistFeignClient.addLikeDislike(galleryLikeDislike);
		
	}
	
	

}
