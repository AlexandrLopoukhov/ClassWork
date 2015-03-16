package lesson150316;

public class S {

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

}
