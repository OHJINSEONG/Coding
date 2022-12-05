class Solution {
    public int[] solution(String s) {
        int zeroCount = 0;
        int changeCount = 0;

        boolean a = true;

        while (a) {
            int beforeLength = s.length();

            s = s.replaceAll("0", "");

            zeroCount += beforeLength - s.length();

            s = Integer.toBinaryString(s.length());

            System.out.println(a);

            changeCount += 1;

            if (s.equals("1")) {
                a = false;
            }
        }

        int[] answer = {changeCount,zeroCount};
        return answer;
    }
}