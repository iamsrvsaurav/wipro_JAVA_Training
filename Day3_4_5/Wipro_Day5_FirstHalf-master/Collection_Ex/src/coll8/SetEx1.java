package coll8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {
		/*Set set = new HashSet();
		set.add(new Order(1,"Smith"));
		set.add(new Order(2,"Alex"));
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Order o = (Order)itr.next();
			System.out.println(o.getOrderId()+","+o.getCustomerName());
		}*/
		
		Set<Order> set = new HashSet<>();
		set.add(new Order(1,"Smith"));
		set.add(new Order(2,"Alex"));
		Iterator<Order> itr = set.iterator();
		while(itr.hasNext()) {
			Order o = itr.next();
			System.out.println(o.getOrderId()+","+o.getCustomerName());
		}

	}

}
