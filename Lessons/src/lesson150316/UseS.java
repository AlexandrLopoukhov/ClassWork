package lesson150316;

public class UseS {
<<<<<<< HEAD

	public static void main(final String[] args) {

		System.out.println(S.Counter);
		// System.out.println(S.counter); обращение только к экземпляру

		S s = new S();
		S s2 = new S();
		s.counter = 20;
		System.out.println(s.counter + " " + s.Counter);// S.Counter идет
														// обращение т.к. s
														// хранит ссылку на S
		System.out.println(s2.counter + " " + s2.Counter);
		System.out.println(s.counter + " " + S.Counter); // более корректное
															// обращение к
															// статической
															// переменной
=======
	
	public static void main(final String[] args) {
		
		System.out.println(S.Counter);
//		System.out.println(S.counter);  ERROR!
		
		S s = new S();
		S s2 = new S();
		
		System.out.println(s.counter);
		s.counter = 20;
		System.out.println(s.counter);
		System.out.println(s2.counter);

//		System.out.println(s.Counter);  BAD STYLE
//		System.out.println(s2.Counter);
		
		System.out.println(S.Counter); //good
>>>>>>> remotes/zaal/master
	}

}
