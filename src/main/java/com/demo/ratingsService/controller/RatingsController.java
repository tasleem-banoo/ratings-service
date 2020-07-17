package com.demo.ratingsService.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ratingsService.entity.Ratings;
import com.demo.ratingsService.entity.UserRatings;

@RestController
public class RatingsController {

	@GetMapping("/user/rating/{userId}")
	public Ratings getUserRating (@PathVariable("userId") int userId) {
		
		return new Ratings(1,(double) 5);
	}
	
	@GetMapping("/user/ratings/{userId}")
	public UserRatings getUserRatings(@PathVariable("userId") int userId) {

		List<Ratings> ratings = Arrays.asList(new Ratings(1, 4.2), new Ratings(2, 4.5));
		UserRatings userRatings = new UserRatings();
		userRatings.setUserRatings(ratings);
		return userRatings;
	}
}
