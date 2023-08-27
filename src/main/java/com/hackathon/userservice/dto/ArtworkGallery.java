package com.hackathon.userservice.dto;

import java.util.Date;
import java.util.List;

import com.hackathon.userservice.entity.Users;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArtworkGallery {
	
    private int id; 
    private String title;
    private String description; 
    private String length;
    private String width;
    private String height;
    private String imgName;
    private String imgUrl;
    private Users createdBy;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    private boolean isActive; 
    private Double imgPrice; 
    private boolean isSold;
//    private List<GalleryLikeDislike> galleryLikeDislike;
//    private List<GalleryComment> galleryComments;
}
