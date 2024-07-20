import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int chooseNumber = nums.length/2;
        int findNumber = Arrays.stream(nums).distinct().toArray().length;

        return Math.min(findNumber, chooseNumber);
    }
}