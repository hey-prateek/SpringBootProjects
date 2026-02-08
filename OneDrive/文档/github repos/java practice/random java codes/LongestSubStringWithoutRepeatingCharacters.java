// Given a string s, find the length of the longest substring without
// repeating characters.

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str="heyprateek";

        System.out.print(longestSubstring(str));
    }
    static int longestSubstring(String s)
    {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            //If the new character already exists in the substring, we shrink the window from the left until the duplicate is removed
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
        
    }
}
