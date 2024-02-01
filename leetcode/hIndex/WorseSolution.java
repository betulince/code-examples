class Solution {
    public int hIndex(int[] citations) {

        int hIndex = 0;

        Arrays.sort(citations);

        int count = 0;

        for (int i = citations.length-1; i >= 0; i--) {
            count++;
            if(citations[i] >= count){
                hIndex = count;
            }
        }
        return hIndex;
    }

}