class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i += 1) {
            answer = Math.sqrt(i) % 1 == 0 ? answer - i : answer + i;
        }
        return answer;
    }
}
