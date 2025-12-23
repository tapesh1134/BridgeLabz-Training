
import java.util.Scanner;

public class NumberChecker {

	public static int countDigits(int number) {
		int count = 0;
		while (number != 0) {
			count++;
			number /= 10;
		}
		return count;
	}

	public static int[] storeDigits(int number) {
		int count = countDigits(number);
		int[] digits = new int[count];

		for (int i = count - 1; i >= 0; i--) {
			digits[i] = number % 10;
			number /= 10;
		}
		return digits;
	}

	public static int sumOfDigits(int[] digits) {
		int sum = 0;
		for (int d : digits) {
			sum += d;
		}
		return sum;
	}

	public static int sumOfSquares(int[] digits) {
		int sum = 0;
		for (int d : digits) {
			sum += Math.pow(d, 2);
		}
		return sum;
	}

	public static int[] reverseArray(int[] arr) {
		int[] rev = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
			rev[i] = arr[arr.length - 1 - i];
		return rev;
	}

	public static boolean compareArrays(int[] a, int[] b) {
		if (a.length != b.length)
			return false;

		for (int i = 0; i < a.length; i++)
			if (a[i] != b[i])
				return false;

		return true;
	}

	public static int[][] digitFrequency(int[] digits) {
		int[][] freq = new int[10][2];

		for (int i = 0; i < 10; i++)
			freq[i][0] = i;

		for (int d : digits)
			freq[d][1]++;

		return freq;
	}

	public static boolean isDuckNumber(int[] digits) {
		for (int digit : digits) {
			if (digit != 0) {
				return true;
			}
		}
		return false;
	}

	public static boolean isArmstrongNumber(int number, int[] digits) {
		int sum = 0;
		int power = digits.length;

		for (int digit : digits) {
			sum += Math.pow(digit, power);
		}
		return sum == number;
	}

	public static boolean isHarshad(int num, int[] digits) {
		return num % sumOfDigits(digits) == 0;
	}

	public static boolean isPalindrome(int[] digits) {
		int i = 0, j = digits.length - 1;
		while (i < j) {
			if (digits[i] != digits[j]) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static boolean isNeon(int num) {
		int square = num * num;
		int sum = 0;

		while (square != 0) {
			sum += square % 10;
			square /= 10;
		}
		return sum == num;
	}

	public static boolean isSpy(int[] digits) {
		int sum = 0, product = 1;
		for (int d : digits) {
			sum += d;
			product *= d;
		}
		return sum == product;
	}

	public static boolean isAutomorphic(int num) {
		int square = num * num;
		return String.valueOf(square).endsWith(String.valueOf(num));
	}

	public static boolean isBuzz(int num) {
		return num % 7 == 0 || num % 10 == 7;
	}

	public static boolean isStrong(int num) {
		int[] digits = storeDigits(num);
		int sum = 0;

		for (int d : digits)
			sum += factorial(d);

		return sum == num;
	}

	private static int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++)
			fact *= i;
		return fact;
	}

	public static boolean isPrime(int num) {
		if (num <= 1)
			return false;

		for (int i = 2; i <= Math.sqrt(num); i++)
			if (num % i == 0)
				return false;

		return true;
	}

	public static void findLargestAndSecondLargest(int[] digits) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int digit : digits) {
			if (digit > largest) {
				secondLargest = largest;
				largest = digit;
			} else if (digit > secondLargest && digit != largest) {
				secondLargest = digit;
			}
		}

		System.out.println("Largest Digit: " + largest);
		System.out.println("Second Largest Digit: " + secondLargest);
	}

	public static void findSmallestAndSecondSmallest(int[] digits) {
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		for (int digit : digits) {
			if (digit < smallest) {
				secondSmallest = smallest;
				smallest = digit;
			} else if (digit < secondSmallest && digit != smallest) {
				secondSmallest = digit;
			}
		}

		System.out.println("Smallest Digit: " + smallest);
		System.out.println("Second Smallest Digit: " + secondSmallest);
	}

	public static int[] findFactors(int num) {
		int count = 0;

		for (int i = 1; i <= num; i++)
			if (num % i == 0)
				count++;

		int[] factors = new int[count];
		int index = 0;

		for (int i = 1; i <= num; i++)
			if (num % i == 0)
				factors[index++] = i;

		return factors;
	}

	public static int greatestFactor(int[] factors) {
		int max = Integer.MIN_VALUE;
		for (int f : factors)
			if (f > max)
				max = f;
		return max;
	}

	public static int sumOfFactors(int[] factors) {
		int sum = 0;
		for (int f : factors)
			sum += f;
		return sum;
	}

	public static int productOfFactors(int[] factors) {
		int product = 1;
		for (int f : factors)
			product *= f;
		return product;
	}

	public static double productOfCubeOfFactors(int[] factors) {
		double product = 1;
		for (int f : factors)
			product *= Math.pow(f, 3);
		return product;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		int digitCount = countDigits(number);
		int[] digits = storeDigits(number);
		System.out.println("Number: " + number);
		System.out.println("Count of Digits: " + digitCount);
		System.out.print("Digits Array: ");
		for (int d : digits) {
			System.out.print(d + " ");
		}
		System.out.println();
		System.out.printf("Is Duck Number: %d", isDuckNumber(digits));
		System.out.printf("Is Armstrong Number: %d", isArmstrongNumber(number, digits));
		findLargestAndSecondLargest(digits);
		findSmallestAndSecondSmallest(digits);
		scanner.close();
	}
}
