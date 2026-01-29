
interface SecurityUtils {

    static boolean isStrongPassword(String password) {
        if (password == null) {
            return false;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        if (password.length() < 8) {
            return false;
        }

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else {
                hasSpecial = true;
            }
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}

public class InsurancePortal {

    public static void main(String[] args) {
        String password = "Tapesh@12345";
        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Password is strong");
        } else {
            System.out.println("Password is weak");
        }
    }
}
