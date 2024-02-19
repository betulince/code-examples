package datastructuresandalgorithms.ransomNote;

import java.util.HashMap;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1); // if the char already exist then we will increment the count by 1.
            } else {
                charCount.put(c, 1); // if the char doesn't exist then the count of that char will be 1 
            }
        }

        for (char c : ransomNote.toCharArray()) {
            if(charCount.containsKey(c) && charCount.get(c) > 0) {
                charCount.put(c, charCount.get(c) - 1); // if the character is present and the count is more than 0, then we found at least one element that we need - so decrement the value by one 
            } else { // if the character is not there it means we cannot construct ransomNote using letters from magazine
                return false;
            }
        }
        return true;
    }
}