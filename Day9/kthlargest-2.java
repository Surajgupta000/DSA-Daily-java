import java.util.*;
public class kthlargestonceagain {
  public static void ans(int[]arr, int k) {
	  PriorityQueue<Integer>pq= new PriorityQueue<>((a,b) -> b-a);
	  
	  for(int i=0;i<arr.length;i++) {
		  pq.offer(arr[i]);
		  
		  if(pq.size() > k) {
			  pq.poll();
		  }
	  }
	  System.out.println(pq.peek());
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr= {3, 5, 6, 2, 8};
       int k=3;
       ans(arr,k);
	}

}
