package com.stylebypratham.backendspring.repository;

import com.stylebypratham.backendspring.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
