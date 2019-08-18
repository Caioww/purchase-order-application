package com.purchaseorder.purchaseorderapplication.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.purchaseorder.purchaseorderapplication.document.Users;

public interface UsersRepository extends MongoRepository<Users, Integer> {

}
