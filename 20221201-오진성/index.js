function transfer(word,isTrue){
    if(word !== ' '){
        isTrue = false;
    }
    
    if(word === ' '){
        isTrue = true;
    }
    

    return isTrue ? word.toUpperCase() : word.toLowerCase()
}

function solution(s) {
    const firstChar = s.charAt(0).toUpperCase();
    const other = s.slice(1).toLowerCase();
    const word = firstChar + other
    const words = word.split('');
    const isTrue = true;
    
    const answer = words.map((word,i)=> words[i-1]=== ' ' ? words[i] = words[i].toUpperCase()
    : word).reduce((acc,curr) => acc + curr)
    
    console.log(answer);

    return answer;
}

solution('people unFollowed me')
