package mainApp;



import config.AppConfig;
import service.OrderService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService orderService = context.getBean(OrderService.class);

        System.out.println(orderService.checkout("CART001"));  // Output: Checkout successful for CART001
        System.out.println(orderService.checkout("CART002"));  // Output: Item out of stock
        System.out.println(orderService.checkout("CART003"));  // Output: Cart is invalid
        System.out.println(orderService.checkout("CART004"));  // Output: Cart is invalid (not found)
    }
}
