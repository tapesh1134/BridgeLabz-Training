import java.util.Scanner;

class Circle {
	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	public void areaCircle() {
		System.out.printf("Area of circle: %.4f", (Math.PI * radius * radius));
	}

	public void circumferenceCircle() {
		System.out.printf("\nCircumference of circle: %.4f ", (2 * Math.PI * radius));
	}
}

public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter radius of circle: ");
		double radius = scanner.nextDouble();
		Circle circle = new Circle(radius);
		circle.areaCircle();
		circle.circumferenceCircle();
		scanner.close();
	}
}
