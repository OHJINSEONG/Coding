class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = arr1;

        for (int i = 0; i < answer.length; i += 1) {
            for (int j = 0; j < answer[0].length; j += 1) {
                answer[i][j] += arr2[i][j];
            }
        }

        return answer;
    }
}
