class Solution {
    public String solution(String phone_number) {
        String answer= phone_number.substring(phone_number.length()-4);
        String stars= "*".repeat(phone_number.length()-4);
           
        answer= stars+answer;
        return answer;
    }
}