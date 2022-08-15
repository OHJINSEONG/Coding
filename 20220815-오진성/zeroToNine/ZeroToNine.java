class Solution {
    public int solution(int[] numbers) {
        int sum = 0;

        int[] zeroToNine = new int[]{0,1,2,3,4,5,6,7,8,9};

        for(int num : zeroToNine ){
            sum += num;
        }
        int answer = sum;


        for(int num : numbers){
            answer -= num;
        }

        return answer;
    }
}
