class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int length= t.length()-p.length()+1;
        Long pNum= Long.parseLong(p);
        
        for (int i=0; i<length; i++){
            String str = t.substring(i,i+p.length());
            Long strNum = Long.parseLong(str);
            if (strNum <= pNum){
                answer++;
            }
        }
        
        return answer;
    }
}

