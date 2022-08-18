
class Solution {
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i+=1) {
            answer[i] = answer[i - 1] + x;
        }
        return answer;
    }
}
