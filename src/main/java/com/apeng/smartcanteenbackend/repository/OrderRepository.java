package com.apeng.smartcanteenbackend.repository;

import com.apeng.smartcanteenbackend.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
