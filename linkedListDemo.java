public class linkedListDemo{
	
	public static void main(String args[]){
		linkedList list = new linkedList();
		
		list.insertAtBeginning(9);
		list.insertAtBeginning(5);
		list.display();
		
		System.out.println("\n");
		list.insertAtPos(5,10);
		list.display();
		
	}
}