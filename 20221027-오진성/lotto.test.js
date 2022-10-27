
import solution,{noDelete,deleteNumber,makePlace} from './lotto'

test('lotto' , () => {
    expect(solution([1,0,3,4,0,10],[2,10,20,30,3,4])).toStrictEqual([2,4])
})

test('noDelete' , () => {
    expect(noDelete([1,0,3,4,2,10],[1,0,2,40,30,20])).toStrictEqual([1,2])
})

test('deleteNumber' , () => {
    expect(deleteNumber([1,0,0,0,0,0])).toStrictEqual([0,0,0,0,0])
})

test('makePlace' , () => {
    expect(makePlace(6)).toBe(1)
})

test('makePlace' , () => {
    expect(makePlace(0)).toBe(6)
})

