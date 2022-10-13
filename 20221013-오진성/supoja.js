const arrays = {
    a : [1,2,3,4,5],
    b : [2,1,2,3,2,4,2,5],
    c : [3,3,1,1,2,2,4,4,5,5],
}

function supoja(answers){
    const answer1 = answers.filter((e,i) => e === arrays.a[i%arrays.a.length]).length
    const answer2 = answers.filter((e,i) => e === arrays.b[i%arrays.b.length]).length
    const answer3 = answers.filter((e,i) => e === arrays.c[i%arrays.c.length]).length

    const answerArray = [ answer1, answer2, answer3 ] 

    const max = Math.max(...answerArray);
    
    const genius = [1,2,3];

    return genius.filter((e,i) => max === answerArray[i])
}

supoja([1,2,3,4,5])
supoja([1,3,2,4,2])
