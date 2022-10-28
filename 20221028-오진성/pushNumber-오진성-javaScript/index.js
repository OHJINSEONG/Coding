const numberPosition ={
    1 : '1 1',
    2 : '2 1',
    3 : '3 1',
    4 : '1 2',
    5 : '2 2',
    6 : '3 2',
    7 : '1 3',
    8 : '2 3',
    9 : '3 3',
    0 : '2 4',
}

function findHand(number,hand,handPosition){
     const curNumber = numberPosition[number];
     const numberCoordinate = numberPosition[number].split(' ');
     const rightCoordinate = handPosition['R'].split(' ');
     const leftCoordinate = handPosition['L'].split(' ');
    
     const rightDistance = Math.abs(Number(numberCoordinate[0])-Number(rightCoordinate[0])) + Math.abs(Number(numberCoordinate[1])-Number(rightCoordinate[1]))
     const leftDistance = Math.abs(Number(numberCoordinate[0])-Number(leftCoordinate[0])) + Math.abs(Number(numberCoordinate[1])-Number(leftCoordinate[1]))

     console.log(handPosition['L']);

     if(number === 1 || number === 4 || number === 7){
        handPosition['L']=curNumber;
        return 'L'
     }
     if(number === 3 || number === 6 || number === 9){
        handPosition['R']=curNumber;
        return 'R'
     }
     if(rightDistance > leftDistance){
        handPosition['L']=curNumber;
        return 'L'
     }
     if(rightDistance < leftDistance){
        handPosition['R']=curNumber;
        return 'R'
     }
     if(hand == 'right'){
        handPosition['R']=curNumber;
        return 'R'
     }
     handPosition['L']=curNumber;
     return 'L'
}

function solution(numbers, hand) {
    const handPosition ={
        'L' : '1 4',
        'R' : '3 4',
    }

    const arr = numbers.map(e => findHand(Number(e),hand,handPosition)).reduce((arr,cur) => arr + cur ,'') 

    const number = numberPosition[2].split(' ');

    return arr;
}
