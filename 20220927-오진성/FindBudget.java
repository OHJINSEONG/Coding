import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for (Integer i : d) {
            budget -= i;
            if (budget < 0) {
                break;
            }

            answer += 1;
        }
        return answer;
    }
}
