package linkedlist;

class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data=data;
		
	}
}

 class CustomLinkedList {
Node head;
	  void printLinkedlIst() {
		 Node curr=head;
		 while(curr!=null) {
			System.out.println(curr.data);
			curr=curr.next;
		 }
	}
	  void firstAdd(int data) {
		  Node n=new Node(data);
		  if(head==null) {
			  head=n;
		  }
		  else {
			  n.next=head;
			  head=n;
		  }
		  
	  }
	  void add(int e) {
		  Node temp=new Node(e);
		  if(head==null) {
			  head=temp;
		  }
		  else {
			  Node curr=head;
			  while(curr.next!=null) {
				  curr=curr.next;
			  }
			  curr.next=temp;
		  }
	  }
	  void add(int index,int e) {
		  Node temp=new Node(e);
		 Node curr=head;
		  for(int i=0;i<index-1;i++) {
			  curr=curr.next;  
		  }
		 temp.next= curr.next;
		 curr.next=temp;
	  }
	  
	  void addAll(int[]elements) {
		  for(int ele:elements) {
			  add(ele);
		  }
	  }

}

