class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(true){
            int k= n/a*b;
            int rest= n%a;
            n-= rest;
            answer+= k;
            System.out.println("answer="+answer);
            n=  k+rest;
            if (n<a ){
                break;
            }
        }
        return answer;
    }
}