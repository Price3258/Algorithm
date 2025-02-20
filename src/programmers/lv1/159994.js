//https://school.programmers.co.kr/learn/courses/30/lessons/159994

function solution(cards1, cards2, goal) {
  var answer = "No";

  while (goal.length !== 0) {
    const word = goal.shift();
    const cards1Word = cards1[0];
    const cards2Word = cards2[0];
    if (word === cards1Word) {
      cards1.shift();
    } else if (word === cards2Word) {
      cards2.shift();
    } else {
      answer = "No";
      break;
    }
    answer = "Yes";
  }

  return answer;
}
