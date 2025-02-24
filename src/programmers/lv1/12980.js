// https://school.programmers.co.kr/learn/courses/30/lessons/12980

function solution(n) {
  let answer = 0;

  while (n > 0) {
    if (n % 2 === 1) {
      // 홀수라면 점프
      answer++;
      n--;
    }
    n /= 2; // 짝수면 순간이동
  }

  return answer;
}
