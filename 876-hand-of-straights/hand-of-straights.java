class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0) return false;

        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int num:hand){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        while(!map.isEmpty()){
            int start = map.firstKey();
            for(int i=0;i<groupSize;i++){
                int current = start+i;
                if(!map.containsKey(current)){
                    return false;
                }
                map.put(current,map.get(current)-1);
                if(map.get(current)==0){
                    map.remove(current);
                }
            }
        }
        return true;
    }
}