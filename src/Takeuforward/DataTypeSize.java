package Takeuforward;

public class DataTypeSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Integer";
		int num=datatypeSize(s);
		System.out.println(num);
		
		
	}
	static int datatypeSize(String str) {
		  switch(str){
          case "Integer": 
              return Integer.BYTES;
          
          case "Character":
              return Character.BYTES;
          case "Long":
              return Long.BYTES;
          case "Float":
              return Float.BYTES;
          case "Double":
              return Double.BYTES;
           
      }
      return -1;
}
}
