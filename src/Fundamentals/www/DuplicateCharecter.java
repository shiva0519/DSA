package Fundamentals.www;

public class DuplicateCharecter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="kishoreks";
		String dup="";
		
		
	for(int i=0;i<s.length();i++) {
		
		for(int j=i+1;j<s.length();j++) {
			
			if(s.charAt(i)==s.charAt(j)) {
				dup=dup+s.charAt(j);
				
			}
			
		}
	}
	System.out.println(dup+" duplicate");
		
		
	}

}
