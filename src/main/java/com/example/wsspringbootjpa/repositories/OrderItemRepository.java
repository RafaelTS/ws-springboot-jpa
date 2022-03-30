package com.example.wsspringbootjpa.repositories;

import com.example.wsspringbootjpa.entities.OrderItem;
import com.example.wsspringbootjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}
