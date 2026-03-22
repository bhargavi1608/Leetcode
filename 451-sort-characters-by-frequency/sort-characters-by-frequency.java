class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>((a,b) -> a.getValue()-b.getValue());
       pq.addAll(map.entrySet());
       StringBuilder sb = new StringBuilder();
       while(!pq.isEmpty()){
          Map.Entry<Character,Integer> e = pq.poll();
          char key = e.getKey();
          int val = e.getValue();
          sb.append(String.valueOf(key).repeat(val));
       }
       return sb.reverse().toString();
    }
}