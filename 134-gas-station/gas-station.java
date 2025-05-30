class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int currentGas = 0;
        int startIdx = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            currentGas += gas[i] - cost[i];

            if (currentGas < 0) {
                // can't reach station i+1 from current start
                startIdx = i + 1;
                currentGas = 0;
            }
        }

        return totalGas < totalCost ? -1 : startIdx;
    }
}
