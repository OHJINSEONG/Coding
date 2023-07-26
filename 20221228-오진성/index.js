function gameIndex({playerIndex}){
    const gameIndex = playerIndex % 2 === 0 ? playerIndex / 2 : Math.floor(playerIndex / 2) + 1
    return gameIndex
}

function matchingRound({playerIndex1, playerIndex2, count = 0}){
    if(playerIndex1 === playerIndex2){
        return {round: count}
    }

    return matchingRound({
        playerIndex1: gameIndex({playerIndex: playerIndex1}), 
        playerIndex2: gameIndex({playerIndex: playerIndex2}), 
        count : count + 1
    })
}

function solution(n, a, b){
    const {round}= matchingRound({playerIndex1: a, playerIndex2:b})

    return round;
}