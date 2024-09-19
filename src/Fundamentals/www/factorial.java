package Fundamentals.www;
import java.util.Scanner;

public class factorial {
	
	public static void main (String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		factorial(num);
		
	}
	
	static void factorial(int n) {
		
		int fact=1;
		
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
		
	}

}
