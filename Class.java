import java.util.Random;

public class Class {
	
	// Attributes and references
	private String name;
	private LinkList list;
	private int totalStudent;
	private double totalGPA;
	
	// Default Constructor
	public Class(){
		list = new LinkList();
		
	}
	//TEK
	public int getTotalStudent(){
		return totalStudent;
	}
	public void setTotalStudent(int totalStudent){
		this.totalStudent = totalStudent;
	}
	public double getTotalGPA(){
		return totalGPA;
	}
	public void setTotalGPA(double totalGPA){
		this.totalGPA = totalGPA;
	}
	public double getAvgGpa(){
			double sum = totalGPA/totalStudent;
			return sum;
			//
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
