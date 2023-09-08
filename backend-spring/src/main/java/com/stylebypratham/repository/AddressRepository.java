package com.stylebypratham.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stylebypratham.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
