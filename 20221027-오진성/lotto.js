
export function noDelete(lotto,win_nums){
    const noDeleteNumber = lotto.filter(e => e !== 0);
    
    const inculdeNumbers = noDeleteNumber.filter(e => win_nums.includes(e));

    return inculdeNumbers;
}

export function deleteNumber(lotto){
    const deleteNumber = lotto.filter(e => e === 0);

    return deleteNumber;
}

export function makePlace(rightNumbers){
   const place = 7-rightNumbers === 7 ? 6 : 7-rightNumbers;
   return place;
}

export default function solution(lottos, win_nums) {
    const noDeleteIncludeNumbers = noDelete(lottos,win_nums);

    const deleteNumbers = deleteNumber(lottos)

    var answer = [makePlace(noDeleteIncludeNumbers.length+deleteNumbers.length),makePlace(noDeleteIncludeNumbers.length)];

    return answer;
}