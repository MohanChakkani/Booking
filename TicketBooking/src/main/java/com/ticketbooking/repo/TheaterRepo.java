package com.ticketbooking.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ticketbooking.entity.Theater;


@Repository
public interface TheaterRepo extends JpaRepository<Theater, Integer> {
	@Query("SELECT t FROM Theatres t  WHERE LOWER(t.theatreName) like %:key% OR LOWER(t.location) like %:key%")
	public List<Theater> searchTheatresByKeyword(@Param("key")String keyword);
	//
	
	@Query("SELECT t.seatingCapacity FROM Theatres t  WHERE t.theatreId = :theatreId")
	public Long getTotalCapacity(@Param("theatreId")int theatreId);
}
