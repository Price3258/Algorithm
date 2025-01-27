/*
Q. 다음과 같이 영어로 되어 있는 문자열이 있을 때, 이 문자열에서 반복되지 않는 첫번째 문자를 반환하시오. 만약 그런 문자가 없다면 _ 를 반환하시오.
"abadabac" # 반복되지 않는 문자는 d, c 가 있지만 "첫번째" 문자니까 d를 반환해주면 됩니다!
*/

function solution(arr) {
  const table = {};
  for (const char of arr) {
    if (table[char]) {
      table[char] += 1;
    } else {
      table[char] = 1;
    }
  }
  tableKeys = Object.keys(table);

  for (key of tableKeys) {
    if (table[key] == 1) {
      return key;
    }
  }

  return "_";
}

console.log("정답 = d 현재 풀이 값 =", solution("abadabac"));
console.log("정답 = c 현재 풀이 값 =", solution("aabbcddd"));
console.log("정답 = a 현재 풀이 값 =", solution("adddddd"));
console.log("정답 =_ 현재 풀이 값 =", solution("aaaaaaaa"));
