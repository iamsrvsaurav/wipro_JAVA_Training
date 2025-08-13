package com.example.resturant_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.resturant_service.entity.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {}

