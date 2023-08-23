function solution(s) {
    let answer = 0;
    let stack = [];
  ㅤ
    for (let i = 0; i < s.length; i++) {
      if (stack[stack.length - 1] === s.charAt(i)) {
        stack.pop();
      } else {
        stack.push(s.charAt(i));
      }
    }
  ㅤ
    answer = stack.length === 0 ? 1 : 0;
    return answer;
  }