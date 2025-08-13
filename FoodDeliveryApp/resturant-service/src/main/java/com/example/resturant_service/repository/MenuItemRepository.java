package com.example.resturant_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.resturant_service.entity.MenuItem;
import com.sun.tools.javac.util.List;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
    java.util.List<MenuItem> findByRestaurantId(Long restaurantId);
}