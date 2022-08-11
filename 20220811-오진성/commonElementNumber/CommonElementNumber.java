class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        int maximumDivider = 0;
        long minmumTimer = 0;
        int index = 1;
        boolean find = true;
        if (n <= m) {
            for (int i = m; i > 0; i -= 1) {
                if (n % i == 0 && m % i == 0) {
                    maximumDivider = i;
                    break;
                }
            }
        }
        if (n > m) {
            for (int i = n; i > 0; i -= 1) {
                if (n % i == 0 && m % i == 0) {
                    maximumDivider = i;
                    break;
                }
            }
        }
        while (find) {
            if (m >= n) {
                if ((index * m) % n == 0) {
                    minmumTimer = index * m;
                    find = false;
                }
            }
            if (m < n) {
                if ((index * n) % m == 0) {
                    minmumTimer = index * n;
                    find = false;
                }
            }
            index += 1;
        }
        answer = new int[]{maximumDivider, (int) minmumTimer};
        return answer;
    }
}