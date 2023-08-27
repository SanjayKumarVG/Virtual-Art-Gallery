package com.hackathon.userservice.feignClinet;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.hackathon.userservice.dto.GalleryLikeDislike;

@FeignClient(name="artist-service",path="/artist/add/likedislike")
public interface ArtistFeignClient {

	
	@PostMapping("add/likedislike")
    public ResponseEntity<String> addLikeDislike(@RequestBody GalleryLikeDislike gallaryLikeDislike);
}
