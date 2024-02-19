package dataStructuresAndAlgorithms.greedyAlgorithm;

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // we have only one most desirable solution
        // 1. greedy O(n)
        // 2. brute force, then choose the best one -> time complexity could be less efficient O(n^2)
        // calculate every possible solution and choose the best one among all positive results
        // if there is no positive result then return -1 
        // for me to go from one gas station to another one the current gas status > the cost

        int totalGas = 0;
        int totalCost = 0;

        for (int i=0; i<gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }

        if (totalGas < totalCost) {
            return -1;
        } 

        int total = 0;
        int index = 0;

        for (int i=0; i<gas.length; i++) {
            total += (gas[i] - cost[i]); // add difference to the total
            if (total < 0) { // we're being greedy; this position didn't work set total back to 0 and try the next position
                total = 0;
                index = i+1; // so it means that we continue changing the index until total gets bigger than or equals to 0 for the first time
            }
        }
        return index;

    }

}