class Solution {
    public long solution(int[] absolutes, boolean[] signs) {
        long answer = 0;
        for (int i = 0; i < absolutes.length; i += 1) {
            if (signs[i]) {
                answer += absolutes[i];
                continue;
            }
            answer -= absolutes[i];
        }
        return answer;
    }
}
