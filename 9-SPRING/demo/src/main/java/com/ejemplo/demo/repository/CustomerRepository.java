package com.ejemplo.demo.repository;

import com.ejemplo.demo.entities.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository<Customers, Long> {}
