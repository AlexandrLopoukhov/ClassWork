package lesson150326.interfaces;

public class B {
	Changable a;

	void use() {
		a.change();
	}

	void setWorker(final Changable a) {
		this.a = a;
	}
}
