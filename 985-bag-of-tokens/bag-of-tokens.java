class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score=0;
        int maxScore=0;
        int left=0;
        int right=tokens.length-1;
        while(left<=right){
            if(tokens[left]<=power){
                score+=1;
                maxScore=Math.max(maxScore,score);
                power-=tokens[left];
                left++;
            }else if(score>=1){
                power+=tokens[right];
                score--;
                right--;
            }else{
                break;
            }
        }
        return maxScore;
    }
}