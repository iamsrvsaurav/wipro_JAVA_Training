package service;



import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CartValidatorImpl implements CartValidator {

    private static final Map<String, List<String>> carts = new HashMap<>();

    static {
        carts.put("CART001", Arrays.asList("item1", "item3"));  // Valid cart
        carts.put("CART002", Arrays.asList("item2"));           // Item out of stock
        carts.put("CART003", null);                              // Invalid cart
    }

    @Override
    public boolean validateCart(String cartId) {
        List<String> items = carts.get(cartId);
        return items != null && !items.isEmpty();
    }

    // Expose cart items for the OrderService to check inventory
    public List<String> getItemsForCart(String cartId) {
        return carts.get(cartId);
    }
}
