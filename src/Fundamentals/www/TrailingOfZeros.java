package Fundamentals.www;
import java.util.Scanner;

public class TrailingOfZeros {

	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		TrailingOfZeros t=new TrailingOfZeros(); 
		t.trailingZeros(num);
		
	} 
	void trailingZeros(int num) {
		int res=0;
		int powerOf5=5;
		while(num>=powerOf5) {
			res=res+(num/powerOf5);
			powerOf5=powerOf5*5;
			
		}
		System.out.println(res);
	}
}
//  que is trailingzeros of a number factorial
//if number 5 its factorial is 120 the trailing zero is 1
// so logic is n/5,n/25/,n/125,n/626