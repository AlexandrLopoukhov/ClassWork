package lesson150402.polymorphism;

public class Polimorphism {

	static class A {
	}

	static class B extends A {
	}

	static class C extends B {
	}

	public static void main(final String[] args) {
		B b = new B();
		A a = b;
		Object o = a;
		printObjectDetails(o);
	}

	private static void printObjectDetails(final Object o) {
		System.out.println(o);
	}
}
