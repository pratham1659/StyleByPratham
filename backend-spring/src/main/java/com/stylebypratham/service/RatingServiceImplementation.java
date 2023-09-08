package com.stylebypratham.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.stylebypratham.exception.ProductException;
import com.stylebypratham.modal.Product;
import com.stylebypratham.modal.Rating;
import com.stylebypratham.modal.User;
import com.stylebypratham.repository.RatingRepository;
import com.stylebypratham.request.RatingRequest;

@Service
public class RatingServiceImplementation implements RatingServices {

    private RatingRepository ratingRepository;
    private ProductService productService;

    public RatingServiceImplementation(RatingRepository ratingRepository, ProductService productService) {
        this.ratingRepository = ratingRepository;
        this.productService = productService;
    }

    @Override
    public Rating createRating(RatingRequest req, User user) throws ProductException {

        Product product = productService.findProductById(req.getProductId());

        Rating rating = new Rating();
        rating.setProduct(product);
        rating.setUser(user);
        rating.setRating(req.getRating());
        rating.setCreatedAt(LocalDateTime.now());

        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getProductsRating(Long productId) {
        return ratingRepository.getAllProductsRating(productId);
    }


}
