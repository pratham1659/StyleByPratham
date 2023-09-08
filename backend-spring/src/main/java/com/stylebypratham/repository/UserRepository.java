package com.stylebypratham.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.stylebypratham.modal.User;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findByEmail(String email);

}
