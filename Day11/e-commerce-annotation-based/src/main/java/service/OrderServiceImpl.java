package service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderServiceImpl implements OrderService {

    @Autowired
    private InventoryService inventoryService;

    @Autowired
    private CartValidatorImpl cartValidator;

    @Override
    public String checkout(String cartId) {
        if (!cartValidator.validateCart(cartId)) {
            return "Cart is invalid";
        }

        List<String> items = cartValidator.getItemsForCart(cartId);

        for (String item : items) {
            if (!inventoryService.isAvailable(item)) {
                return "Item out of stock";
            }
        }

        // Here you can implement actual order placement logic
        return "Checkout successful for " + cartId;
    }
}

