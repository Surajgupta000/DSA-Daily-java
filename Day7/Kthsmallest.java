import java.util.*;
public class kthsmallest {
 public static void smll(int[]arr, int n, int k) {
	 
	        // Max-heap: largest value at the top
	        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

	        for (int i = 0; i < n; i++) {
	            pq.offer(arr[i]);

	            // Keep only the smallest k elements in the heap
	            if (pq.size() > k) {
	                pq.poll();  // removes the largest among them
	            }
	        }
	        System.out.println("Kth Smallest Element is: " + pq.peek());
	        
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[]arr= {7,10,4,3,20,15};
       int n =arr.length;
       int k=3;
       smll(arr,n,k);
       
	}

}
