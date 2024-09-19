package Takeuforward;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputOutput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader rs=new BufferedReader(is);
	int num=Integer.parseInt(rs.readLine());
	String num2=rs.readLine();
	float num3=Float.parseFloat(rs.readLine());
		System.out.println(num);
System.out.println(num2);
System.out.println(num3);
	}

}
