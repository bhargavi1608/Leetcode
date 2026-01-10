class Solution {
    public int findNumbers(int[] nums) {
        int EvenCount=0;
        for(int i=0;i<nums.length;i++){
            int count = noOfDigits(nums[i]);
            if(count%2==0){
                EvenCount++;
            }
        }
        return EvenCount;
    }
    public int noOfDigits(int num){
        int count=0;
        while(num>0){
            int digit = num%10;
            num/=10;
            count++;
        }
        return count;
    }
}