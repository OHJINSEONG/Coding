
class Solution {
    public long[] solution(int x, int n) {
        long[] number = new long[n];

        long index = 0;

        for (int i = 0; i < n; i += 1) {
            index += x;

            number[i] = index;
        }
        long[] answer = number;

        return answer;
    }
}
