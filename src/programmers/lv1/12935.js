//https://school.programmers.co.kr/learn/courses/30/lessons/12935

function solution(arr) {
  let answer = [];

  let min = Math.min(...arr);

  for (let i = 0; i < arr.length; i++) {
    if (min === arr[i]) {
      continue;
    }
    answer.push(arr[i]);
  }

  if (answer.length === 0) {
    answer.push(-1);
  }

  return answer;
}
