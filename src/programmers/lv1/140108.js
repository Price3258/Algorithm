// https://school.programmers.co.kr/learn/courses/30/lessons/140108

function solution(s) {
  var answer = 0;
  let sameCount = 0;
  let firstChar = s[0];
  let diffCount = 0;

  for (let i = 0; i < s.length; i++) {
    if (sameCount === 0) {
      // 새로운 기준 문자 설정
      firstChar = s[i];
    }

    if (s[i] === firstChar) {
      sameCount++;
    } else {
      diffCount++;
    }

    if (sameCount === diffCount) {
      // 나눌 수 있는 지점
      answer++;
      sameCount = 0;
      diffCount = 0; // 초기화
    }
  }
  if (sameCount > 0) {
    // 마지막 문자열이 남아 있는 경우 한 번 더 증가
    answer++;
  }
  return answer;
}
