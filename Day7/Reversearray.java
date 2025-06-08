import java.util.*;
public class reversearray {
  public static void rev(int[]arr, int n) {
	// Temporary array to store elements in reversed order
      int[] temp = new int[n];

      // Copy elements from original array to temp in reverse order
      for (int i = 0; i < n; i++)
          temp[i] = arr[n - i - 1];

      // Copy elements back to original array
      for (int i = 0; i < n; i++)
          arr[i] = temp[i];
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[]arr= {1,2,3,4};
     int n=arr.length;
     rev(arr,n);

     for (int i = 0; i < arr.length; i++) 
         System.out.print(arr[i] + " ");
	}

}
