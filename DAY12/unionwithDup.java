import java.util.*;
public class unionwithdup {
 public static void uniondup(int[]a, int[]b, int n, int m) {
	 Set<Integer> set= new HashSet<>();
	 
	 for(int num : a) {
		 set.add(num);
	 }
	 
	 for(int num : b) {
		 set.add(num);
	 }
	 
	 System.out.println(set.size());
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[]a= {1,2,3,4,5};
      int[]b= {1,2,3};
      int n= a.length;
      int m = b.length;
      
      uniondup(a,b,n,m);
	}

}
