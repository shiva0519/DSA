package linkedlist;

import java.util.ArrayList;
import java.util.List;

public class IntromainFile {

	public static void main(String[] args) {
		CustomLinkedList cll=new CustomLinkedList();
		cll.add(25);
		cll.add(32);
		cll.printLinkedlIst();
		System.out.println("============");
		cll.firstAdd(32);
		cll.add(0, 555);
		int[]ar= {1,6,3,2};
		cll.addAll(ar);
		cll.printLinkedlIst();
		List c=new ArrayList();
		

	}

	

}
