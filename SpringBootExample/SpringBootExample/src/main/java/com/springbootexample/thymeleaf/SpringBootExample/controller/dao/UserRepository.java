package com.springbootexample.thymeleaf.SpringBootExample.controller.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootexample.thymeleaf.SpringBootExample.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}



