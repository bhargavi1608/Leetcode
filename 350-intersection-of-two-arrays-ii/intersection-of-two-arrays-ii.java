class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int num:nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:nums2){
            if(map.containsKey(num) && map.get(num)>0){
                arr.add(num);
                map.put(num,map.get(num)-1);
            }
        }
        int[] res = new int[arr.size()];
        for(int i=0;i<res.length;i++){
            res[i]=arr.get(i);
        }
        return res;
        
    }
}