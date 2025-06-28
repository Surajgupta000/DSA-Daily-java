import java.util.*;
public class stringassque {
	 public static boolean equalFrequency(String word) {
	        int[] freq = new int[26];

	        // Count frequency of each character
	        for (char c : word.toCharArray()) {
	            freq[c - 'a']++;
	        }

	        // Try removing each character once
	        for (int i = 0; i < 26; i++) {
	            if (freq[i] == 0) continue;

	            freq[i]--; // simulate removing one character

	            // check if all non-zero frequencies are the same
	            if (isAllSame(freq)) {
	                return true;
	            }

	            freq[i]++; // backtrack
	        }

	        return false;
	    }

	    // Helper method to check if all non-zero values in array are equal
	    private static boolean isAllSame(int[] freq) {
	        int expected = 0;

	        for (int f : freq) {
	            if (f == 0) continue;
	            if (expected == 0) {
	                expected = f;
	            } else if (f != expected) {
	                return false;
	            }
	        }

	        return true;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().trim();
        System.out.println(equalFrequency(word));
	}

}
