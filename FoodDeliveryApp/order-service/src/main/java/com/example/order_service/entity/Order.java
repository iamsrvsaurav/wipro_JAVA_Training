package com.example.order_service.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders_Table")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long customerId;
    private Long restaurantId;
    private String status;  // e.g. "PLACED", "PREPARING", "COMPLETED"

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private List<OrderItems> items;
    
 // ----- Constructors -----
	/*
	 * public Order() { }
	 * 
	 * public Order(Long id, Long customerId, Long restaurantId, String status,
	 * List<OrderItems> items) { this.id = id; this.customerId = customerId;
	 * this.restaurantId = restaurantId; this.status = status; this.items = items; }
	 */

    // ----- Getters -----
    public Long getId() {
        return id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public String getStatus() {
        return status;
    }

    public List<OrderItems> getItems() {
        return items;
    }

    // ----- Setters -----
    public void setId(Long id) {
        this.id = id;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setItems(List<OrderItems> items) {
        this.items = items;
    }

    
    
}

