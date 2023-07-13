package com.javatutorials.Springboot.dao;

import com.javatutorials.Springboot.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CustomerDAO extends CrudRepository<Customer,Integer> {
    @Override
    List<Customer> findAll();
}
