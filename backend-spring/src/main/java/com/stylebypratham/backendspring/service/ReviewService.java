package com.stylebypratham.backendspring.service;

import com.stylebypratham.backendspring.exception.ProductException;
import com.stylebypratham.backendspring.model.Review;
import com.stylebypratham.backendspring.model.User;
import com.stylebypratham.backendspring.request.ReviewRequest;

import java.util.List;

public interface ReviewService {

    public Review createReview(ReviewRequest req, User user) throws ProductException;

    public List<Review> getAllReview(Long productId);


}
