class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i += 1) {
            for (int j = 2; j <= i; j += 1) {
                if (i % j == 0) {
                    if (i == j) {
                        answer += 1;
                    }
                    break;
                }
            }
        }

        return answer;
    }
}