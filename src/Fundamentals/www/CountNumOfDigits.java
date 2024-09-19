package Fundamentals.www;
import java.util.Scanner;

public class CountNumOfDigits {
	
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		countDigits(num);
		
	}
	static void countDigits(int num) {
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println(count);
	}

}
