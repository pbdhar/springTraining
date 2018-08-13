package com.springboot.maven.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.maven.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {

		//provide us with the all methods of crud operation
}
