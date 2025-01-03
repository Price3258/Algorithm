const CustomSet = require("../src/lib/CustomSet");

it("custom set test", () => {
    const setA = new CustomSet([1,2,3,4]);
    const setB = new CustomSet([1,2,5,6]);

    expect(setA.union(setB)).toStrictEqual(new CustomSet([1,2,3,4,5,6]));
    expect(setA.intersection(setB)).toStrictEqual(new CustomSet([1,2]));
    expect(setA.difference(setB)).toStrictEqual(new CustomSet([3,4]));
    expect(setB.difference(setA)).toStrictEqual(new CustomSet([5,6]));
    expect(setA.isSubsetOf(setB)).toBe(false);
 
})

it("normal set test",()=> {
    const a = new Set([1, 2, 3]);
    const b = new Set([2, 3, 4]);

    // 합집합
    const union = new Set([...a, ...b]);
    expect(union).toStrictEqual(new Set([1,2,3,4]));

    // 교집합
    const intersection = new Set([...a].filter(x => b.has(x)));
    expect(intersection).toStrictEqual(new Set([2,3]));


    // 차집합
    const difference = new Set([...a].filter(x => !b.has(x)));
    expect(difference).toStrictEqual(new Set([1]));


    // 대칭차집합
    const symmetricDifference = new Set(
    [...a].filter(x => !b.has(x)).concat([...b].filter(x => !a.has(x)))
    );
    expect(symmetricDifference).toStrictEqual(new Set([1,4]));
})