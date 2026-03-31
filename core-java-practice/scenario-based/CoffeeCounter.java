import java.util.Scanner;

public class CoffeeCounter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("\nThe Coffee Counter Chronicles ☕");
			System.out.println("1. Espresso 200");
			System.out.println("2. Cappuccino 300");
			System.out.println("3. Mocha 275");
			System.out.println("4. Iced Coffee 190");
			System.out.println("5. Latte 400");
			System.out.print("Select your coffee type: ");
			int input = scanner.nextInt();
			System.out.print("Enter quantity: ");
			int quantity = scanner.nextInt();
			String coffeeName = "";
			int price = 0;
			switch (input) {
			case 1:
				coffeeName = "Espresso";
				price = 200;
				break;
			case 2:
				coffeeName = "Cappuccino";
				price = 300;
				break;
			case 3:
				coffeeName = "Mocha";
				price = 275;
				break;
			case 4:
				coffeeName = "Iced Coffees";
				price = 190;
				break;
			case 5:
				coffeeName = "Lattes";
				price = 400;
				break;
			default:
				System.out.println("Invalid coffee selection");
				continue;
			}
			int bill = price * quantity;
			double gst = bill * 0.05;
			System.out.printf("Type of coffee: %s%nQuantity: %d%nBill: %d%nGST: %.2f%nTotal Bill: %.2f%n%n", coffeeName,
					quantity, bill, gst, bill + gst);
			System.out.print("Exit or Reorder: ");
			String wantTOExit = scanner.next().toLowerCase();
			if (wantTOExit.equals("exit")) {
				System.out.println("Thank You");
				break;
			} else {
				System.out.println("Ordering for New costumer");
			}
		}
		scanner.close();
	}
}
