class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=sumOfDivisor(nums[i]);
        }
        return sum;
    }
    public int sumOfDivisor(int num){
        int sum=0;
        int count=0;
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                count++;
                sum+=i;

                if(i!=num/i){
                    count++;
                    sum+=num/i;
                }
            }
        }
       return  count==4 ? sum : 0;
    }

}