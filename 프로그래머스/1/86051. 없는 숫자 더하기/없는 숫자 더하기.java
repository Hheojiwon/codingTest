import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int sum=0;
        for (int i=0; i<10; i++){
            answer+=i;
        }
    
        for (int i=0; i< numbers.length; i++){
            for (int j=0; j<10; j++){
                if (numbers[i]==j){
                    sum+=j;
                }
            }
        }
        answer-=sum;
        return answer;
    }
}