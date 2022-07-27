class Solution {
    public String solution(String phone_number) {
        int number = phone_number.length();
        String answer = "";
        for(int i=0 ; i<number;i+=1){
            if(i<(number-4)){
                answer+="*";
                continue;
            }
            answer+= phone_number.charAt(i);
        }


        return answer;
    }
}
