package com.relation.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.relation.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
