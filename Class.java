import java.util.Random;

public class Class {
	
	// Attributes and references
	private String name;
	private LinkList list;
	private Random random;
	
	// Default Constructor
	public Class(){
		random = new Random();
		list = new LinkList();
	}
	//incomplete
		public double getAvgGpa(){
			return random.nextDouble()*4;
		}
	//GETTERS AND SETTERS
	public LinkList getList() {
		return list;
	}

	public void setList(LinkList ll) {
		this.list = ll;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {

		return list.toString();
	}

}
