package lesson150330.nested_classes;

public class A {

	static class S { // static

	}

	class I {// inner
	}

	public void method() {
		class L {// local
		}
	}

	public void method2() {
		Runnable task = new Runnable() {// anonymus

			public void run() {
				// TODO Auto-generated method stub

			}
		};
	}

}
