package lesson150316;

public class StaticInit {

	public static void main(final String[] args) {
<<<<<<< HEAD

		SI si;
		/*
		 * SI.test(); задействуется статический инициализатор new SI();
		 */

		System.out.println("start");
		System.out.println(SI.x); // задействуется статическая инициализация
	}

=======
		
		SI si;
		
		System.out.println("start");
		
//		new SI();
		
//		System.out.println(SI.x);
		
		SI.test();
		
		
		
	}
	
>>>>>>> remotes/zaal/master
}
