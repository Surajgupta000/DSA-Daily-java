
public class maxAndmin {
 public static void maxmin(int[]arr, int n) {
	 int max=0;
	 int min=0;
	 
	 for(int i=0;i<n;i++) {
		 if(arr[i]>max) {
			 max=arr[i];
		 }
	 }
	 
	 for(int i=0;i<n;i++) {
		 if(arr[i]<min) {
			 min=arr[i];
		 }
	 }
	 System.out.println("max element is "+ max +" " + "min element is "+ min);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int []arr= {1,2,3,4,5};
      int n=arr.length;
      maxmin(arr,n);
	}

}
