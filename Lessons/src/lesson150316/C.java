package lesson150316;

<<<<<<< HEAD
public class C {
	// pass reference by value

	private final int _state;

	public C(final int initialState) {
		_state = initialState;

	}

	public static void main(final String[] args) {

		final C c1 = new C(10);

		final C c2 = c1;// копирование ссылки из c1 в которой обьект

		process(c1);

		System.out.println(c1._state);// 10 Ибо внутри метода переназначается c
										// = с1; c = new C(30)
	}

	private static void process(final C c) {// метод оперирует с локальным c
										// (final как защита от операций с
										// локальными переменными)
		// TODO Auto-generated method stub
		// c = new C(30); вернет 10
	}
=======
public class C {   // pass reference by value
	
	private int _state;

	public C(final int initialState) {
		_state = initialState;
	}
	
	public static void main(final String[] args) {
		
		final C c1 = new C(10);
		
		final C c2 = c1;  // copy reference
		
		process(c1);   //  C c = c1;
		
		System.out.println(c1._state);
		
	}

	private static void process(final C c) {
//		c = new C(30);   ERROR!
	}

>>>>>>> remotes/zaal/master
}
