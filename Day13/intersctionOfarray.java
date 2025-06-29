import java.util.*;
public class intersectionofarray {
  public static void intersection(int[]a, int[]b) {
	  Set<Integer> sa= new HashSet<>();
	  for(int num : a) {
		  sa.add(num);
	  }
	  
	  List<Integer> res= new ArrayList<>();
	  
	  for(int num  : b) {
		  if(sa.contains(num)) {
			  res.add(num);
			  sa.remove(num);
		  }
	  }
	  
	  System.out.println(res);
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[]a= {1,2,3,4,5};
        int[]b= {1,2,3};
        intersection(a,b);
	}

}
