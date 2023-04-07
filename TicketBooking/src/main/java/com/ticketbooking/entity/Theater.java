package com.ticketbooking.entity;

import java.sql.Date;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Theater {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="theatre_id")
	 int theatreId;
	 @Column(name="theatre_name")
	 String theatreName;
	 @Column(name="location")
	 String location;
	 @Column(name="seating_capacity")
	 int seatingCapacity;
	 @Column(name="ticket_price")
	 double ticketPrice;
   

}
