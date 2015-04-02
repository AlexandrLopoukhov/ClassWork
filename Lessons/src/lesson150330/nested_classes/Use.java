package lesson150330.nested_classes;

public class Use {
	public static void main(final String[] args) {
		B b = new B();
		B.C c = new B.C();

		D d = new D();
		d.s.print();

		E e = new E();
		E.I i = e.new I();
	}
}
