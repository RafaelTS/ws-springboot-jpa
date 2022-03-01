package com.example.wsspringbootjpa.repositories;

import com.example.wsspringbootjpa.entities.Order;
import com.example.wsspringbootjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
