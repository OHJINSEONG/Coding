class Solution {
    public int solution(int n) {
        int answer = 0;

        int[] numbers = new int[n + 1];
        if (n >= 2 && n <= 1000000) {

            for (int i = 2; i <= n; i += 1) {
                if (numbers[i] == 0) {
                    answer+=1;
                    for (int j = i; j <= n; j = j + i)
                        numbers[j] = 1;
                }
            }
        }
        return answer;
    }
}
