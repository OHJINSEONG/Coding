class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int countP = 0;
        int countY = 0;

        for (int i = 0; i< s.length(); i+=1){
            boolean p = s.substring(i,i+1).equals("p");
            boolean bigP = s.substring(i,i+1).equals("P");

            boolean y = s.substring(i,i+1).equals("y");
            boolean bigY = s.substring(i,i+1).equals("Y");

            if(p || bigP) {
                countP += 1;
            }

            if(y || bigY){
                countY +=1;
            }
        }
        if(countP == countY){
            answer = true;
        }

        if(countP != countY){
            answer = false;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
