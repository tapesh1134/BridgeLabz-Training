
import java.util.Arrays;
import java.util.List;

public class StockPriceLogger {

    public static void main(String[] args) {
        List<Double> stockPrices = Arrays.asList(1023.50, 1025.75, 1018.20, 1030.10);

        stockPrices.stream()
            .forEach(n -> System.out.println("Stock price: $" + n));
    }
}
