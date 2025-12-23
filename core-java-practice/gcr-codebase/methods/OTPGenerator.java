public class OTPGenerator {
	public static int otpGenerator() {
		return (int) (Math.random() * 1000000) + 1000000;
	}

	public static boolean validateOTP(int[] otp) {
		for (int i = 0; i < otp.length; i++) {
			for (int j = i; j < otp.length; j++) {
				if (otp[i] == otp[j]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] otp = new int[10];
		for (int i = 0; i < otp.length; i++) {
			otp[i] = otpGenerator();
		}
		System.out.println("Generated OTP");
		for (int i : otp) {
			System.out.println(i + " ");
		}
		System.out.printf("All OTP are %s", validateOTP(otp) ? "unique" : "not unique");
	}
}
