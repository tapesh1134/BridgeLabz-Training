import java.util.Scanner;

public class Circle {
	double radius;

	public Circle() {
		this(1.0);
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double areaOfcircle() {
		return Math.PI * Math.pow(radius, 2);
	}

	public void cicleInfo() {
		System.out.printf("Circle radius %.2f and area is %.2f", radius, areaOfcircle());
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter radius of circle: ");
		double radius = scanner.nextDouble();
		Circle circle = new Circle(radius);
		circle.cicleInfo();
		scanner.close();
	}
}
