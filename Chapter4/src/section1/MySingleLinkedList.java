package section1;

public class MySingleLinkedList<T> {
	public Node<T> head;
	public int size;
	
	public MySingleLinkedList() {
		head = null;
		size = 0;
	}
	
	public void addFirst(T item) {
////		아래는 선언 불가
//		T t = new T();
//		T[] arr = new T[100];
//		Node<T>[] arr = new Node<T>[100];
		
		Node<T> newNode = new Node<T>(item);
		newNode.next = head;
		head = newNode;
		++size;
	}
	
	public void addAfter(Node<T> before, T item) {
		Node<T> tmp = new Node<T>(item);
		
		tmp.next = before.next;
		before.next = tmp;
		++size;
	}
	
	public void add(int index, T item) {		// insert
		if (index < 0 || index > size)
			return ;
		
		if (index == 0)
			addFirst(item);
		else {
			Node<T> q = getNode(index - 1);
			addAfter(q, item);
		}
	}

	public T removeFirst() {
		if (head == null)
			return null;
			
		T tmp = head.data;
		head = head.next;
		--size;
		return tmp;
	}
	
	public T removeAfter(Node<T> before) {
		if (before == null || before.next == null)
			return null;
		
		T tmp = before.next.data;
		before.next = before.next.next;
		--size;
		return tmp;
	}
	
	public T remove(int index) {				// delete
		if (index < 0 || index >= size)
			return null;
		
		if (index == 0)
			return removeFirst();
		Node<T> prev = getNode(index - 1);
		return removeAfter(prev);
	}

	public T remove(T item) {
		Node<T> p = head;
		Node<T> prev = null;
		
		while (p != null && !p.data.equals(item)) {
			prev = p;
			p = p.next;
		}
		
		if (p == null)
			return null;
		if (prev == null)
			return removeFirst();
		return removeAfter(prev);
	}
	
	public int indexOf(T item) {				// search
		Node<T> p = head;
		int index = 0;
		while (p != null) {
			if (p.data.equals(item))
				return index;
			p = p.next;
			++index;
		}
		return -1;
	}
	
	public Node<T> getNode(int index) {
		if (index < 0 || index >= size)
			return null;
		Node<T> p = head;
		for (int i = 0; i < index; i++) {
			p = p.next;
		}
		return p;
	}
	
	public T get(int index) {
		if (index < 0 || index >= size)
			return null;
//		Node<T> p = head;
//		for (int i = 0; i < index; i++) {
//			p = p.next;
//		}
//		return p.data;
		return getNode(index).data;
	}
	
	public static void main(String[] args) {
		MySingleLinkedList<String> list = new MySingleLinkedList<>();
		list.add(0, "Saturday");
		list.add(1, "Friday");
		list.add(0, "Monday");
		list.add(2, "Tuesday");
		
		String str = list.get(2);
		list.remove(2);
		int pos = list.indexOf("Friday");
	}
}
