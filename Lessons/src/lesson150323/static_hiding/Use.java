package lesson150323.static_hiding;

public class Use {
	public static void main(final String[] args) {
		A a = new A();
		// a.getCount();
		A.getCount(); // верная запись

		A a2 = new B();
		// a2.getCount();
		A.getCount(); // верная запись

		B b = new B();
		// b.getCount();
		B.getCount(); // верная запись
	}
}
