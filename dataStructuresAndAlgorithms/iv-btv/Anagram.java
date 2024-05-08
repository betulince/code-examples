import java.util.*;

/*Given an array of words and an array of sentences, determine which words are anagrams of each other. 
Calculate how many sentences can be created by replacing any word with one of its anagrams.

Example

wordSet = ['listen', 'silent', 'it', 'is'] 
sentence ='listen it is silent'

Determine that listen is an anagram of silent. Those two words can be replaced with their anagrams. The four sentences that can be created are:

- listen it is silent
- listen it is listen
- silent it is silent
- silent it is listen

Returns:

int[]: an array of m integers that denote the number of sentences that can be formed from each sentence
 */
public class Anagram {
    public static List<Long> countSentences(List<String> wordSet, List<String> sentences) {
        // Create a HashMap to store sorted versions of words and their corresponding words
        Map<String, List<String>> anagramsMap = new HashMap<>();
        for (String word : wordSet) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            anagramsMap.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }
        
        // Calculate the number of sentences that can be formed
        List<Long> counts = new ArrayList<>();
        for (String sentence : sentences) {
            long replacements = countReplacements(anagramsMap, sentence);
            counts.add(replacements);
        }
        return counts;
    }

    private static long countReplacements(Map<String, List<String>> anagramsMap, String sentence) {
        long replacements = 1; // Start with 1 to include the original sentence
        String[] words = sentence.split(" ");
        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            if (anagramsMap.containsKey(sortedWord)) {
                replacements *= anagramsMap.get(sortedWord).size();
            }
        }
        return replacements;
    }

    public static void main(String[] args) {
        List<String> wordSet = Arrays.asList("listen", "silent", "it", "is");
        List<String> sentences = Arrays.asList("listen it is silent", "hello world");

        List<Long> result = countSentences(wordSet, sentences);
        System.out.println(result);
    }
}