package Queue;

import java.util.Iterator;

@SuppressWarnings("rawtypes")
public class Queue implements QueueInterface, Iterable {

	private Element head;
	private Element tail;
	private int listCount;

	public Queue() {
		head = new Element(null);
		listCount = 0;
	}

	public static void main(String[] args) {
		// Because this was partly new for me, i looked on following reference
		// to take inspiration. All implementation was manually implemented.
		// http://crunchify.com/how-to-implement-a-linkedlist-class-from-scratch-in-java/

		Queue myList = new Queue();
		myList.enqueue("ele1");
		myList.enqueue("2");
		myList.enqueue("3");
		myList.enqueue("4");
		myList.enqueue("femman");
		try {
			System.out.println("myList.size() - print linkedlist size: "
					+ myList.size());
			System.out.println("myList.first() - get first element: "
					+ myList.first());
			System.out.println("myList.last() - get last element: "
					+ myList.last());
			System.out.println("myList.contains() - check if list contains \"4\": "
					+ myList.contains("4"));
			System.out.println("myList.hasNext - check if next exist: "
					+ myList.iterator().hasNext());

			for (Object curr : myList) {
				System.out.println("Checking foreach works with Iterator: " +curr);
			}

			System.out.println("myList.deQueue() - check it remove first and return copy: Before dequeue length was: " + myList.size()+ " And Element removed was: "+myList.dequeue() +" length after dequeue: " +myList.size());
			
			Iterator it = myList.iterator();
			while (it.hasNext()) {
				System.out.println("Checking Iterating works with list iterator : "+it.next());
			}
			
			Queue emtyList = new Queue();
			System.out.println("emtyList.last() - Checking exception is thrown: ");
			emtyList.last();
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public int size() {
		return listCount;
	}

	@Override
	public boolean isEmpty() {
		return listCount == 0;
	}

	public void enqueue(Object element)  {
		Element temp = new Element(element);
		Element currentHead = head;
		while (currentHead.getNext() != null) {
			currentHead = currentHead.getNext();
		}
		// set last element after while loop expired and set it to tail.
		currentHead.setNext(temp);
		tail = currentHead.getNext();
		listCount++;
	}

	@Override
	public Object dequeue()  {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException(
					"Can not run dequeue() when no object exist.");
		}
		Element currentHead = head;
		Element toRemove = currentHead.getNext();
		currentHead.setNext(toRemove.getNext());
        listCount--; 
		return toRemove.getData();
	}

	public Object first() {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException(
					"IndexOutOfBoundsException : Can not run first() when no object exist.");
		}
		return head.getNext().getData();
	}

	@Override
	public Object last() {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException(
					"IndexOutOfBoundsException : Can not run last() when no object exist.");
		}
		return tail.getData();
	}

	@Override
	public boolean contains(Object o) {
		if (isEmpty()) {
			throw new NullPointerException(
					"IndexOutOfBoundsException : Can not run contains(Object o) when no object exist.");
		}
		Element currentHead = head;
		while (currentHead.getNext() != null) {
			currentHead = currentHead.getNext();
			if (currentHead.getData() == o) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Iterator iterator() {
		return new Iterator() {
			private Element currentHead = head;

			public boolean hasNext() {
				if (isEmpty()) {
					throw new NullPointerException(
							"Can not run Iterator().hasNext() when no object exist.");
				}
				currentHead = currentHead.getNext();
					return currentHead != null;
			}

			@Override
			public Object next() {
				return currentHead.getData();
			}
		};
	}

}
