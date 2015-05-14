package lesson150421.patterns.bus;

public class UseBus {
<<<<<<< HEAD
	public static void main(final String[] args) {
		Bus bus = new Bus();
		A a1 = new A(bus);
		new A(bus);
		new A(bus);
		new B(bus);
		new B(bus);
		new B(bus);
		new B(bus);
		new B(bus);
		a1.change();
	}
=======

	public static void main(final String[] args) {
		Bus bus = new Bus();
		
		A a1 = new A(bus);
		new A(bus);
		new B(bus);
		new B(bus);
		new B(bus);
		
		a1.change();
		
	}
	
>>>>>>> refs/remotes/zaal/master
}
