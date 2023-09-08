package com.stylebypratham.service;

import java.util.List;

import com.stylebypratham.exception.ProductException;
import com.stylebypratham.modal.Review;
import com.stylebypratham.modal.User;
import com.stylebypratham.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
