function solution(n) {
    let answer = 0;
    let now = 1, count = 1, plusNum = 0;
  
    while(count <= n) {
      plusNum = plusNum + now;
      if(plusNum >= n) {
        if(plusNum === n) answer+=1;
        plusNum = 0;
        count+=1;
        now = count;
      } else {
        now++;
      }
    }
  
    return answer;
  }
