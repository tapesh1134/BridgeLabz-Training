
class DivisionByZeroException extends Exception {

    DivisionByZeroException(String message) {
        super(message);
    }
}

public class DivisionByZero {

    static int divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Division by zero found");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println(result);
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}
