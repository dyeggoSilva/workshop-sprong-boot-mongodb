package com.dy.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dy.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
