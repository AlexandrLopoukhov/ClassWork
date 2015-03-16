package lesson150316;

public class D {

	public static D create(final int x, final int y) { // Factory pattern
		if (x + y != 100) {
			return null;
		} else {
			return new D(x, y);
		}
	}

	private final int _x, _y;

	private D(final int x, final int y) {
		_x = x;
		_y = y;

		if (x + y != 100) {

		}
	}

	public int getX() {
		return _x;
	}

	public int getY() {
		return _y;
	}

	public static void main(final String[] args) {
		// TODO Auto-generated method stub

	}

}
