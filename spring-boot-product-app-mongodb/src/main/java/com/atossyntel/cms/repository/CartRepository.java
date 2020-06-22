package com.atossyntel.cms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.atossyntel.cms.model.Cart;


@Repository
public interface CartRepository extends MongoRepository<Cart, Integer> {

}
