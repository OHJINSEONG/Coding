class Solution {
    public long solution(long n) {
        long answer = 0;
        int ceilSquareRoot = (int) Math.ceil(Math.sqrt(n));
        int floorSquareRoot = (int) Math.floor(Math.sqrt(n));

        for (int i = floorSquareRoot; i <= ceilSquareRoot; i += 1) {
            if (n / i == i && n % i == 0) {
                return answer = (long) Math.pow((i + 1), 2);
            }
        }
        return answer = -1;
    }
}
