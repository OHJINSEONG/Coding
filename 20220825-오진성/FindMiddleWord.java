class Solution {
    public String solution(String s) {
        String answer = "";
        if (s.length() % 2 == 0) {
            int length = s.length() / 2;
            answer = s.substring(length - 1, length + 1);
        }

        if (s.length() % 2 == 1) {
            int length = s.length() / 2;
            answer = s.substring(length, length + 1);
        }

        return answer;
    }
}
