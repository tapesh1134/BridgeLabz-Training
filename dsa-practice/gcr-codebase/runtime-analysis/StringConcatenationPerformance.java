public class StringConcatenationPerformance {
	public static void main(String[] args) {
		int n = 100000;
		String string = "java";
		String result = "";
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			result += string;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("String Time: " + (endTime - startTime) + " ms");

		StringBuilder sb = new StringBuilder();
		long startBuilderTime = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			sb.append(string);
		}
		long endBuildertime = System.currentTimeMillis();
		System.out.println("StringBuilder Time: " + (endBuildertime - startBuilderTime) + " ms");

		StringBuffer sBuff = new StringBuffer();
		long startBufferTime = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			sBuff.append(string);
		}
		long endBufferTime = System.currentTimeMillis();
		System.out.println("StringBuffer Time: " + (endBufferTime - startBufferTime) + " ms");
	}
}