package lesson150316;

public class B {

	public static void main(String[] args) {

		int x = 20;

		// something(x);//something(20)

		{
			int xx = x;
			xx = 30;
			System.out.println(xx);// аналог вызова из метода
		}
		System.out.println(x);
	}

	private static void something(int x) { // int x = 20
		// TODO Auto-generated method stub

		x = 30;
		System.out.println(x);
	}
}
