package com.jpa.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpa.test.entities.user;

public interface userRepository extends CrudRepository<user, Integer>{

}
