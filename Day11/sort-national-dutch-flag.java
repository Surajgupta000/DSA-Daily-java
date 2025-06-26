
public class sort012again {
  public static void againsort012(int[]arr, int n) {
	   n = arr.length;
	  int c0=0, c1=0, c2=0;
	  
	  for(int i=0;i<n;i++) {
		  if(arr[i]==0) {
			  c0++;
		  }else if(arr[i]==1) {
			  c1++;
		  }else {
			  c2++;
		  }
	  }
	  
	  int indx=0;
	  
	  for(int i=0;i<c0;i++) {
		  arr[indx++]=0;
	  }
	  
	  for(int i=0;i<c1;i++) {
		  arr[indx++]=1;
		  
	  }
	  
	  for(int i=0;i<c2;i++) {
		  arr[indx++]=2;
	  }
	  for(int i=0;i<n;i++) {
		  System.out.print(arr[i]+ " ");
	  }
	  System.out.println();
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[]arr= {0,2,2,1,0,1,0,2};
       int n =arr.length;
       againsort012(arr,n);
	}

}
