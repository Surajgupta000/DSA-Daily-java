
public class longestSubarray {
  
	public static void subarr(int[]arr, int k) {
		int res=0;
		int n =arr.length;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
				sum+=arr[j];
				if(sum==k) {
					int sublen=j-i+1;
					res=Math.max(res, sublen);
				}
			}
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int []arr= {10, 5, 2, 7, 1, -10};
       int k=15;
       subarr(arr, k);
	}

}
