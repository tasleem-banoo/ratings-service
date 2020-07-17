package com.demo.ratingsService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ratings {

	private int userId;
	private double rating;
}
