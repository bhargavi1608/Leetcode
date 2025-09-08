class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] arr = new int[2];
        for(int a=1;a<n;a++){
           int  b= n-a;
            if(!isContainZero(a) && !isContainZero(b)){
                arr[0]=a;
                arr[1]=b;
            }
            
        }
        return arr;
    }
    public boolean isContainZero(int num){
        while(num>0){
            if(num%10==0){
                return true;
            }
            num/=10;
        }
        return false;
    }
}