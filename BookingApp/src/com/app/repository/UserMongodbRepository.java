package com.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.mdata.User;

public interface UserMongodbRepository extends MongoRepository<User, Integer> {
	
	public User findByFirstName(String firstName);

}
