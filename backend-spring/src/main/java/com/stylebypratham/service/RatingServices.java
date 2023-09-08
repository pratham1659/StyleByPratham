package com.stylebypratham.service;

import java.util.List;

import com.stylebypratham.exception.ProductException;
import com.stylebypratham.modal.Rating;
import com.stylebypratham.modal.User;
import com.stylebypratham.request.RatingRequest;

public interface RatingServices {

    public Rating createRating(RatingRequest req, User user) throws ProductException;

    public List<Rating> getProductsRating(Long productId);

}
