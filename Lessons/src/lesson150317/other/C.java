package lesson150317.other;

import java.lang.Thread.State;

import lesson150317.A;

public class C extends A {

	@Override
	public void change() {
		// TODO Auto-generated method stub
		// state += 2;
		super.change();
		super.change();
	}

}
