package Fundamentals.www;

public class BitonicSequence {

	public static void main(String[] args) {
		int[]a= {4,5,6,7,4,3,2,1};
		System.out.println("Hello gkklklkl");
		int key=4;
	int bIndex=findBitonic(a,key);
	
	System.out.println(bIndex+" gh");
	
	System.out.println(find(a,bIndex,key)+" final output");
	
	}
	static int find(int[]a,int bIndex,int key) {

		if(a[bIndex]==key) {
			return bIndex;
		}
		int result1=ascBinarySearch(a,bIndex,key);
		if(result1!= -1) {
			return result1;
		}
		int result2=desBinarySearch(a,bIndex,key);
		 if(result2!= -1) {
			return result2;
		}
		 return -1;
			
		}
	
	static int findBitonic(int[]a,int key) {
		int low=0;
		int high=a.length;
		int mid=0;
		while(low<=high) {
		 mid=(low+high)/2;
		 if(a[mid]>a[mid-1] && a[mid]>a[mid+1]) {
			 return mid;
		 }
			
		 else if(a[mid]>a[mid-1] && a[mid]<a[mid+1]) {
				low=mid+1;
			}
			else if(a[mid]<a[mid-1] && a[mid]>a[mid+1]) {
			      high=mid-1;
			}
		}
		return -1;
		
	}
	static int ascBinarySearch(int[]a,int bIndex,int key) {
		int low=0;
		int high=bIndex-1;
		
		while(low<=high) {
			//int[]a= {5,6,7,8,9,10,3,2,1};
			int mid=low+(high-low)/2;
			if(a[mid]==key) {
				return mid;
			}
			else if(a[mid]<key) {
				low=mid+1;
			}
			else if(a[mid]>key) {
				high=mid-1;
			}
		}
		
		return -1;		
	}
static int desBinarySearch(int[]a,int bIndex,int key) {
	int low=bIndex+1;
	
	int high=a.length-1;
	
	while(low<=high) {
		//int[]a= {5,6,7,8,9,10,3,2,1};
		int mid=low+(high-low)/2;
		System.out.println(mid);
		if(a[mid]==key) {
			return mid;
		}
		else if(a[mid]<key) {
			high=mid-1;
		}
		else if(a[mid]>key) {
			low=mid+1;
		}
	}
	
	
	return -1;
	}

	

}
