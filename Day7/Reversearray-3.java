import java.util.*;
public class reversethree {
	public static void revthree(List<Integer>arr) {
		Collections.reverse(arr);
		 for(int i=0;i<arr.size();i++) {
	    	 System.out.print(arr.get(i)+ " ");
	     }
		 System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer>arr=new ArrayList<>(Arrays.asList(1,2,3,4));
     revthree(arr);
     
    
	}

}
