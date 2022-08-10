class Solution {
    public int solution(long num) {
        int answer = 0;

        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
                answer += 1;
                if (answer >= 500) {
                    answer = -1;
                    break;
                }
                continue;
            }
            if (num % 2 == 1) {
                num = num * 3 + 1;
                answer += 1;
                if (answer >= 500) {
                    answer = -1;
                    break;
                }
                continue;
            }
        }

        return answer;
    }
}
