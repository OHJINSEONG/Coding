function toLetters({element}){
    return element.split(',')
}

function sort({elements}){
    return elements.sort((a, b) => a.length - b.length)
}

function store({elements}){
    const set = new Set()

    elements.reduce((acc, curArray) => (
        [...acc, ...curArray]
    ),[])
    .map(element => +element)
    .forEach(element => set.add(element))

    return [...set]
}

function solution(s){
    const elements = s.substring(2, s.length-2).split('},{')
                .map(element => toLetters({element}))

    const sorted = sort({elements})

    const stored = store({elements: sorted})

    return stored
}