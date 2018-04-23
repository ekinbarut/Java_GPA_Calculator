
public class ClassNode {

	private Class c;
	public ClassNode next;
	public ClassNode(Class cl) {
		c=cl;
	}

	public ClassNode getNext() {
		return next;
	}

	public void setNext(ClassNode next) {
		this.next = next;
	}
	public Class getC() {
		return c;
	}

	public void setC(Class c) {
		this.c = c;
	}
}
