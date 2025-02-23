// https://school.programmers.co.kr/learn/courses/30/lessons/12911

function solution(n) {
  let answer = n + 1;

  while (true) {
    const answerToBinary = answer.toString(2);
    const nToBinary = n.toString(2);

    const answerCount = answerToBinary.split("").filter((v) => Number(v) === 1);
    const nCount = nToBinary.split("").filter((v) => Number(v) === 1);

    if (nCount.length === answerCount.length) {
      return answer;
    }
    answer++;
  }

  return answer;
}
