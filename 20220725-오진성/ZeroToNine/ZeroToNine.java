class Solution {
    public int solution(int[] numbers) {
        int sum = 0;

        int[] zeroToNine = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int num : zeroToNine) {
            sum += num;
        }

        int answer = sum;

        for (int i = 0; i < numbers.length; i += 1) {
            for (int j = 0; j < zeroToNine.length; j += 1) {

                if (numbers[i] == zeroToNine[j]) {
                    answer -= numbers[i];
                }
            }
        }

        return answer;
    }
}
