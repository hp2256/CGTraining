package com.hp.springbootdata.A3Q7;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrdersRepository extends MongoRepository<Orders, Integer> {

}
