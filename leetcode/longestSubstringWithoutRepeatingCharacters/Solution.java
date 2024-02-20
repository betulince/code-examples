package leetcode.longestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;

public  class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if (s.length() == 1) {
            return 1;
        }

        if (s.length() == 0) {
            return 0;
        } 

        HashSet<Character> substring = new HashSet<>();
        int left = 0;
        int max = 0;
        for (int right = 0; right < s.length(); right++) {
            if (!substring.contains(s.charAt(right))) {
                substring.add(s.charAt(right));
                max = Math.max(max, right - left + 1);
            } else {
                while (substring.contains(s.charAt(right))) {
                    substring.remove(s.charAt(left));
                    left++;
                }
                substring.add(s.charAt(right));
            }
        }
        return max;
    }
}
