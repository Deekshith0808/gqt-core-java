package gqt375;
/**
 * @author sai deekshith
 */
import java.util.HashMap;
import java.util.Scanner;
public class Program124 {
	public static String findSmallestWindow(String s, String t) {
		if (s.length() < t.length()) {
			return "No such window exists";
		}
		HashMap<Character, Integer> targetFreq = new HashMap<>();
		HashMap<Character, Integer> windowFreq = new HashMap<>();
		for (char ch : t.toCharArray()) {
			targetFreq.put(ch, targetFreq.getOrDefault(ch, 0) + 1);
		}
		int left = 0, minLen = Integer.MAX_VALUE, matchCount = 0, start = 0;
		for (int right = 0; right < s.length(); right++) {
			char ch = s.charAt(right);
			windowFreq.put(ch, windowFreq.getOrDefault(ch, 0) + 1);
			if (targetFreq.containsKey(ch) &&
					windowFreq.get(ch).intValue() <= targetFreq.get(ch).intValue()) {
				matchCount++;
			}
			while (matchCount == t.length()) {
				if (right - left + 1 < minLen) {
					minLen = right - left + 1;
					start = left;
				}
				char leftChar = s.charAt(left);
				windowFreq.put(leftChar, windowFreq.get(leftChar) - 1);
				if (targetFreq.containsKey(leftChar) &&
						windowFreq.get(leftChar) < targetFreq.get(leftChar)) {
					matchCount--;
				}
				left++;
			}
		}
		return (minLen == Integer.MAX_VALUE) ? "No such window exists" : s.substring(start, start + minLen);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the main string: ");
		String s = sc.nextLine();
		System.out.print("Enter the pattern string: ");
		String t = sc.nextLine();
		String result = findSmallestWindow(s, t);
		System.out.println("Smallest window: " + result);
	}
}