package Patterns;

import java.util.Scanner;

public class NintoN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		nIntoN(num);
		rightAngle(num);
		rightAngleprint2(num);
		rightAngleprint3(num);
		invertedRightAngle(num);
		invertedRightAngleprint2(num);
		
	}

	private static void invertedRightAngleprint2(int num) {
		for(int i=0;i<num;i++) {          
			for(int j=1;j<=num-i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

	private static void invertedRightAngle(int num) {
//		num is 5
//		* * * * *
//		* * * *
//		* * *
//		* *
//		*
		
		for(int i=0;i<num;i++) {          
			for(int j=0;j<num-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	private static void rightAngleprint3(int num) {
//		1 
//		2 2 
//		3 3 3 
//		4 4 4 4 
//		5 5 5 5 5 
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		
	}

	private static void rightAngleprint2(int num) {
//		1 
//		1 2 
//		1 2 3 
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

	private static void rightAngle(int num) {
		/*
		
		* 
		* * 
		* * * 
		* * * * 
		* * * * *
		  
		 */
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	static void nIntoN(int num) {
		/*
		
		 * * * * * 
		 * * * * * 
		 * * * * * 
		 * * * * * 
		 * * * * *
		  
		 */
	
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}

}
