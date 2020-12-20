import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Longest_Substring_Without_Repeating_Characters_LC_3 {

	// Sliding Window Technique
	// Time Complexity:- O(n)
	// Space Complexity :- O(n)

	public int lengthOfLongestSubstring(String s) {
		if (s == null || s.length() == 0)
			return 0;

		int n = s.length();
		int windowStart = 0;
		int windowEnd = 0;
		HashSet<Character> seen = new HashSet<Character>();
		int result = 0;

		while (windowStart < n && windowEnd < n) {

			char current = s.charAt(windowEnd);

			if (seen.contains(current)) {
				seen.remove(s.charAt(windowStart++));
			} else {
				windowEnd++;
				seen.add(current);
				result = Math.max(result, windowEnd - windowStart);
			}

		}

		return result;
	}

	// Optimized Sliding Window
	// Time Complexity:- O(n)
	// Space Complexity :- O(n)

	public int lengthOfLongestSubstringEfficient(String s) {
		int result = 0;
		int n = s.length();
		Map<Character, Integer> lastseen = new HashMap<Character, Integer>();

		int windowStart = 0;
		int windowEnd = 0;

		while (windowEnd < n && windowStart < n) {

			char current = s.charAt(windowEnd);

			if (lastseen.containsKey(current)) {
				windowStart = Math.max(lastseen.get(current), windowStart);

			}
			lastseen.put(current, windowEnd + 1);
			result = Math.max(result, windowEnd - windowStart + 1);
			windowEnd++;
		}
		return result;
	}
}
