class Solution {
    public int solution(int n) {
        int answer = 0;
        int num=n;
        int min;
        while(true){
            min= n%num;
            if (min==1){
                answer= num;
            }
            num--;
            if (num==0){
                break;
            }
        }
        return answer;
    }
}