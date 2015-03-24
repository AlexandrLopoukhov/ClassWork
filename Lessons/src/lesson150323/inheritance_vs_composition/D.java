package lesson150323.inheritance_vs_composition;

public class D {
<<<<<<< HEAD
	A a;

	public D(final A a) {
		this.a = a;
	}

	public void use() {
		a.change();
		System.out.println(a.getState());
	}
=======
	
	A a;
	
	public D(final A a) {
		this.a = a;
	}
	
	public void setA(final A a) {
		this.a = a;
	}
	
	public void use() {
		a.change();
		System.out.println(a.getState());
	}

>>>>>>> refs/remotes/zaal/master
}
