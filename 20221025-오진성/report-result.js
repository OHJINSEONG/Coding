function findBlock(arr,k,id_list){
    
}


function solution(id_list, report, k) {
    const uniqueArr = report.filter((e, i) => {
        return report.indexOf(e) === i;
    });

    const mailCount = [...Array(id_list.length)].fill(0);
    
    const arr =uniqueArr.map(e => e.split(" ")[1]);

    const result = {};
        arr.forEach((x) => { 
        result[x] = (result[x] || 0)+1; 
    });
  
    const arr2 = id_list.filter(e => result[e] >= k)

    const arr4 = uniqueArr.filter(e => arr2.includes(e.split(" ")[1])).map(e => id_list.indexOf(e.split(" ")[0]))

    const result2 = {};
        arr4.forEach((x) => { 
        result2[x] = (result2[x] || 0)+1; 
    });

    const answer = mailCount.map((e,i) => result2[i] || 0)
    
    console.log(answer);

    return answer;
}
