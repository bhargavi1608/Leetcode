class Solution {
    public int countTriples(int n) {
       int count=0;
       for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            int k2 = i*i+j*j;
            int k=(int)Math.sqrt(k2);
            if(k*k==k2 && k<=n){
                count++;
            }
       }
      
    }
     return count;
}
}