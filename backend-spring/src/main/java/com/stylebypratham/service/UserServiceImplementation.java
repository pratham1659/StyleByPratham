package com.stylebypratham.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.stylebypratham.config.JwtTokenProvider;
import com.stylebypratham.exception.UserException;
import com.stylebypratham.modal.User;
import com.stylebypratham.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService {

    private UserRepository userRepository;
    private JwtTokenProvider jwtTokenProvider;

    public UserServiceImplementation(UserRepository userRepository, JwtTokenProvider jwtTokenProvider) {

        this.userRepository = userRepository;
        this.jwtTokenProvider = jwtTokenProvider;

    }

    @Override
    public User findUserById(Long userId) throws UserException {
        Optional<User> user = userRepository.findById(userId);

        if (user.isPresent()) {
            return user.get();
        }
        throw new UserException("User not found with id " + userId);
    }

    @Override
    public User findUserProfileByJwt(String jwt) throws UserException {
        System.out.println("User service");
        String email = jwtTokenProvider.getEmailFromJwtToken(jwt);

        System.out.println("Email" + email);

        User user = userRepository.findByEmail(email);


        if (user == null) {
            throw new UserException("User not exist with email " + email);
        }
        System.out.println("Email user" + user.getEmail());
        return user;
    }

}
