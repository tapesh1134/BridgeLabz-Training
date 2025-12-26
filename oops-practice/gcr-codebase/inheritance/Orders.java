class Order {
	int orderId;
	String orderDate;
	public Order(int orderId, String orderDate) {
		this.orderId = orderId;
		this.orderDate = orderDate;
	}
	public String getOrderStatus() {
		return "Order Placed";
	}
}

class ShippedOrder extends Order {
	String trackingNumber;
	public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
		super(orderId, orderDate);
		this.trackingNumber = trackingNumber;
	}
	@Override
	public String getOrderStatus() {
		return "Order Shipped tracking No: " + trackingNumber;
	}
}

class DeliveredOrder extends ShippedOrder {
	String deliveryDate;
	public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
		super(orderId, orderDate, trackingNumber);
		this.deliveryDate = deliveryDate;
	}
	@Override
	public String getOrderStatus() {
		return "Order Delivered on " + deliveryDate;
	}
}

public class Orders {
	public static void main(String[] args) {
		Order order = new Order(101, "2025-01-01");
		ShippedOrder shippedOrder = new ShippedOrder(102, "2025-01-11", "1");
		DeliveredOrder deliveredOrder = new DeliveredOrder(103, "2025-01-12", "TRK67890", "2025-01-15");
		System.out.println(order.getOrderStatus());
		System.out.println(shippedOrder.getOrderStatus());
		System.out.println(deliveredOrder.getOrderStatus());
	}
}
