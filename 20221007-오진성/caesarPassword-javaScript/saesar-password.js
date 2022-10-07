
    const change = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']; 

   function getIndex(letter){
       return change.indexOf(letter);
   }

   function findLetter(letter,number){
    if(letter === ' '){
        return ' ';
    }   

    const newNumber = getIndex(letter.toLowerCase())+number <= 25 ? getIndex(letter.toLowerCase())+number 
    : getIndex(letter.toLowerCase())+number-26 ;

       return letter.toLowerCase() === letter ? change[newNumber] : change[newNumber].toUpperCase();
   }

function solution(s, n) {
    console.log(s.split('').map((letter) => findLetter(letter,n)).reduce((acc,crr) => acc + crr , ''));
    
    return s.split('').map((letter) => findLetter(letter,n)).reduce((acc,crr) => acc + crr , '');
}

solution("h jaEqW",3);
