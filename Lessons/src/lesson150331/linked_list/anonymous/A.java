package lesson150331.linked_list.anonymous;

public class A {
	static class B implements I {

		public int calc() {
			// TODO Auto-generated method stub
			return 0;
		}

	}

	public I getI() {
		return new B();
	}

	public I getAnonymous() {
		return new I() {

			public int calc() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}

	public static void main(final String[] args) {
		A a = new A();
		I i = a.getAnonymous();
		System.out.println(i);
	}
}
