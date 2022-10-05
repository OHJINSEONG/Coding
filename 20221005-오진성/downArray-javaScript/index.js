function solution(n) {
    var answer = '';
    let arr = n.toString().split('')
    arr.sort(function(a, b)  {
      return b - a;
    });
    arr.forEach(element => {
        answer += element
    });
    return +answer;
}
