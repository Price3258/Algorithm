/*
  실전 문제: 완주하지 못한 선수

  마라톤에 참여한 선수들의 이름이 담긴 배열 participant와
  완주한 선수들의 이름이 담긴 배열 completion이 주어진다.
  단 한 명의 선수를 제외하고는 모두 완주했다.
  완주하지 못한 선수의 이름을 리턴하라.

  🧩 조건
	•	참가자 수는 1 이상 100,000 이하
	•	참가자 이름은 1개 이상 20개 이하의 문자열
	•	동명이인이 있을 수 있음
*/

function solution(participant, completion) {
  const hashMap = {};

  for (const name of participant) {
    hashMap[name] = (hashMap[name] || 0) + 1;
  }

  for (const name of completion) {
    hashMap[name] -= 1;
  }

  for (const name in hashMap) {
    if (hashMap[name] > 0) return name;
  }
}

let participant1 = ["leo", "kiki", "eden"];
let completion1 = ["eden", "kiki"]; // leo

let participant2 = ["mario", "luigi", "mario"];
let completion2 = ["luigi", "mario"]; // mario

console.log(solution(participant1, completion1)); //leo
console.log(solution(participant2, completion2)); //mario
