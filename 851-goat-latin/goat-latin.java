class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder sb=new StringBuilder();
        String[] parts=sentence.split("\\s+");
        ArrayList <Character> vowels=new ArrayList<>(Arrays.asList('a','e','i','o','u'));
        for(int i=0;i<parts.length;i++){
            char c=Character.toLowerCase(parts[i].charAt(0));
            if(vowels.contains(c)){
                sb.append(parts[i]).append("ma").append("a".repeat(i+1)).append(" ");
            }else{
                sb.append(parts[i].substring(1)).append(parts[i].charAt(0)).append("ma").append("a".repeat(i+1)).append(" ");
            }
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}