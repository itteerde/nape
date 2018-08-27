package nape;

public class Problem0002 {

	public static void main(String[] args) {
		int[] fib = { 1, 1 };
		int sum = 0;

		for (;;) {
			int f = fib[0] + fib[1];
			if (f > 4000000) {
				break;
			}
			if (f % 2 == 0) {
				sum += f;

			}
			fib[0] = fib[1];
			fib[1] = f;
		}

		System.out.println(sum);
	}

}
