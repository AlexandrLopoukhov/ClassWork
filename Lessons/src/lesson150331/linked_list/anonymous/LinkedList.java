package lesson150331.linked_list.anonymous;

import java.util.Iterator;

public class LinkedList implements Iterable {

	private static class Node {
		Object item;
		Node next;

		public Node(final Object item, final Node nexy) {
			super();
			this.item = item;
			this.next = nexy;
		}
	}

	Node first, last;

	public void add(final Object item) {
		Node fresh = new Node(item, null);

		if (first == null) {
			first = fresh;
			last = fresh;
		} else {
			last.next = fresh;
			last = fresh;
		}
	}

	public Iterator iterator() {

		return new Iterator() {

			private Node tmp = first;

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

		};
	}

}
