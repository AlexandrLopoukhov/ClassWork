package lesson150317;

<<<<<<< HEAD
import lesson150317.other.C;

public class UseAB {
	public static void main(final String[] args) {
		A a = new A();
		a.change();

		B b = new B();
		b.change();

		C c = new C();
		c.change();
	}

=======
import lesson150317.other.D;

public class UseAB {

	public static void main(final String[] args) {
		A a = new A();
		a.change();
		
		System.out.println("A state is " + a.get());
		
		B b = new B();
		b.change();
		
		System.out.println("B state is " + b.get());
		
		D d = new D();
		d.change();
		
		System.out.println("D state is " + d.get());
	}
	
>>>>>>> remotes/zaal/master
}
