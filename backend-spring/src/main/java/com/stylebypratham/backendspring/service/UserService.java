package com.stylebypratham.backendspring.service;


import com.stylebypratham.backendspring.exception.UserException;
import com.stylebypratham.backendspring.model.User;
import jdk.jshell.spi.ExecutionControl;

public interface UserService {

    public User findUserById(Long userId) throws UserException;
    public User findUserProfileByJwt(String jwt) throws UserException;

}
