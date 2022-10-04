function solution(n)
{
    let answer = 0;
    
    n.toString().split('').map((element) => Number(element))
    .forEach(element => {
        answer += element
    });;
    

    return answer;
}