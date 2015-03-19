package lesson150316;

public class D {

<<<<<<< HEAD
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
=======
	public static D create(final int x, final int y) {
		if (x + y != 100) {
			return null;
		}
		return new D(x,y);
	}

	final private int _x;
	final private int _y;
	
	private D(final int x, final int y) {
//		if (x + y != 100) {
//			System.err.println("bad data!");
//			return;
//		}
		_x = x;
		_y = y;
>>>>>>> remotes/zaal/master
	}

	public int getX() {
		return _x;
	}

	public int getY() {
		return _y;
	}

<<<<<<< HEAD
	public static void main(final String[] args) {
		// TODO Auto-generated method stub

	}

=======
	
	
	
>>>>>>> remotes/zaal/master
}
