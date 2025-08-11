class Solution {
    public int[] productQueries(int n, int[][] queries) {
        
        ArrayList<Integer> power = new ArrayList<>();
        String bin = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder(bin);
        sb.reverse();
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='1'){
                power.add((int)Math.pow(2,i));
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
         final int MOD = 1_000_000_007;
        for(int i=0;i<queries.length;i++){
            int a = queries[i][0];
            int b = queries[i][1];
            int prod=1;
            for(int j=a;j<=b;j++){
               prod = (int)((prod * 1L * power.get(j)) % MOD);

            }
            res.add(prod);
        }
        int[] res1 = new int[res.size()];
        for(int i=0;i<res.size();i++){
            res1[i]=res.get(i);
        }
        return res1;

    }
}