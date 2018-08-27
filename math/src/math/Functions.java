package math;

public class Functions {

	public static boolean isEven(long l) {
		if (l % 2 == 0) {
			return true;
		}
		return false;
	}

	public static boolean isOdd(long l) {
		return !isEven(l);
	}
}
