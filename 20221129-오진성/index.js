function solution(s) {
    const words = s.split(' ');

    const max = words.reduce((max,val) => Number(max) > Number(val) ? max : val)

    const min = words.reduce((min,val) => Number(min) < Number(val) ? min : val)

    const answer = min + ' ' + max;
    
    console.log(max);

    return answer;
}

solution("-1 -2 -3 -4")
 