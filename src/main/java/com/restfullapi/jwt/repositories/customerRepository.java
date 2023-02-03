package com.restfullapi.jwt.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.restfullapi.jwt.models.customer.customer;

@Repository
public interface customerRepository extends CrudRepository<customer, String> {

}
