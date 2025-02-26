// https://school.programmers.co.kr/learn/courses/30/lessons/138477

function solution(k, score) {
  var answer = [];
  let hallOfFame = [];
  for (let i = 0; i < score.length; i++) {
    hallOfFame.push(score[i]);
    hallOfFame = hallOfFame.sort((a, b) => b - a).slice(0, k);
    answer.push(hallOfFame[hallOfFame.length - 1]);
  }

  return answer;
}
/*
처음 시작 후 k 까지는 모든 사람이 명전
k 다음부터는 기존 명전 보다 높으면 명전 갱신 
k 순위 까지 명전임. 

*/
