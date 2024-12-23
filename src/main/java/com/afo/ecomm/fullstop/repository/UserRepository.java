package com.afo.ecomm.fullstop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.afo.ecomm.fullstop.model.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User, Integer>{

}
