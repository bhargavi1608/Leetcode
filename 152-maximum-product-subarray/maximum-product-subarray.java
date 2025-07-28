class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxSofar = nums[0];
        int maxEndingHere = nums[0];
        int minEndingHere = nums[0];
        
        for(int i=1;i<=n-1;i++){
            int current = nums[i];
            int tempMax= maxEndingHere;
            maxEndingHere = Math.max(current,Math.max(current*maxEndingHere,current*minEndingHere));
            minEndingHere= Math.min(current,Math.min(current*tempMax,current*minEndingHere));
            maxSofar= Math.max(maxSofar,maxEndingHere);
        }
        return maxSofar;
    }
}