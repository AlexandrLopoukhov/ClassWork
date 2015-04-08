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

=======

	public static void main(final String[] args) throws DividerIsZero {

		int result = 0;
//		try {
			result = div(100, 0);
//		} catch (DividerIsZero e) {
//			result = Integer.MAX_VALUE;
//			e.printStackTrace();
//		}

		System.out.println(result);

	}

	private static int div(final int i, final int j) throws DividerIsZero {

		if (j == 0) {
			throw new DividerIsZero();
		}
		
		return i / j;
>>>>>>> refs/remotes/zaal/master
	}
}
