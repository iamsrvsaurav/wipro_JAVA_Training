package coll8;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {

	public static void main(String[] args) {
		Map<Order,Product> m = new HashMap<>();
		m.put(new Order(101,"Smith"),
				new Product(2001,"Mobile"));
		m.put(new Order(102,"Alex"),
				new Product(2002,"Charger"));
		m.put(new Order(103,"Alien"),
				new Product(2003,"Bluetooth"));
		
		for(Map.Entry<Order,Product> x : m.entrySet()) {
			Order o = x.getKey();
			Product p = x.getValue();
			System.out.println(o.getOrderId()+","+o.getCustomerName());
			System.out.println(p.getProductId()+","+p.getProductName());
			
		}
		

	}

}
