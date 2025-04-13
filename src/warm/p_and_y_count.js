/*
문자열 내 p와 y의 개수

문자열 s에서 'p'의 개수와 'y'의 개수를 비교해서 같으면 true, 다르면 false를 반환해라
대소문자 구분은 하지 않음. 둘 다 하나도 없으면 true
*/

function solution(s) {
  let pCount = 0;
  let yCount = 0;

  for (let i = 0; i < s.length; i++) {
    if (s[i].toLowerCase() === "y") {
      yCount++;
    }
    if (s[i].toLowerCase() === "p") {
      pCount++;
    }
  }

  return pCount === yCount;
}

let s1 = "pPoooyY"; // true (p:2, y:2)
let s2 = "Pyy"; // false (p:1, y:2)

console.log(solution(s1)); // true
console.log(solution(s2)); //false
