package com.hp.springbootdata.A3Q8;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrdersRepository extends MongoRepository<Product, Integer> {

}
