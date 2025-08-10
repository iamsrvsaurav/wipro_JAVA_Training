package coll8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx1 {

	public static void main(String[] args) {
		/*List list = new ArrayList();
		list.add(new Order(101,"Scott"));
		list.add(new Order(102,"Miller"));
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			Order o = (Order)itr.next();
			System.out.println(o.getOrderId()+","+o.getCustomerName());
		}*/
		
		List<Order> list = new ArrayList<>();
		list.add(new Order(101,"Scott"));
		list.add(new Order(102,"Miller"));
		Iterator<Order> itr = list.iterator();
		while(itr.hasNext()) {
			Order o = itr.next();
			System.out.println(o.getOrderId()+","+o.getCustomerName());
		}

	}

}
