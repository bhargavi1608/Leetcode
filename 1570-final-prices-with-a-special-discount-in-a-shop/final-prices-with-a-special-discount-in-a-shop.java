class Solution {
    public int[] finalPrices(int[] prices) {
        int[] res = prices.clone();
        Deque<Integer> stack = new ArrayDeque<>();
        for(int j=0;j<prices.length;j++){
            while(!stack.isEmpty() && prices[j]<=prices[stack.peek()]){
                res[stack.pop()]-=prices[j];
            }
            stack.push(j);
        }
        return res;
    }
}