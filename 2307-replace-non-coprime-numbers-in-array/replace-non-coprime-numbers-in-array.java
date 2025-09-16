class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int num:nums){
            list.add(num);
            while(list.size()>1){
                long a = list.get(list.size()-1);
                long b = list.get(list.size()-2);
                if(gcd(a,b)>1){
                    list.remove(list.size()-1);
                    list.remove(list.size()-1);
                    long lcmVal = lcm((long) a, (long) b);
                    list.add((int)lcm(a,b));
                }else{
                    break;
                }
            }
        }
        return list;
        }
    
    private long gcd(long x, long y){
        while(y!=0){
            long temp =y;
            y=x%y;
            x=temp;
        }
        return x;
    }
    private long lcm(long x, long y){
        return (x*y)/gcd(x,y);
    }
    
}