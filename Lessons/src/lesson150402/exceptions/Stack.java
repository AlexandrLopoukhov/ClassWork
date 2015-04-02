package lesson150402.exceptions;

public class Stack {
	Object[] items;
	int tos; // top of stack

	Stack(final int capacity) {
		items = new Object[capacity];
		tos = -1;
	}

	public void push(final Object item) throws StackFullException {
		// tos++;
		if (tos == items.length - 1) {
			throw new StackFullException("tos is " + tos);
		}
		items[++tos] = item;
	}

	public Object pop() {
		// tos--;
		return items[tos--];
	}

	public Object top() {
		// TODO Auto-generated method stub
		return items[tos];
	}

	public boolean isEmpty() {
		return -1 == tos;
	}
}
