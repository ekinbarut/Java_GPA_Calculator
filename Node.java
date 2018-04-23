public class Node {

	// Attributes and references
	public Student st;
	public Node next;

	// Default Constructor
	public Node(){

	}
	public Node(Student st){
		this.st=st;
	}
	//GETTERS AND SETTERS
	public Node getNext(){
		return next;
	}
	public void setNext(Node next){
		this.next=next;
	}
	public Student getSt() {
		return st;
	}
	public void setSt(Student st) {
		this.st = st;
	}

	public void displayNode() {
		System.out.print(st.toString());
		System.out.print("  ");

	}
	@Override
	public String toString() {

		return st.toString();
	}

}
