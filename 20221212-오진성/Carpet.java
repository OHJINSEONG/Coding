class Solution {
    public int[] solution(int brown, int yellow) {

        int width = 0;
        int height = 0;
        for (int i = 0; i < brown; i += 1) {
            for (int j = 0; j < brown; j += 1) {
                if (2 * i + 2 * (j - 2) == brown && (i - 2) * (j - 2) == yellow) {
                    if (i >= j) {
                        width = i;
                        height = j;
                    }
                    width = j;
                    height = i;
                    break;
                }
            }
            if (width != 0) {
                break;
            }
        }

        int[] answer = {width, height};
        return answer;
    }
}
