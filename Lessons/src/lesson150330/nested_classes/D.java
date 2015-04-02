package lesson150330.nested_classes;

public class D {
	class I {// nested inner
	}

	public int state;

	static class S {
		void print() {
			System.out.println(d.state);
		}

		D d;
	}

	S s;

	public D() {
		s = new S();
		s.d = this;
	}
}
