package datastructuresandalgorithms.iv-tt;

import java.util.*;

/*You are given an implementation of a function:

class Solution { public String solution(String S); }

that, given a non-empty string consisting of N lowercase English letters, returns the character which occurs most frequently in the string. If more than one character satisfies this requirement, the function should return the earliest alphabetically. For example, if both c and d are the most frequent letters, then the answer is c.

For example, given a string:

S = "hello"

the function should return "l". It appears twice in S. No other characters appear as frequently.

The attached code is still incorrect for some inputs. Despite the error(s), the code may produce a correct answer for the example test cases. The goal of the exercise is to find and fix the bug(s) in the implementation. You can modify at most four lines.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];

string S is made only of lowercase letters (a-z).

The code should cover all the edge cases. Do it using java 8

class Solution {
    String solution(String S) {
        int [] occurrences = new int [26];
        for (char ch : S.toCharArray()) {
            occurrences [ch - 'a']++;
        }
        char best_char ='a';
        int best_res =0;

        for (int i = 1; i < 26; i++) {
            if (occurrences [i] >= best_res) {
                best_char = (char)((int)'a' + i);
                best_res = occurrences [i];
            }
        }
        return Character.toString(best_char);
    }
}
Do it in the most efficient way

 */
class fixBug {
    String solution(String S) {
        int[] occurrences = new int[26];
        for (char ch : S.toCharArray()) {
            occurrences[ch - 'a']++;
        }
        char best_char = 'a';
        int best_res = -1; // Initialize with -1 to indicate that no character has been found yet.

        for (int i = 0; i < 26; i++) {
            if (occurrences[i] > best_res) {
                best_char = (char) ('a' + i);
                best_res = occurrences[i];
            }
        }
        
        if (best_res == -1) {
            return ""; // Return an empty string if no character has been found more than once.
        }
        
        return Character.toString(best_char);
    }
}
