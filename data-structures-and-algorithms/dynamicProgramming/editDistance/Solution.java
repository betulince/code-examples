class Solution {
    public int minDistance(String word1, String word2) {

        // we are not going to change word2

        if (word1.equals(word2)) {
            return 0;
        }

        if (word1.isEmpty()) {
            return Math.max(word1.length(), word2.length());
        }

        final int m = word1.length();
        final int n = word2.length();

        int wordMatrix[][] = new int[m+1][n+1]; // +1 to handle the base cases, where either of the words is empty

        for (int i = 0; i <= m; i++) {
            wordMatrix[i][0] = i;
        }

        for (int j = 0; j <= n; j++) {
            wordMatrix[0][j] = j;
        }

        for (int i = 1; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    wordMatrix[i][j] = wordMatrix[i-1][j-1];
                } else {
                    wordMatrix[i][j] = Math.min(wordMatrix[i-1][j-1], Math.min(wordMatrix[i-1][j], wordMatrix[i][j-1])) + 1;
                }
            }
        }

        return wordMatrix[m][n];

    }
}