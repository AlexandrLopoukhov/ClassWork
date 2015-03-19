package lesson150316;

public class S {
<<<<<<< HEAD

	{
		Counter++; // обычное использование стат переменных не в конструкторе а
					// в стат блоке - инициализатор экземпляра
	}

	public static int Counter;// поле класса

	public int counter = 10;// поле экземпляра

	public S() {
		Counter++;
	}

	public S(final int c) {
		counter = c;
	}
=======
	
	public static int Counter; // class member
	
	{
		Counter++;
	}
	
	
	public S() {
	}
	
	public S(final int c) {
		counter = c;
	}
	
	public int counter = 10;  // instance member
>>>>>>> remotes/zaal/master

}
