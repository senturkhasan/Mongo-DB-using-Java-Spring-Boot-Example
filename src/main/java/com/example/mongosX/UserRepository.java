package com.example.mongosX;

import org.springframework.data.mongodb.repository.MongoRepository;
 
public interface UserRepository extends MongoRepository<User,String> {



}
