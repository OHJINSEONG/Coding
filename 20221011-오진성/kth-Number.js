function solution(array, commands) {
    const answer= commands.map((element)=> element[0]===element[1] ? array[element[0]-1]
    : array.slice(element[0]-1,element[1]).sort((a,b) => a - b)[element[2]-1])
     return answer;
}
