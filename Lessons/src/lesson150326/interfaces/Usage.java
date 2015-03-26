package lesson150326.interfaces;

public class Usage {
	public static void main(final String[] args) {
		C c = new C();
		c.use();

		B b = new B();
		b.setWorker(new A());
		b.use();
		b.setWorker(new A1());
		b.use();

		Changable cn = new A();

		Object o = new C();

		cn = (Changable) o;
	}
}
