class Solution {
    public boolean solution(int x) {
        int xLength = Integer.toString(x).length();
        int divider = 0;
        int calculateNumber = x;
        int totaldivider = 0;
        for (int i = 0; i < xLength; i += 1) {
            divider = calculateNumber % 10;
            totaldivider += divider;
            calculateNumber = (calculateNumber - divider) / 10;
        }
        boolean answer = true;
        answer = x % totaldivider == 0;

        return answer;
    }
}
