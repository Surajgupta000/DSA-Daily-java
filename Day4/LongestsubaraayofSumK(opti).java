import java.util.*;
public class subarrOfSumKOpti {
 public static void opt(int[]arr, int k) {
	 Map<Integer, Integer>mp=new HashMap<>();
	 int n =arr.length;
	 
	 int res=0, prefsum=0;
	 for(int i=0;i<n;i++) {
		 prefsum+=arr[i];
		 
		 if(prefsum==k) {
			 res=i+1;
		 }else if(mp.containsKey(prefsum-k)) {
			 res=Math.max(res, i-mp.get(prefsum-k));
		 }
		 if(!mp.containsKey(prefsum)) {
			 mp.put(prefsum,i );
		 }
	 }
	 System.out.println(res);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub  This is the optimized version of this question longest subarray of sum K using map and prefix sum :
        int[]arr= {10, 5,2,7,1,-10};
        int k=15;
        opt(arr, k);
	}

}
