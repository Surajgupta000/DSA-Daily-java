import java.util.*;

public class reverse2 {
	public static void revtwo(int[]arr, int n) {
		int i=0, j=n-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		for( i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
      System.out.println("entr the size of the array");
      int n = sc.nextInt();
      
      int []arr= new int[n];
      System.out.println("enter the elements of the array");
      for(int i=0;i<n;i++) {
    	  arr[i]=sc.nextInt();
      }
      
      
      revtwo(arr,n);
      
	}

}
