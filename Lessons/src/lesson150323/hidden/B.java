package lesson150323.hidden;

public class B extends A {
	// int state;

	@Override
	public void change() {
		// TODO Auto-generated method stub
		state += 2;
	}

	public static void main(final String[] args) {
		B b = new B();
		System.out.println(b.getState());
		b.change();
		System.out.println(b.getState());
	}
}
