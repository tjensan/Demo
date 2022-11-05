public class linkedList{
	
	class node{
		int data;
		node next;
		node(int item){
			data= item;
			next=null;
		}
	}
	
	node head;
	
	linkedList(){
		head = null; 
	}
	
	public void insertAtBeginning(int item){
		node newNode = new node(item);
		
		if(head==null)
			head= newNode;
		
		else{
			newNode.next=head;
			head = newNode;
		}
	}
	
	public void display(){
		node temp=head;
		while(temp!=null){
			System.out.print(temp.data + " ");
			temp=temp.next;
		}
	}
	
	public void insertAtPos(int position, int item){
		node newNode = new node(item);
		
		if(position==0) {
			insertAtBeginning(item);
			return;
		}
		
		node temp=head;
		for(int i=1; i< position ; i++){
			temp = temp.next;
			if(temp==null){
				throw new IllegalArgumentException("Invalid Position" + position);
			}
		}
			
		newNode.next = temp.next;
		temp.next = newNode;
	}
}
	