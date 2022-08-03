class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = n - 1; i > 1; i -= 1) {
            if ((n - 1) % i == 0) {
                answer = i;
            }
        }

        return answer;
    }
}
