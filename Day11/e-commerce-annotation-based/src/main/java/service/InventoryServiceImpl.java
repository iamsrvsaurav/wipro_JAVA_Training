package service;



import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class InventoryServiceImpl implements InventoryService {

    private static final Map<String, Boolean> inventory = new HashMap<>();

    static {
        inventory.put("item1", true);
        inventory.put("item2", false);
        inventory.put("item3", true);
    }

    @Override
    public boolean isAvailable(String itemId) {
        return inventory.getOrDefault(itemId, false);
    }
}

