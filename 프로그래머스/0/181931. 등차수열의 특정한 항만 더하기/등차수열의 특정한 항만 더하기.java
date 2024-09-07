class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        if (included[0]) answer=a;
        for (int i = 1; i < included.length ; i++) {
            if (included[i]) {
                answer += a + d * i;
            }
        }
        return answer;
    }
}