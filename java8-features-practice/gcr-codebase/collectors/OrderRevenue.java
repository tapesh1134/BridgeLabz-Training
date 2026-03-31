
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Order {

    String customer;
    double total;

    Order(String customer, double total) {
        this.customer = customer;
        this.total = total;
    }

    public String getCustomer() {
        return customer;
    }

    public double getTotal() {
        return total;
    }
}

public class OrderRevenue {

    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order("Alice", 250.0),
                new Order("Bob", 300.0),
                new Order("Alice", 150.0),
                new Order("Bob", 200.0),
                new Order("Charlie", 400.0)
        );

        Map<String, Double> revenueMap = orders
                .stream()
                .collect(
                        Collectors.groupingBy(Order::getCustomer, Collectors.summingDouble(Order::getTotal)
                        )
                );

        System.out.println(revenueMap);
    }
}
