import java.util.Scanner;

public class Test {
	static BinarySearchTree bst=new BinarySearchTree();
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		CreateSchool();

	}
	public static void CreateSchool(){
		
		ClassStack cs=new ClassStack();
		System.out.println("Please enter how many Students and classes that you want in your school");
		Class c = new Class();
		c.setTotalStudent(sc.nextInt());
		int studentCount = c.getTotalStudent();
		int classCount=sc.nextInt();
		double GPAsum[]= new double[studentCount];
		double AnotherGPASUM=0;
		for(int i=0;i<classCount;i++){
			System.out.println("Please enter a class name");
			c.setName(sc.next());
			TreeNode tn=new TreeNode(c);
			
			for(int j=0;j<studentCount;j++){
				Student st =new Student();
				GPA gpa=new GPA();
				System.out.println("Please enter a name for the student"+ (j+1));
				st.setName(sc.next());
				System.out.println("Please enter a Surname for the "+st.getName());
				st.setSurname(sc.next());
				System.out.println("Please enter an id for the "+st.getName());
				st.setSid(sc.nextInt());
				System.out.println("Please enter a gpa for the "+st.getName());
				gpa.setValue(sc.nextDouble());
				
				if(gpa.getValue()>4 || gpa.getValue()<=0){
					System.out.println("GPA CANT BE THAT NUMBER");
					gpa=null;
				}
				else{
					st.setGpa(gpa);
				}
				GPAsum[j] = gpa.getValue();
				AnotherGPASUM+=GPAsum[j];
				//;)
				c.getList().insert(st);
				
			}

			c.setTotalGPA(AnotherGPASUM);
			cs.push(c);
			tn.setElement(c);
			bst.insert(tn);
		}
		System.out.println("School tree is created");
		inorder(bst.getRoot());
		cs.displayStack();
	}
	public static void inorder(TreeNode root){
		if(root==null){
			return;
		}
		else{
			inorder(root.getLeft());
			System.out.println("Class:"+root.getclass().getName()+" - AVG GPA:"+root.getclass().getAvgGpa());
			inorder(root.getRight());
		}
	}
}
