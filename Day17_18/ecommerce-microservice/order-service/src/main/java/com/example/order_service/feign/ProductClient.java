package com.example.order_service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.order_service.dto.ProductDTO;

@FeignClient(name="product-service", url="http://localhost:1111")
public interface ProductClient {
	
	@GetMapping("/api/products/{id}")
	ProductDTO getProductById(@PathVariable Long id );

}
