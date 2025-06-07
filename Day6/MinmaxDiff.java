import java.util.*;
public class maxmindiff {
 public static void freqdiff(int[]arr, int n) {
	 int maxfreq=Integer.MIN_VALUE;
	 int minfreq=Integer.MAX_VALUE;
	 
	 for(int i=0;i<n-1;i++) {
		 int count=0;
		 
		 for(int j=0;j<n-1;j++) {
			 if(arr[i]==arr[j]) {
				 count++;
			 }
		 }
		 maxfreq=Math.max(maxfreq, count);
         minfreq=Math.min(minfreq, count);
 }
	 System.out.println(maxfreq-minfreq);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		 int[]arr= {7, 8, 4, 5, 4, 1, 1, 7, 7, 2, 5};
		 int n=arr.length;
		 freqdiff(arr,n);
	}

}
