package lesson150402.exceptions;

public class DivisionByZero {
	public static void main(final String[] args) {
		int result;
		try {
			result = div(10, 0);
		} catch (DividerByZero e) {
			result = Integer.MAX_VALUE;
		}
		System.out.println(result);
	}

	public static int div(final int i, final int j) throws DividerByZero {
		if (j == 0) {
			throw new DividerByZero();
		}
		return i / j;

	}
}
