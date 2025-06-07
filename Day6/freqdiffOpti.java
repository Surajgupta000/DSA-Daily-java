import java.util.*;
public class freqdiffopt {
 public static void  optidiff(int[]arr, int n) {
	 Arrays.sort(arr);
	 int mincount=n, count=1,maxcount=1;
	 for(int i=1;i<n;i++) {
		 if(arr[i]==arr[i-1]) {
			 count++;
		 }else {
			 mincount=Math.min(mincount, count);
			 maxcount=Math.max(maxcount, count);
			 count=1;
		 }
	 }
	 mincount=Math.min(mincount, count);
	 maxcount=Math.max(maxcount, count);
	 
	 System.out.println(maxcount-mincount);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[]arr= {7, 8, 4, 5, 4, 1,
              1, 7, 7, 2, 5};
      int n=arr.length;
      optidiff(arr,n);
	}

}
