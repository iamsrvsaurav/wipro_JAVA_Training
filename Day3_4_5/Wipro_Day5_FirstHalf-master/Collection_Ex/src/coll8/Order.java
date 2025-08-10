package coll8;

public class Order {
	private int orderId;
	private String customerName;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int orderId, String customerName) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
}
