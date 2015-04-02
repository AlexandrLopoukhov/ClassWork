package lesson150330.linked_list;

import java.util.Iterator;

public class ListIterator implements Iterator {

	private LinkedList _linkedList;
	private Node tmp;

	public ListIterator(final LinkedList linkedList) {
		_linkedList = linkedList;
		tmp = linkedList.first;
		// TODO Auto-generated constructor stub
	}

	public boolean hasNext() {
		return (tmp != null);
	}

	public Object next() {
		Object item = tmp.item;
		tmp = tmp.next;
		return item;
	}

	public void remove() {
		// TODO Auto-generated method stub

	}

}
