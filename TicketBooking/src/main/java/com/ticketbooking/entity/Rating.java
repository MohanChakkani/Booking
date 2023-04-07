package com.ticketbooking.entity;

import java.sql.Date;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Rating {
	@Id
	@Column(name="rating_id")
	int ratingId;
	
	@Column(name="customer_id")
	String customerId;
	
	@ManyToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;
	
	@Column(name="rating")
	Double rating;
	
	@Column(name="review")
	String review;
    

}
