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