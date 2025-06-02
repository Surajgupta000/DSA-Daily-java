import java.util.*;
public class uniqueNumber1 {
 public static void unq(int[]arr) {
	 int unique = 0;
     for (int num : arr) {
         unique ^= num; // XOR all numbers
     }
     System.out.println("Unique number is: " + unique);
 }

 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of element");
		int n = sc.nextInt();
		
		int[]arr= new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		 unq(arr);

	}

}
