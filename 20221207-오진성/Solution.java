public class Solution {
    public int solution(int n) {
        int answer = 0;
        int plusIndex = 0;

        for (int i = 1; i <= n; i += 1) {
            for (int j = 1; j <= n; j += 1) {
                int accumulator = 0;
                accumulator = i * j + plusIndex;

                if (accumulator == n) {
                    answer += 1;
                    break;
                }

                if (accumulator > n) {
                    break;
                }
            }
            plusIndex += i;
            if (plusIndex + i > n) {
                break;
            }
        }

        return answer;
    }
}
