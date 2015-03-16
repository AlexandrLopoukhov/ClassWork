package lesson150316;

public class StaticInit {

	public static void main(final String[] args) {

		SI si;
		/*
		 * SI.test(); задействуется статический инициализатор new SI();
		 */

		System.out.println("start");
		System.out.println(SI.x); // задействуется статическая инициализация
	}

}
