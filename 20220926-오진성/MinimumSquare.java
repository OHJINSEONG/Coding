class Solution {
    public long solution(int[][] sizes) {
        int width = 0;

        int height = 0;
        int height1 = 0;

        for (int i = 0; i < sizes.length; i += 1) {
            if (width < sizes[i][0]) {
                width = sizes[i][0];
            }

            if (height < sizes[i][1]) {
                height = sizes[i][1];
            }

            if (width < height) {
                width = height;
            }

            if (sizes[i][0] <= sizes[i][1]) {
                if (height1 <= sizes[i][0]) {
                    height1 = sizes[i][0];
                }
            }

            if (sizes[i][0] >= sizes[i][1]) {
                if (height1 <= sizes[i][1]) {
                    height1 = sizes[i][1];
                }
            }
        }
        return (long) width * height1;
    }
}