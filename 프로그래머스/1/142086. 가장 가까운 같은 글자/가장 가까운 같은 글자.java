import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        
        char[] str= new char[s.length()];
        answer=new int[str.length];
        for (int i=0; i<str.length; i++){
            str[i]= s.charAt(i);
            answer[i]=(-1);
        }
        
        
        for (int i=0; i<str.length; i++){
            for (int j=0; j<i; j++){
                if (str[i]==str[j]){
                    answer[i]=i-j;
                }
            }
        }
        
        return answer;
    }
}