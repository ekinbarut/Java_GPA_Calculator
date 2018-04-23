

public class ClassStack {
	// Attributes and references
	private Class cl;	
	private ClassNode top;

	public void push(Class cl) {
		ClassNode curr=top;
		if(top==null){
			top=new ClassNode(cl);
		}
		else{
			while(curr.getNext()!=null) {
				curr=curr.getNext();
			}
			curr.setNext(new ClassNode(cl));
		}
	}
		public void displayStack(){
		    ClassNode current = top;
		    while (current != null){
		        LinkList list = current.getC().getList();
		        System.out.println("Students of " + current.getC().getName() + " class:" );
		        for (int i = 0; i < list.getSize(); i++){
		            Student student = list.get(i).getSt();
		            System.out.println(student.toString());
		        }
		        current = current.getNext();
		    }
		}
	

	//GET SET
	public Class getCl() {
		return cl;
	}

	public void setCl(Class cl) {
		this.cl = cl;
	}




}
