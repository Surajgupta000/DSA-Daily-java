
public class Movenegtoend {
  public static void movnegend(int[]arr, int n) {
	  int temp[]= new int[n];
	  int ind=0;
	  
	  for(int i=0;i<n;i++) {
		  if(arr[i]>=0) {
			  temp[ind++]=arr[i];
		  }
	  }
	  
	  for(int i=0;i<n;i++) {
		  if(arr[i]<0) {
			  temp[ind++]=arr[i];
		  }
	  }
	  System.arraycopy(temp, 0, arr, 0, n);
	  
	  for(int i=0;i<n;i++) {
	  System.out.print(arr[i]+" ");
	  }
	  
	  System.out.println();
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr= {1,3,4,-8,-6,0,-3};
      int n = arr.length;
      movnegend(arr,n);
	}

}
