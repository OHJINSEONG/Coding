class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};

        if (arr.length == 1) {
            answer = new int[]{-1};
            return answer;
        }

        answer = new int[arr.length - 1];
        int minimum = arr[0];

        for (int i = 0; i < arr.length; i += 1) {
            if (minimum > arr[i]) {
                minimum = arr[i];
            }
        }

        int j = 0;
        for (int i = 0; i < arr.length; i += 1) {
            if (minimum == arr[i]) continue;
            answer[j] = arr[i];
            j += 1;
        }

        return answer;
    }
}
