package lesson150330.linked_list;

import java.util.Iterator;

public class LinkedList implements Iterable {

	Node first, last;

	public void add(final Object item) {
		Node fresh = new Node(item, null);

		/*
		 * if (first == null) { first = fresh; } else { Node last = first; while
		 * (last != null) { last = last.next; } last.next = fresh; }
		 */

		if (first == null) {
			first = fresh;
			last = fresh;
		} else {
			last.next = fresh;
			last = fresh;
		}
	}

	public void print() {
		Node tmp = first;
		while (tmp != null) {
			System.out.println(tmp.item);
			tmp = tmp.next;
		}
	}

	public Iterator iterator() {

		return new ListIterator(this);
	}

}
