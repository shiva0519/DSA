package Fundamentals.www;
import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num=scan.nextInt();
		System.out.print(prime(num));
		
		

	}
	static String prime(int num) {
		
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return "not";
			}
		}
		return "prime";

	}

}
