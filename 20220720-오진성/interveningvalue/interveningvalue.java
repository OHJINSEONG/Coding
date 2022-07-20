class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if (a >= -10000000 && a <= 10000000 && b >= -10000000 && b <= 10000000) {
            if (a >= b) {
                for (int i = b; i <= a; i += 1) {
                    answer += i;
                }
            }

            if (b > a) {
                for (int i = a; i <= b; i += 1) {
                    answer += i;
                }
            }
        }
        return answer;
    }
}
