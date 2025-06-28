import java.util.*;
public class dpassque2 {
	public static boolean isValidMantra(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        
        dp[0] = true; // empty string is always valid

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        
        return dp[n];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Read mantra
        String mantra = sc.nextLine().trim();

        // Read dictionary words
        List<String> wordDict = new ArrayList<>();
        while (sc.hasNextLine()) {
            String word = sc.nextLine().trim();
            if (word.isEmpty()) break; // handle empty lines gracefully
            wordDict.add(word);
        }

        // Output result
        System.out.println(isValidMantra(mantra, wordDict));
	} 

}
