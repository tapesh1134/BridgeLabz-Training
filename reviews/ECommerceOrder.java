
import java.util.*;

class Product {

    private int productId;
    private String category;
    private String name;
    private int price;

    public Product(int productId, String category, String name, int price) {
        this.productId = productId;
        this.category = category;
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void addProduct(List<Product> catelog, Product p) {
        catelog.add(p);
    }

    public void getCatelog(List<Product> catelog) {
        System.out.println("Product Catelog");
        for (int i = 0; i < catelog.size(); i++) {
            catelog.get(i).getProductInfo();
        }
    }

    public void getProductInfo() {
        System.out.println("\nProduct Id: " + productId);
        System.out.println("Category: " + category);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

class Customer {

    private String name;
    private String phone;
    private int age;

    public Customer(String name, String phone, int age) {
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public void getCustomerInfo() {
        System.out.println("\nCustomer information");
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Age: " + age);
    }
}

interface Payment {

    void paymentWith(String method);
}

class Order implements Payment {

    private int orderId;
    private Customer customer;
    private List<Product> products;
    private String paymentMethod;

    public Order(int orderId, Customer customer, List<Product> products) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = products;
        this.paymentMethod = "none";
        System.out.println("Order Placed");
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public int getOrderId() {
        return orderId;
    }

    public void paymentWith(String method) {
        paymentMethod = method;
        System.out.println("Payment done!");
    }

    public void getOrderInfo() {
        System.out.println("\nOrder information");
        System.out.println("OrderId: " + orderId);
        customer.getCustomerInfo();
        System.out.println("Order List");
        int total = 0;
        for (int i = 0; i < products.size(); i++) {
            products.get(i).getProductInfo();
            total += products.get(i).getPrice();
        }
        System.out.println("Total order price: " + total);
        System.out.println("Payment method: " + paymentMethod);
    }
}

public class ECommerceOrder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        Product product = new Product(0, null, null, 0);
        Product p1 = new Product(1, "Electronics", "TV", 20000);
        Product p2 = new Product(2, "Electronics", "Phone", 22000);
        Product p3 = new Product(3, "Furniture", "Sofa", 10000);
        Product p4 = new Product(4, "Groceries", "Salt", 20);
        Product p5 = new Product(5, "Groceries", "Masala", 100);
        product.addProduct(products, p1);
        product.addProduct(products, p2);
        product.addProduct(products, p3);
        product.addProduct(products, p4);
        product.addProduct(products, p5);
        System.out.println();
        Customer c1 = new Customer("Tapesh", "567898765456", 21);
        HashMap<Integer, Order> orders = new HashMap<>();
        int orderId = 1;
        while (true) {
            Order o = new Order(-1, null, null);
            Stack<Order> st = new Stack<>();
            System.out.println("Welcome to E-commerce");
            System.out.println("Press 1 for product catelog");
            System.out.println("Press 2 for Order");
            System.out.println("Press 3 for Order Information");
            System.out.println("Press 4 for repeat last order");
            System.out.println("Press 5 for Exit");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    product.getCatelog(products);
                    break;
                case 2:
                    System.out.print("\nEnter product Id for add product: ");
                    List<Product> pList = new ArrayList<>();
                    while (true) {
                        System.out.println("Enter -1 for exit");
                        System.out.println("Enter product Id");
                        int pId = sc.nextInt();
                        if (pId == -1) {
                            break;
                        }
                        pList.add(products.get(pId));
                    }
                    Order order = new Order(orderId, c1, pList);
                    orders.put(order.getOrderId(), order);
                    System.out.println("Payment method (card,upi,wallet)");
                    String pMethod = sc.next();
                    order.paymentWith(pMethod);
                    order.getOrderInfo();
                    st.add(order);
                    orderId++;
                    break;
                case 3:
                    int oId = sc.nextInt();
                    orders.get(oId).getOrderInfo();
                    break;
                case 4:
                    orders.put(orderId, st.peek());
                    break;
                case 5:
                    break;
            }
            break;
        }
    }
}
