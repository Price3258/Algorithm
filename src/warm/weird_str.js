/*
 문제: 이상한 문자 만들기

문자열 s는 단어별로 나뉘어 있음 (띄어쓰기로 구분)
각 단어에서 짝수 인덱스는 대문자, 홀수 인덱스는 소문자로 변환한 문자열을 리턴하라
단어의 인덱스는 공백을 기준으로 새로 시작됨

*/

function solution(s) {
  const splited = s.split(" ");
  let answer = splited
    .map((word) => {
      let newWord = "";
      for (let i = 0; i < word.length; i++) {
        newWord += i % 2 === 0 ? word[i].toUpperCase() : word[i].toLowerCase();
      }
      return newWord;
    })
    .join(" ");

  return answer;
}

const s1 = "try hello world";

console.log(solution(s1)); // "TrY HeLlO WoRlD"
console.log(solution(s1) === "TrY HeLlO WoRlD"); // "TrY HeLlO WoRlD"
