package Fundamentals.www;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class GcdHcf_efficient {
	
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		List ab=new ArrayList();
		ab.add(2);
		ab.add(2);
		ab.add(2);
		System.out.println(ab);
		LinkedList ls=new LinkedList();
		ls.add("ls");
		ls.add(2);
		ls.add(2);
		System.out.println(ls);
		for(int i=0;i<ls.size();i++) {
			System.out.println(ls.get(i));
		}
		
		while(a!=0 && b!=0) {
			if(a>b) {
				a=a%b;
			}
			else {
				b=b%a;
			}
		}
		if(a!=0) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
		
	}
//	gabrial lame was come up with another :algoritham
//		================================
//		step-1)find the larger number and smaller number
//		2)larger number % smaller number8
//		3)replace the larger number when larger % smaller
//		4)at last one of the number becomes 0, then  


}
