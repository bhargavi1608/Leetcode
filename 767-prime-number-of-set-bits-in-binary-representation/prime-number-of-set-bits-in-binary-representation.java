class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            String ibin = Integer.toBinaryString(i);
            if(isPrime(ibin)){
                count++;
            }
        }
        return count;
    }
    public static boolean isPrime(String num){
     List<Integer> l = Arrays.asList(2,3,5,7,11,13,17,19);
     int count=0;
     for(char c: num.toCharArray()){
        if(c=='1'){
            count++;
        }
     }
     if(l.contains(count)){
        return true;
     }else{
        return false;
     }
     
    }
}