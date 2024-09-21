import java.util.*;

class Solution {
    public String solution(int[] food) {
        
        String answer = "";
        List<Integer> list= new ArrayList();
        
        for (int i=1; i< food.length; i++){
            if (food[i]%2!=0){
                food[i]-=1;
            }
            food[i]/=2;
            System.out.println(food[i]);
        }
        
        
        for (int i=1; i<food.length;i++){
            for (int j=0; j<food[i]; j++){
                list.add(i);
            }
        }
        list.add(0);
        
        for( int i=food.length-1; i>=1; i--){
            for(int j=0; j<food[i]; j++){
                list.add(i);
            }
        }
        
        StringBuilder s= new StringBuilder();
        for (int num : list) {
            s.append(num);
        }
        answer= s.toString();
        return answer;
    }
}