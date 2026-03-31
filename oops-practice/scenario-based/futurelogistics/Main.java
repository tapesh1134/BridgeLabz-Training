
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Goods Transport details");
        String input = sc.next();
        Utility utility = new Utility();
        GoodsTransport goodsTransport = utility.parseDetails(input);
        if (goodsTransport == null) {
            System.out.println("Please provide a valid record");
            return;
        }
        System.out.println("Transport ID : " + goodsTransport.getTransportId());
        System.out.println("Date of transport : " + goodsTransport.getTransportDate());
        System.out.println("Rating of transport : " + goodsTransport.getTransportRating());
        if (goodsTransport instanceof TimberTransport) {
            System.out.println("Type of timber : " + ((TimberTransport) goodsTransport).getTimberType());
            System.out.println("Timber price per kg : " + ((TimberTransport) goodsTransport).getTimberPrice());
            System.out.println("Vehicle for transport : " + ((TimberTransport) goodsTransport).VehicleSelection());
            System.out.println("Total charge : " + ((TimberTransport) goodsTransport).CalculateTotalCharge());
        } else {
            System.out.println("Quantity of bricks : " + ((BrickTransport) goodsTransport).getBrickQuantity());
            System.out.println("Brick price : " + ((BrickTransport) goodsTransport).getBrickPrice());
            System.out.println("Vehicle for transport : " + ((BrickTransport) goodsTransport).VehicleSelection());
            System.out.println("Total charge : " + ((BrickTransport) goodsTransport).CalculateTotalCharge());
        }
    }
}
