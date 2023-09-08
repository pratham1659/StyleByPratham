package com.stylebypratham.backendspring.service;

import com.stylebypratham.backendspring.exception.ProductException;
import com.stylebypratham.backendspring.model.Rating;
import com.stylebypratham.backendspring.model.User;
import com.stylebypratham.backendspring.request.RatingRequest;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RatingService {

    public Rating createRating(RatingRequest req, User user) throws ProductException;

    public List<Rating> getProductsRating(Long productId);

}
