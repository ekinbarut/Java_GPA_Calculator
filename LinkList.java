public class LinkList {
	// Attributes and references
	private Node first = null;
	private int size;

	public Node getFirst() {
		return first;
	}

	public void setFirst(Node first) {
		this.first = first;
	}

	public void insert(Student st){
		Node node = new Node(st);
		Node current =this.first;
		
		if(first==null){
			this.first=node;
			size++;
		}
		else{
			while (current.getNext() != null){
				current = current.getNext();
			}

			current.setNext(node);
			size++;
		}
	}

	public Node deleteFirst() {
		Node temp = first;
		first = first.next;
		return temp;
	}

	public void displayList() {
		Node current = first;
		while (current != null) {
			current.displayNode();
			current = current.next;
		}
	}
	public boolean isEmpty() {
		return (first == null);
	}

	@Override
	public String toString() {
		String result = "";

		Node current =this.first;
		while (current != null){
			result = result + current.getSt().toString();
			current = current.getNext();
		}
		return result;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	public Node get(int index){
		if (index >= size) {
			return null;
		}
		else {
			Node current = first;
			for (int i = 0 ; i < this.getSize(); i++){
				if (i == index){
					return current;
				} else {
					current = current.getNext();
				}
			}
		} 
		return null;
	}
}


